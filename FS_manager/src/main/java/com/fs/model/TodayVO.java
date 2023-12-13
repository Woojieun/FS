package com.fs.model;

public class TodayVO {
	
	private String u_id;
	private String ta_name;
	private String td_phone;
	private String td_volume;
	private String td_address;
	private String postcode;
	private String u_detail_address;
	private String kind_release;
	private String delivery_fee;
	private String td_num;
	private String td_status;
	private String td_product;
	private String td_date;
	
	
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getTa_name() {
		return ta_name;
	}
	public void setTa_name(String ta_name) {
		this.ta_name = ta_name;
	}
	public String getTd_phone() {
		return td_phone;
	}
	public void setTd_phone(String td_phone) {
		this.td_phone = td_phone;
	}
	public String getTd_volume() {
		return td_volume;
	}
	public void setTd_volume(String td_volume) {
		this.td_volume = td_volume;
	}
	public String getTd_address() {
		return td_address;
	}
	public void setTd_address(String td_address) {
		this.td_address = td_address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getU_detail_address() {
		return u_detail_address;
	}
	public void setU_detail_address(String u_detail_address) {
		this.u_detail_address = u_detail_address;
	}
	public String getKind_release() {
		return kind_release;
	}
	public void setKind_release(String kind_release) {
		this.kind_release = kind_release;
	}
	public String getDelivery_fee() {
		return delivery_fee;
	}
	public void setDelivery_fee(String delivery_fee) {
		this.delivery_fee = delivery_fee;
	}
	public String getTd_num() {
		return td_num;
	}
	public void setTd_num(String td_num) {
		this.td_num = td_num;
	}
	public String getTd_status() {
		return td_status;
	}
	public void setTd_status(String td_status) {
		this.td_status = td_status;
	}
	public String getTd_product() {
		return td_product;
	}
	public void setTd_product(String td_product) {
		this.td_product = td_product;
	}
	public String getTd_date() {
		return td_date;
	}
	public void setTd_date(String td_date) {
		this.td_date = td_date;
	}
	
	
	@Override
	public String toString() {
		return "TodayVO [u_id=" + u_id + ", ta_name=" + ta_name + ", td_phone=" + td_phone + ", td_volume=" + td_volume
				+ ", td_address=" + td_address + ", postcode=" + postcode + ", u_detail_address=" + u_detail_address
				+ ", kind_release=" + kind_release + ", delivery_fee=" + delivery_fee + ", td_num=" + td_num
				+ ", td_status=" + td_status + ", td_product=" + td_product + ", td_date=" + td_date + "]";
	}
}