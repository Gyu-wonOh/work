package com.human.dto;

public class productDto {
	private String productCode;
	private String productName;
	private String productPrice;
	private String productDetail;
	private String manufactor;
	private String category;
	private String stockAmount;
	private String status;
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
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	public String getManufactor() {
		return manufactor;
	}
	public void setManufactor(String manufactor) {
		this.manufactor = manufactor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(String stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public productDto() {}
	public productDto(String productCode, String productName, String productPrice, String productDetail,
			String manufactor, String category, String stockAmount, String status) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDetail = productDetail;
		this.manufactor = manufactor;
		this.category = category;
		this.stockAmount = stockAmount;
		this.status = status;
	}
	@Override
	public String toString() {
		return "productDto [productCode=" + productCode + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDetail=" + productDetail + ", manufactor=" + manufactor + ", category="
				+ category + ", stockAmount=" + stockAmount + ", status=" + status + "]";
	}
	
	
}
