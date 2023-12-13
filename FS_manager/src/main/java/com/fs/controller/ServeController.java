package com.fs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fs.model.DeliveryVO;
import com.fs.model.ManagerVO;
import com.fs.model.StorageVO;
import com.fs.service.DeliveryService;
import com.fs.service.ManagerService;
import com.fs.service.StorageService;

@Controller
public class ServeController {

	private static final Logger logger = LoggerFactory.getLogger(ServeController.class);
	
	@Autowired
	private ManagerService managerservice;
	
	@Autowired
	private StorageService storageService;
	
    /* 로그인 */
    @RequestMapping(value="login", method=RequestMethod.POST)
    public String loginPOST(HttpServletRequest request, ManagerVO manager, RedirectAttributes rttr) throws Exception{
        
        System.out.println("login 메서드 진입");
        System.out.println("전달된 데이터 : " + manager);
        
        HttpSession session = request.getSession();
        ManagerVO lvo = managerservice.managerLogin(manager);
        
       if(lvo == null) {                                // 일치하지 않는 아이디, 비밀번호 입력 경우
            
            int result = 0;
            rttr.addFlashAttribute("result", result);
            return "redirect:/login";
            
        }
        
        session.setAttribute("manager", lvo);             // 일치하는 아이디, 비밀번호 경우 (로그인 성공)
        
        return "redirect:/admin_main";
        
    }
    
    /* 로그아웃 */
    @RequestMapping(value="logout", method=RequestMethod.GET)
    public String logoutMainGET(HttpServletRequest request) throws Exception{

        
        logger.info("logoutMainGET메서드 진입");
        
        HttpSession session = request.getSession();
        session.invalidate();
        
        return "redirect:/login";
    }
    
    //창고 리스트 불러오기
    @RequestMapping(value="getStorage", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<StorageVO>> getStorage(Model model) {
        try {
            List<StorageVO> storageList = storageService.getAllStorage();
            //System.out.println(storageList);
            return new ResponseEntity<>(storageList, HttpStatus.OK);
        } catch (Exception e) {
            // 예외 처리 로직 추가
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(value="insertStorage", method=RequestMethod.POST)
    @ResponseBody
    public String insertStorage(@RequestBody StorageVO storageVO) {
        // 저장 로직을 처리하는 서비스가 있다고 가정합니다.
        storageService.insertStorage(storageVO);
        return "성공적으로 저장되었습니다";
    }
}
