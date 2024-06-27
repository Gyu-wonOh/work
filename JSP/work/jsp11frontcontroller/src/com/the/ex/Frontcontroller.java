package com.the.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 매핑주소를 *.do 로하면 .do로 끝나는 모든 주소를 받아올 수 있다. 매핑주소 맨앞에 "/"은 없어야 한다.
 */
@WebServlet("*.do")
public class Frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Frontcontroller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// URI:jsp10/hello.do
		// conpath:/jsp10
		// command:/hello.do
		String uri = request.getRequestURI();
		System.out.println("URI:" + uri);
		// 원하는 주소에 대한 처리방법
		String conPath = request.getContextPath();
		System.out.println("conpath:" + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command:" + command);

		// /insert.do, /select.do , /delete.do, /update.do
		String viewPage = "view.jsp";

		if (command.equals("/insert.do")) {
			viewPage = "insert.jsp";
		} else if (command.equals("/select.do")) {
			viewPage = "select.jsp";
		} else if (command.equals("/delete.do")) {
			viewPage = "delete.jsp";
		} else if (command.equals("/update.do")) {
			viewPage = "update.jsp";
		} else if (command.equals("/view.do")) {
			viewPage = "view.jsp";
		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(viewPage);
				dispatcher.forward(request, response);	
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
