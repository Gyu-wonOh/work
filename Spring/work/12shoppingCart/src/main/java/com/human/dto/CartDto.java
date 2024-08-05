package com.human.dto;

public class CartDto {
	private String userId;
	private String userName;
	private String productImagePath;
	private String productCode;
	private String productName;
	private int orderAmount;
	
	public CartDto() {}

	public CartDto(String userId, String userName, String productImagePath, String productCode,
			String productName, int orderAmount) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.productImagePath = productImagePath;
		this.productCode = productCode;
		this.productName = productName;
		this.orderAmount = orderAmount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "ShoppingCartDto [userId=" + userId + ", userName=" + userName + ", productImagePath=" + productImagePath
				+ ", productCode=" + productCode + ", productName=" + productName + ", orderAmount=" + orderAmount
				+ "]";
	}
}
