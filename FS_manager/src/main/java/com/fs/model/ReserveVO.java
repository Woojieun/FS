package com.fs.model;

public class ReserveVO {
	//정기배송
	
	//주문번호
	private String red_num;
	//주문자 아이디
	private String u_id;
	private String red_name;
	//주문자 전화번호
	private String red_phone;
	
	private String red_kind_release;
	private String red_volume;
	
	//주문 날짜
	private String red_delivery_date;
	//배송지 우편번호
	private String red_postcode;
	//배송지 주소
	private String red_address;
	//배송지 상세 주소
	private String red_detail_address;
	//배달료
	private String red_delievery_fee;
	//주문 상태
	private String red_status;
	//배송 상품
	private String red_product;
	//배송 예약일
	private String red_deli_date;
	
	
	public String getRed_num() {
		return red_num;
	}
	public void setRed_num(String red_num) {
		this.red_num = red_num;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getRed_name() {
		return red_name;
	}
	public void setRed_name(String red_name) {
		this.red_name = red_name;
	}
	public String getRed_phone() {
		return red_phone;
	}
	public void setRed_phone(String red_phone) {
		this.red_phone = red_phone;
	}
	public String getRed_kind_release() {
		return red_kind_release;
	}
	public void setRed_kind_release(String red_kind_release) {
		this.red_kind_release = red_kind_release;
	}
	public String getRed_volume() {
		return red_volume;
	}
	public void setRed_volume(String red_volume) {
		this.red_volume = red_volume;
	}
	public String getRed_delivery_date() {
		return red_delivery_date;
	}
	public void setRed_delivery_date(String red_delivery_date) {
		this.red_delivery_date = red_delivery_date;
	}
	public String getRed_postcode() {
		return red_postcode;
	}
	public void setRed_postcode(String red_postcode) {
		this.red_postcode = red_postcode;
	}
	public String getRed_address() {
		return red_address;
	}
	public void setRed_address(String red_address) {
		this.red_address = red_address;
	}
	public String getRed_detail_address() {
		return red_detail_address;
	}
	public void setRed_detail_address(String red_detail_address) {
		this.red_detail_address = red_detail_address;
	}
	public String getRed_delievery_fee() {
		return red_delievery_fee;
	}
	public void setRed_delievery_fee(String red_delievery_fee) {
		this.red_delievery_fee = red_delievery_fee;
	}
	public String getRed_status() {
		return red_status;
	}
	public void setRed_status(String red_status) {
		this.red_status = red_status;
	}
	public String getRed_product() {
		return red_product;
	}
	public void setRed_product(String red_product) {
		this.red_product = red_product;
	}
	public String getRed_deli_date() {
		return red_deli_date;
	}
	public void setRed_deli_date(String red_deli_date) {
		this.red_deli_date = red_deli_date;
	}
	
	
	
	@Override
	public String toString() {
		return "ReserveVO [red_num=" + red_num + ", u_id=" + u_id + ", red_name=" + red_name + ", red_phone="
				+ red_phone + ", red_kind_release=" + red_kind_release + ", red_volume=" + red_volume
				+ ", red_delivery_date=" + red_delivery_date + ", red_postcode=" + red_postcode + ", red_address="
				+ red_address + ", red_detail_address=" + red_detail_address + ", red_delievery_fee="
				+ red_delievery_fee + ", red_status=" + red_status + ", red_product=" + red_product + ", red_deli_date="
				+ red_deli_date + "]";
	}
}