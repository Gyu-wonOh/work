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
 * Servlet implementation class HumanController
 */
@WebServlet("*.human")
public class HumanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public static HumanService humanService = new HumanService();
    public HumanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		// /이 있으면 절대경로 http://localhost:8088/jdbc03/human/+파일이름
		// /이 없으면 상대경로  현재 요청한 경로 +파일 http://localhost:8088/jdbc03/human/*파일이름
		if (command.equals("/human/insert.human")) {
			viewPage = "insert.jsp";
		}else if(command.equals("/human/insertDB.human")){
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			double height = Double.parseDouble(request.getParameter("height"));
			//yyyy-MM-DD'T'HH:mm
			LocalDateTime birthday = LocalDateTime.parse(
					request.getParameter("birthday"));
			humanService.insert(new HumanDto(name,age,height,birthday));
			
			viewPage="select.human";
			
		}else if (command.equals("/human/select.human")) {
			//human테이블 select
			ArrayList<HumanDto> humanDtos =humanService.select();
			request.setAttribute("humanDtos", humanDtos);
			
			for(HumanDto humanDto: humanDtos) {
				System.out.println(humanDtos);
			}
			
			viewPage = "select.jsp";
		} else if (command.equals("/human/delete.human")) {
			ArrayList<HumanDto> humanDtos =humanService.select();
			request.setAttribute("humanDtos", humanDtos);
			
			for(HumanDto humanDto: humanDtos) {
				System.out.println(humanDtos);
			}
			viewPage = "delete.jsp";
		}else if (command.equals("/human/deleteDB.human")) {
			String name= request.getParameter("name");
			humanService.delete(name);
			viewPage = "delete.human";
		} else if (command.equals("/human/update.human")) {
			viewPage = "update.jsp";
		} else if (command.equals("/human/updateDB.human")) {
			String name = request.getParameter("name");
			int age =Integer.parseInt(request.getParameter("age"));
			
			humanService.update(age, name);
			viewPage = "select.human";
			
		}else if (command.equals("/human/main.human")) {
			viewPage = "main.jsp";
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(viewPage);
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
