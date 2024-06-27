package com.the.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class CookieController
 */
@WebServlet("*.Servlet")
public class CookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CookieController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri= request.getRequestURI();
		System.out.println("uri:"+uri);
		
		//원하는 주소 처리방법
		String conPath = request.getContextPath();
		System.out.println("conpath:"+conPath);
		String command = uri.substring(conPath.length());
		
		String viewPage="/main.html";
		if(command.equals("/insert.Servlet")) {
			viewPage="/insert.jsp";
		}else if(command.equals("/select.Servlet")) {
			viewPage="/select.jsp";
		}else if(command.equals("/update.Servlet")) {
			viewPage="/update.jsp";
		}else if(command.equals("/delete.Servlet")) {
			viewPage="/delete.jsp";
		}
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
