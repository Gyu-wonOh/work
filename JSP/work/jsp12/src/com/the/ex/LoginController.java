package com.the.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("*.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri= request.getRequestURI();
		System.out.println("uri:"+uri);
		
		//원하는 주소 처리방법
		String conPath = request.getContextPath();
		System.out.println("conpath:"+conPath);
		String command = uri.substring(conPath.length());

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		if (command.equals("/Login.do")) {
			// 로그인 페이지
			// id :java1 pw:java1 만 로그인 허용
			if (id.trim().equals("java1") && pw.trim().equals("java1")) {
				// 로그인 성공
				Cookie cookie = new Cookie("user_id", id);
				cookie.setMaxAge(6000);
				response.addCookie(cookie);
				response.sendRedirect("success.jsp");

			} else {
				// 로그인 실패
				response.sendRedirect("login.jsp?isSuccess=false");
			}
		}
		if (command.equals("/Logout.do")) {
			// 로그아웃 페이지
			request.getParameter("id");
			request.getParameter("pw");
			Cookie cookie = new Cookie("user_id",id);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			response.sendRedirect("login.jsp?isLogout=true");
		}

	}

	private String conPath() {
		// TODO Auto-generated method stub
		return null;
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
