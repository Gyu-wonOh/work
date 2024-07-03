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

import com.the.dto.HumanDto;
import com.the.service.HumanService;

/**
 * Servlet implementation class humanController
 */
@WebServlet("*.human")
public class humanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static HumanService humanService = new HumanService();

	public humanController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("uri :" + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath: " + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command: " + command);

		String viewPage = "main.jsp";
		if (command.equals("/human/main.human")) {
			viewPage = "main.jsp";
		} else if (command.equals("/human/insert.human")) {
			viewPage = "insert.jsp";
		} else if (command.equals("/human/insertDB.human")) {
			String name= request.getParameter("name");
			int age= Integer.parseInt(request.getParameter("age"));
			double height= Double.parseDouble(request.getParameter("height"));
			LocalDateTime birthday = LocalDateTime.parse(request.getParameter("birthday"));
			
			humanService.insert(new HumanDto(name,age,height,birthday));
			viewPage = "select.human";
		} else if (command.equals("/human/select.human")) {
			ArrayList<HumanDto> humanDtos = humanService.select();
			request.setAttribute("humanDtos", humanDtos);

			for (HumanDto humanDto : humanDtos) {
				System.out.println(humanDto);
			}
			viewPage = "select.jsp";
		} else if (command.equals("/human/delete.human")) {
			ArrayList<HumanDto> humanDtos = humanService.select();
			
			
			viewPage = "delete.jsp";
		}else if (command.equals("/human/deleteDB.human")) {
			String name = request.getParameter("name");
			humanService.delete(name);
			viewPage = "select.human";
		} else if (command.equals("/human/update.human")) {
			
			viewPage = "update.jsp";
		}else if (command.equals("/human/updateDB.human")) {
			int age= Integer.parseInt(request.getParameter("age"));
			String name= request.getParameter("name");
			
			humanService.update(age, name);
			viewPage = "select.human";
		}
		System.out.println(viewPage);

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
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
