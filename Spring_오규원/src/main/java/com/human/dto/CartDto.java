package com.human.dto;

public class CartDto {
	private int cartId;
	private String userId;
	private String productCode;
	private int orderAmount;
	
	public CartDto() {}

	public CartDto(int cartId, String userId, String productCode, int orderAmount) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.productCode = productCode;
		this.orderAmount = orderAmount;
	}
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "CartDto [cartId=" + cartId + ", userId=" + userId + ", productCode=" + productCode + ", orderAmount="
				+ orderAmount + "]";
	}
	
	
}
