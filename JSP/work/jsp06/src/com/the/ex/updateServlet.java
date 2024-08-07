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
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Cookie cookie =new Cookie(request.getParameter("name"),request.getParameter("value"));
		cookie.setMaxAge(6000);
		response.addCookie(cookie);
		
		response.setContentType("text/html; charset= UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println(cookie.getName()+"<br>");//쿠키이름
		out.println(cookie.getValue()+"<br>");//쿠키값
		out.println(cookie.getMaxAge()+"<br>");//쿠키 설정 시간
		out.println("<a href='http://localhost:8088/jsp06/Main.html'>"+"메인으로 이동"+"</a>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
