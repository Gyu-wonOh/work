package com.the.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.the.dto.UserDto;
import com.the.service.ShopService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("*.User")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ShopService shopService = new ShopService();

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath : " + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command : " + command);
		String viewPage = "main.jsp";
		if (command.equals("/main.User")) {
			viewPage = "main.jsp";
		} else if (command.equals("/user/login.User")) {
			viewPage = "login.jsp";
		} else if (command.contentEquals("/user/login_pro.User")) {
			String id = request.getParameter("id");
			String pw =request.getParameter("pw");
			System.out.println(id);
			System.out.println(pw);
			UserDto loginUserDto = shopService.userLogin(id, pw);
			if(id != null||pw!=null) {
				if(id.equals(loginUserDto.getId())&&pw.equals(loginUserDto.getPw())) {
					HttpSession session = request.getSession();
					session.setAttribute("id", id);
					session.setMaxInactiveInterval(600);
					System.out.println(session);
					viewPage = "complete.jsp?index=1";
				}else {
					viewPage ="login.jsp?isSuccess=false";
				}
			}
			
		}else if (command.equals("/user/logout.User")) {
			HttpSession session = request.getSession();
			session.invalidate();
			System.out.println("/logout.servlet");
			
			viewPage = "login.jsp?isLogout=true";
		} else if (command.equals("/user/join.User")) {
			viewPage = "join.jsp";
		} else if (command.equals("/user/join_pro.User")) {

			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			LocalDateTime birthday = LocalDateTime.parse(request.getParameter("birthday"));
			String email = request.getParameter("email");
			String phoneNumber = request.getParameter("phoneNumber");
			String address = request.getParameter("address");
			UserDto userDto = new UserDto(id, pw, name, gender, birthday, email, phoneNumber, address);

			shopService.userInsert(userDto);

			viewPage = "complete.jsp?index=0";

		} else if (command.equals("/user/index.User")) {
			viewPage = "index.jsp";
		} else if (command.equals("/user/update.User")) {
			String id = request.getParameter("id");
			System.out.println(id);
			viewPage = "update.jsp";
		} else if(command.equals("/user/update_pro.User")) {
			String id = request.getParameter("id");
			String email = request.getParameter("email");
			String phoneNumber = request.getParameter("phoneNumber");
			String address = request.getParameter("address");
			
			shopService.userUpdate(id, email, phoneNumber, address);
			viewPage = "complete.jsp?index=2";
		}else if(command.equals("/user/delete.User")) {
			String id = request.getParameter("id");
			
			shopService.userDelete(id);
			viewPage = "/main.User";
		}else if(command.equals("/user/order.User")) {
			viewPage = "order.jsp";
		}else if(command.equals("/user/order_pro.User")) {
			
			//for() {}
			viewPage="order.jsp";
		}
		System.out.println(viewPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
