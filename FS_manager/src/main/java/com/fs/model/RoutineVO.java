package com.fs.model;

public class RoutineVO {
	
	private String rd_num;
	private String u_id;
	private String rd_name;
	private String rd_phone;
	private String rd_kind_release;
	private String rd_volume;
	private String rd_start;
	private String rd_cycle1;
	private String rd_cycle2;
	private String rd_delivery_fee;
	private String rd_postcode;
	private String rd_address;
	private String rd_detail_address;
	private String rd_status;
	private String rd_product;
	
	
	public String getRd_num() {
		return rd_num;
	}
	public void setRd_num(String rd_num) {
		this.rd_num = rd_num;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getRd_name() {
		return rd_name;
	}
	public void setRd_name(String rd_name) {
		this.rd_name = rd_name;
	}
	public String getRd_phone() {
		return rd_phone;
	}
	public void setRd_phone(String rd_phone) {
		this.rd_phone = rd_phone;
	}
	public String getRd_kind_release() {
		return rd_kind_release;
	}
	public void setRd_kind_release(String rd_kind_release) {
		this.rd_kind_release = rd_kind_release;
	}
	public String getRd_volume() {
		return rd_volume;
	}
	public void setRd_volume(String rd_volume) {
		this.rd_volume = rd_volume;
	}
	public String getRd_start() {
		return rd_start;
	}
	public void setRd_start(String rd_start) {
		this.rd_start = rd_start;
	}
	public String getRd_cycle1() {
		return rd_cycle1;
	}
	public void setRd_cycle1(String rd_cycle1) {
		this.rd_cycle1 = rd_cycle1;
	}
	public String getRd_cycle2() {
		return rd_cycle2;
	}
	public void setRd_cycle2(String rd_cycle2) {
		this.rd_cycle2 = rd_cycle2;
	}
	public String getRd_delivery_fee() {
		return rd_delivery_fee;
	}
	public void setRd_delivery_fee(String rd_delivery_fee) {
		this.rd_delivery_fee = rd_delivery_fee;
	}
	public String getRd_postcode() {
		return rd_postcode;
	}
	public void setRd_postcode(String rd_postcode) {
		this.rd_postcode = rd_postcode;
	}
	public String getRd_address() {
		return rd_address;
	}
	public void setRd_address(String rd_address) {
		this.rd_address = rd_address;
	}
	public String getRd_detail_address() {
		return rd_detail_address;
	}
	public void setRd_detail_address(String rd_detail_address) {
		this.rd_detail_address = rd_detail_address;
	}
	public String getRd_status() {
		return rd_status;
	}
	public void setRd_status(String rd_status) {
		this.rd_status = rd_status;
	}
	public String getRd_product() {
		return rd_product;
	}
	public void setRd_product(String rd_product) {
		this.rd_product = rd_product;
	}
	
	
	@Override
	public String toString() {
		return "RoutineVO [rd_num=" + rd_num + ", u_id=" + u_id + ", rd_name=" + rd_name + ", rd_phone=" + rd_phone
				+ ", rd_kind_release=" + rd_kind_release + ", rd_volume=" + rd_volume + ", rd_start=" + rd_start
				+ ", rd_cycle1=" + rd_cycle1 + ", rd_cycle2=" + rd_cycle2 + ", rd_delivery_fee=" + rd_delivery_fee
				+ ", rd_postcode=" + rd_postcode + ", rd_address=" + rd_address + ", rd_detail_address="
				+ rd_detail_address + ", rd_status=" + rd_status + ", rd_product=" + rd_product + "]";
	}
	
}