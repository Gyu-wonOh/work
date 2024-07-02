package com.the.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.the.dto.HumanDto;
import com.the.service.HumanService;

/**
 * Servlet implementation class humanController
 */
@WebServlet("*.human")
public class humanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static HumanService humanService= new HumanService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public humanController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uri = request.getRequestURI();
	System.out.println("uri");
	String conPath = request.getContextPath();
	System.out.println("conPath");
	String command = uri.substring(conPath.length());
	
	String viewPage = "main.jsp";
	if(command.equals("/human/main.human")) {
		viewPage="main.jsp";
	}else if(command.equals("/human/insert.human")){
		
		viewPage="insert.jsp";
	}else if(command.equals("/human/select.human")) {
		ArrayList<HumanDto> humanDtos =humanService.select();
		request.setAttribute("humanDtos", humanDtos);
		
		viewPage="select.jsp";
	}else if(command.equals("/human/delete.human")) {
		viewPage="delete.jsp";
	}else if(command.equals("/human/update.human")) {
		viewPage="update.jsp";
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
