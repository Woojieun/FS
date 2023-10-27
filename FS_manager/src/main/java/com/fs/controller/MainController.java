package com.fs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	//대쉬보드 페이지 이동
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public void dashboardPageGET() {
			
		logger.info("dashboard 페이지 진입");
		
	}
	
	//회원 페이지 이동 (일반회뭔, 관리자 회원)
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void userPageGET() {
			
		logger.info("user 페이지 진입");
	}
	
	//상품 페이지 이동
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public void ptoductPageGET() {
			
		logger.info("product 페이지 진입");

	}
	
	//배송 페이지 이동 (당일, 정기, 예약 배송)
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public void deliveryPageGET() {
			
		logger.info("delivery 페이지 진입");
		
	}
	
	//상품 페이지 이동
	@RequestMapping(value = "/storage", method = RequestMethod.GET)
	public void storagePageGET() {
			
		logger.info("storage 페이지 진입");
		
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

}