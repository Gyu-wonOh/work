package com.the.dto;

public class ProductDto {
	private String productCode = null;
	private String productName = null;
	private String productPrice = null;
	private String productDetail = null;
	private String manufacture = null;
	private String category = null;
	private String stockAmount= null;
	private String status = null;
	
	public ProductDto() {}

	public ProductDto(String productCode, String productName, String productPrice, String manufacture, String category,
			String stockAmount, String status) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.manufacture = manufacture;
		this.category = category;
		this.stockAmount = stockAmount;
		this.status = status;
	}

	public ProductDto(String productName, String productPrice, String productDetail) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDetail = productDetail;
	}

	public ProductDto(String productCode, String productName, String productPrice, String productDetail,
			String manufacture, String category, String stockAmount, String status) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDetail = productDetail;
		this.manufacture = manufacture;
		this.category = category;
		this.stockAmount = stockAmount;
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductDto [productCode=" + productCode + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDetail=" + productDetail + ", manufacture=" + manufacture + ", category="
				+ category + ", stockAmount=" + stockAmount + ", status=" + status + "]";
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

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
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

	}
