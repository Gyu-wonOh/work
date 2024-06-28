package com.the.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class shoppingListController
 */
@WebServlet("*.servlet")
public class shoppingListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shoppingListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("URI:"+uri);
		String conPath = request.getContextPath();
		System.out.println("conPath:" +conPath);
		String command = uri.substring(conPath.length());
		
		String viewPage = "login.jsp";
		if(command.equals("/login.servlet")) {
			viewPage="login/jsp";
		}else if(command.equals("/loginDB.servlet")) {
			viewPage = "sellProduct.jsp";
			String name = request.getParameter("name");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
