package com.human.dto;

public class ShoppingCartDto {
	private String UserId;
	private String UserName;
	private String productImagePath;
	private String productCode;
	private String productName;
	private int orderAmount;
	
	public ShoppingCartDto() {}

	public ShoppingCartDto(String userId, String userName, String productImagePath, String productCode,
			String productName, int orderAmount) {
		super();
		UserId = userId;
		UserName = userName;
		this.productImagePath = productImagePath;
		this.productCode = productCode;
		this.productName = productName;
		this.orderAmount = orderAmount;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
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
		return "ShoppingCartDto [UserId=" + UserId + ", UserName=" + UserName + ", productImagePath=" + productImagePath
				+ ", productCode=" + productCode + ", productName=" + productName + ", orderAmount=" + orderAmount
				+ "]";
	}
	
	
	
}
