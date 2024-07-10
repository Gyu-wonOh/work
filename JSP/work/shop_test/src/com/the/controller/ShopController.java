package com.the.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.the.dto.ProductDto;
import com.the.dto.UserDto;
import com.the.service.ShopService;

/**
 * Servlet implementation class ShopController
 */
@WebServlet("*.Shop")
public class ShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ShopService shopService = new ShopService();   
    public ShopController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath : " + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command : " + command);
		
		String viewPage = "main.jsp";
		
		if (command.equals("/main.Shop")) {//메인 페이지
			viewPage = "main.jsp";
		} else if (command.equals("/shop/products.Shop")) {//상품 목록 페이지
			ArrayList<ProductDto> productDtos =shopService.productSelect();
			request.setAttribute("productDtos", productDtos);
			
			for(ProductDto productDto: productDtos) {
				System.out.println(productDto);
			}
			viewPage = "products.jsp";
		} else if (command.equals("/shop/add.Shop")) {//상품등록 페이지
			viewPage = "add.jsp";
		} else if (command.equals("/shop/add_pro.Shop")) {//상품등록 처리
			//String img =request.getParameter("img");
			String productCode= request.getParameter("productCode");
			String productName= request.getParameter("productName");
			String productPrice= request.getParameter("productPrice");
			String productDetail= request.getParameter("productDetail");
			String manufacture= request.getParameter("manufacture");
			String category= request.getParameter("category");
			String stockAmount= request.getParameter("stockAmount");
			String status= request.getParameter("status");
			
			ProductDto productDto = new ProductDto(productCode,productName,productPrice,
					productDetail,manufacture,category,stockAmount,status);
			
			shopService.productInsert(productDto);
			
			viewPage = "products.jsp";
		}else if (command.equals("/shop/editProduct.Shop")) {//상품 편집 페이지
			ArrayList<ProductDto> productDtos =shopService.productSelect();
			request.setAttribute("productDtos", productDtos);
			
			for(ProductDto productDto: productDtos) {
				System.out.println(productDto);
			}
			viewPage = "editProduct.jsp";
		} else if (command.equals("/shop/product.Shop")) {//상품 상세정보
			String productCode= request.getParameter("productCode");
			String productName= request.getParameter("productName");
			String manufacture= request.getParameter("manufacture");
			String category= request.getParameter("category");
			String stockAmount= request.getParameter("stockAmount");
			String productPrice= request.getParameter("productPrice");
			String status= request.getParameter("status");
			
			ProductDto productDto = new ProductDto(productCode, productName, productPrice, manufacture, category,
			stockAmount, status);
			
			request.setAttribute("productDto", productDto);
			
			viewPage = "product.jsp";
		} else if (command.equals("/shop/cart.Shop")) {//장바구니
			viewPage = "cart.jsp";
		} else if (command.equals("/shop/cart_pro.Shop")) {//주문하기->장바구니 처리
			viewPage = "cart.jsp";
		} else if (command.equals("/shop/update.Shop")) {//상품정보 수정 페이지
			String productCode = request.getParameter("productCode");
			
			System.out.println(productCode);
			request.setAttribute("productCode", productCode);
			
			viewPage = "update.jsp";
		} else if (command.equals("/shop/update_pro.Shop")) {//상품정보 수정 처리
			String productCode= request.getParameter("productCode");
			String productPrice= request.getParameter("productPrice");
			String stockAmount= request.getParameter("stockAmount");
			System.out.println(productCode);
			shopService.productUpdate(productCode,productPrice, stockAmount);
			
			viewPage = "products.jsp";
		} else if (command.equals("/shop/delete_pro.Shop")) {
			String productCode= request.getParameter("productCode");
			
			System.out.println(productCode);
			shopService.productDelete(productCode);
			viewPage = "products.jsp";
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
