package com.fs.model;

public class StorageVO {

	//사용자 아이디
	private String u_id;
	//사용자 회사명
	private String u_company;
	//상품 아이디
	private String pro_id;
	//담당자 아이디
	private String mng_id;
	//창고 예약 기본키
	private String sr_id;
	
	//컨테이너 번호
	private String con_num;
	//컨테이너 위치
	private String con_id;
	//컨테이너 종류
	private String con_variety;
	//컨테이너 물품
	private String con_product;
	//컨테이너 제품 종류
	private String con_pro_variety;
	//칸테이너 온도
	private String con_temperature;
	//칸테이너 습도
	private String con_himidity;
	//컨테이너 밝기
	private String con_light;
	//컨테이너 상태
	private String con_status;
	
	
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_company() {
		return u_company;
	}
	public void setU_company(String u_company) {
		this.u_company = u_company;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getMng_id() {
		return mng_id;
	}
	public void setMng_id(String mng_id) {
		this.mng_id = mng_id;
	}
	public String getSr_id() {
		return sr_id;
	}
	public void setSr_id(String sr_id) {
		this.sr_id = sr_id;
	}
	public String getCon_num() {
		return con_num;
	}
	public void setCon_num(String con_num) {
		this.con_num = con_num;
	}
	public String getCon_id() {
		return con_id;
	}
	public void setCon_id(String con_id) {
		this.con_id = con_id;
	}
	public String getCon_variety() {
		return con_variety;
	}
	public void setCon_variety(String con_variety) {
		this.con_variety = con_variety;
	}
	public String getCon_product() {
		return con_product;
	}
	public void setCon_product(String con_product) {
		this.con_product = con_product;
	}
	public String getCon_pro_variety() {
		return con_pro_variety;
	}
	public void setCon_pro_variety(String con_pro_variety) {
		this.con_pro_variety = con_pro_variety;
	}
	public String getCon_temperature() {
		return con_temperature;
	}
	public void setCon_temperature(String con_temperature) {
		this.con_temperature = con_temperature;
	}
	public String getCon_himidity() {
		return con_himidity;
	}
	public void setCon_himidity(String con_himidity) {
		this.con_himidity = con_himidity;
	}
	public String getCon_light() {
		return con_light;
	}
	public void setCon_light(String con_light) {
		this.con_light = con_light;
	}
	public String getCon_status() {
		return con_status;
	}
	public void setCon_status(String con_status) {
		this.con_status = con_status;
	}
	
	
	@Override
	public String toString() {
		return "StorageVO [u_id=" + u_id + ", u_company=" + u_company + ", pro_id=" + pro_id + ", mng_id=" + mng_id
				+ ", sr_id=" + sr_id + ", con_num=" + con_num + ", con_id=" + con_id + ", con_variety=" + con_variety
				+ ", con_product=" + con_product + ", con_pro_variety=" + con_pro_variety + ", con_temperature="
				+ con_temperature + ", con_himidity=" + con_himidity + ", con_light=" + con_light + ", con_status="
				+ con_status + "]";
	}
}