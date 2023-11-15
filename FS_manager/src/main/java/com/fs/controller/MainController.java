package com.fs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	//로그인 페이지 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginPageGET() {
		
		logger.info("로그인 페이지 진입");
		
	}
	
	//대쉬보드 페이지 이동
	@RequestMapping(value = "/admin_main", method = RequestMethod.GET)
	public void dashboardPageGET() {
			
		logger.info("dashboard 페이지 진입");
		
	}
	
	//admin_member 페이지 이동
	@RequestMapping(value = "/admin_member", method = RequestMethod.GET)
	public void admin_memberPageGET() {
			
		logger.info("admin_member 페이지 진입");
		
	}
	
	//회원 페이지 이동 (일반회뭔, 관리자 회원)
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void userPageGET() {
			
		logger.info("user 페이지 진입");
	}
	
	//member 이동 
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public void memberPageGET() {
			
		logger.info("member 페이지 진입");
	}
	
	//member_detail 이동 
	@RequestMapping(value = "/member_detail", method = RequestMethod.GET)
	public void member_detailPageGET() {
			
		logger.info("member_detail 페이지 진입");
	}
	
	//member_status 이동 
	@RequestMapping(value = "/member_status", method = RequestMethod.GET)
	public void member_statusPageGET() {
			
		logger.info("member_status 페이지 진입");
	}
	
	//member_refund 이동 
	@RequestMapping(value = "/member_refund", method = RequestMethod.GET)
	public void member_refundPageGET() {
			
		logger.info("member_refund 페이지 진입");
	}
	
	//상품 페이지 이동
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public void productPageGET() {
			
		logger.info("product 페이지 진입");

	}
	
	//상품 페이지 이동
	@RequestMapping(value = "/product_status", method = RequestMethod.GET)
	public void product_statusPageGET() {
			
		logger.info("product_status 페이지 진입");

	}
	
	//배송 페이지 이동 (당일, 정기, 예약 배송)
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public void deliveryPageGET() {
			
		logger.info("delivery 페이지 진입");
		
	}
	
	//delivery_detail 이동 (당일, 정기, 예약 배송)
	@RequestMapping(value = "/delivery_detail", method = RequestMethod.GET)
	public void delivery_detailPageGET() {
			
		logger.info("delivery_detail 페이지 진입");
		
	}
	
	//delivery_status 이동 (당일, 정기, 예약 배송)
	@RequestMapping(value = "/delivery_status", method = RequestMethod.GET)
	public void delivery_statusPageGET() {
			
		logger.info("delivery_status 페이지 진입");
		
	}
	
	//상품 페이지 이동
	@RequestMapping(value = "/storage", method = RequestMethod.GET)
	public void storagePageGET() {
			
		logger.info("storage 페이지 진입");
		
	}
	
	//storage_status 페이지 이동
	@RequestMapping(value = "/storage_status", method = RequestMethod.GET)
	public void storage_statusPageGET() {
			
		logger.info("storage_status 페이지 진입");
		
	}

	//문의 페이지 이동
	@RequestMapping(value = "/inquiry", method = RequestMethod.GET)
	public void inquiryPageGET() {
			
		logger.info("inquiry 페이지 진입");
		
	}
	
	//상담 페이지 이동 (전화 고객 상담)
	@RequestMapping(value = "/inquiry_phone", method = RequestMethod.GET)
	public void inquiry_phonePageGET() {
			
		logger.info("inquiry_phone 페이지 진입");
		
	}
	
	//환불 문의 페이지 이동
	@RequestMapping(value = "/refund", method = RequestMethod.GET)
	public void refundPageGET() {
			
		logger.info("refund 페이지 진입");
		
	}
	
	//logistics 페이지 이동
	@RequestMapping(value = "/logistics", method = RequestMethod.GET)
	public void logisticsPageGET() {
			
		logger.info("logistics 페이지 진입");
		
	}

}