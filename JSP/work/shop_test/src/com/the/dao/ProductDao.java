package com.the.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.the.dto.ProductDto;
import com.the.util.DBConn;

public class ProductDao {
	public void insert(ProductDto productDto) {
		String sql = "insert into shopProduct values('%s','%s','%s','%s','%s'"
				+ ",'%s','%s','%s')";
		sql= String.format(sql,
				productDto.getProductCode(),
				productDto.getProductName(),
				productDto.getProductPrice(),
				productDto.getProductDetail(),
				productDto.getManufacture(),
				productDto.getCategory(),
				productDto.getStockAmount(),
				productDto.getStatus()
				);
		DBConn.statementUpdate(sql);
	}
	public ArrayList<ProductDto> select() {
		ArrayList<ProductDto> productDtos = new ArrayList<ProductDto>();
		ResultSet rs = DBConn.statementQuery("select * from shopProduct");
		try {
			while(rs.next()) {
				productDtos.add(new ProductDto(rs.getString("productCode"),
						rs.getString("productName"),rs.getString("productPrice"),rs.getString("productDetail"),
						rs.getString("manufacture"),rs.getString("category"),rs.getString("stockAmount"),
						rs.getString("status")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return productDtos;
	}
	
	public void update(String productCode,String productPrice, String stockAmount) {
		String sql = "update shopProduct set productPrice='%s',stockAmount='%s' where productCode='%s'";
				
		sql= String.format(sql,productPrice,stockAmount,productCode);
		DBConn.statementUpdate(sql);
	}
	public void delete(String productCode) {
		String sql = "delete shopProduct where productCode='%s'";
		sql= String.format(sql,productCode);
		DBConn.statementUpdate(sql);
	}
	
}