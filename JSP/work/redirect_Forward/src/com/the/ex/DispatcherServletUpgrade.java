package com.the.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServletUpgrade
 */
@WebServlet("/DispatcherServletUpgrade")
public class DispatcherServletUpgrade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispatcherServletUpgrade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * request 객체에 사용자가 원하는 데이터를 담을 수 있다. setAttribute(key,value)를 이용하여 데이터를 담는다.
		 * getAttribute(key)를 이용하여 데이터를 읽어온다.
		 */
		request.setAttribute("name", "홍길동");

		RequestDispatcher dispatcher = request.getRequestDispatcher("03dispatcher.jsp");
		dispatcher.forward(request, response);
		//forward이후에 이부분의 코드는 의미가 없다.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
