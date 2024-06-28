package com.the.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("*.servlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri= request.getRequestURI();//현재주소 리턴
		System.out.println("uri:"+uri);
		
		//원하는 주소 처리방법
		String conPath = request.getContextPath();//프로젝트 명 리턴
		System.out.println("conpath:"+conPath);
		String command = uri.substring(conPath.length());//현재 주소에서 프로젝트명 제거한 주소 추출
		System.out.println("command:"+command);
		
		String viewPage="login.jsp";
		if(command.equals("/login.servlet")) {
			viewPage="login.jsp";
		}else if(command.equals("/loginDB.servlet")) {
			viewPage="success.jsp";
			String user_id = request.getParameter("user_id");
			String password = request.getParameter("password");
			if(user_id.equals("java")&&password.equals("1234")) {
				HttpSession session = request.getSession();
				session.setAttribute("user_id",user_id);
				session.setMaxInactiveInterval(2000);
			}else {
				viewPage="login.jsp?isSuccess=false";
			}
			System.out.println("/loginDB.servlet");
		}else if(command.equals("/sucess.servlet")) {
			viewPage="success.jsp";
		}else if(command.equals("/logout.servlet")) {
			viewPage="/login.jsp?islogout=true";
			HttpSession session= request.getSession();
			session.invalidate();
			System.out.println("/logout.servlet");
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
