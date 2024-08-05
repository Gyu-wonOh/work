package com.human.dto;

public class ProductDto {
	private String productImagePath;
	private String productCode;
	private String productName;
	private String productPrice;
	private String productDetail;
	private String manufacture;
	private String category;
	private int stockAmount;
	private String status;
	
	public ProductDto() {}

	public ProductDto(String productImagePath, String productCode, String productName, String productPrice,
			String productDetail, String manufacture, String category, int stockAmount, String status) {
		super();
		this.productImagePath = productImagePath;
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDetail = productDetail;
		this.manufacture = manufacture;
		this.category = category;
		this.stockAmount = stockAmount;
		this.status = status;
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

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductDto [productImagePath=" + productImagePath + ", productCode=" + productCode + ", productName="
				+ productName + ", productPrice=" + productPrice + ", productDetail=" + productDetail + ", manufacture="
				+ manufacture + ", category=" + category + ", stockAmount=" + stockAmount + ", status=" + status + "]";
	}
		
}
	