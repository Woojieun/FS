package com.fs.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fs.mapper.ManagerMapper;
import com.fs.model.ManagerVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ManagerMapperTest {
	
	@Autowired
	//ManagerMapper.java 인터페이스 의존성 주입
	private ManagerMapper managermapper;
	

    @Test
    public void memberLogin() throws Exception{
        
    	
        ManagerVO manager = new ManagerVO();    // MemberVO 변수 선언 및 초기화
        
        /* 올바른 아이디 비번 입력경우 */
        //manager.setM_id("id");
        //manager.setM_pw("pw");
        
        manager.setM_id("1");
        manager.setM_pw("2");
        /* 올바른 않은 아이디 비번 입력경우 */
        //member.setMemberId("test1123");
        //member.setMemberPw("test1321321");
        
        managermapper.managerLogin(manager);
        System.out.println("결과 값 : " + managermapper.managerLogin(manager));
        
    }
 

}
