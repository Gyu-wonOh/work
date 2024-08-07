package com.the.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieRead
 */
@WebServlet("/CookieRead")
public class CookieRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookieRead() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();

		response.setContentType("text/html; meta charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				out.println("================================<br>");
				out.println(cookie.getName() + "<br>");// 쿠키이름
				out.println(cookie.getValue() + "<br>");// 쿠키값
				out.println(cookie.getMaxAge() + "<br>");// 쿠키 설정 시간
			}

		}else {
			out.println("================================<br>");
			out.println("쿠키가 존재하지 않습니다.<br>");
		}

		out.println("</body>");
		out.println("</html>");

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
