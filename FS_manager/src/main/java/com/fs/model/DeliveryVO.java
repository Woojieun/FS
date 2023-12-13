package com.fs.model;

public class DeliveryVO {
	
    private String orderNum;
    private String orderStatus;
    private String orderContent;
    private String orderUser;
    private String orderDate;
    private String deliveryDate;
    
    
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderContent() {
		return orderContent;
	}
	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}
	public String getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	
	@Override
	public String toString() {
		return "DeliveryVO [orderNum=" + orderNum + ", orderStatus=" + orderStatus + ", orderContent=" + orderContent
				+ ", orderUser=" + orderUser + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + "]";
	}
}