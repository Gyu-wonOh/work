package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.dto.UserDto;
import com.human.service.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	@Autowired
	public IUserService userService;
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login/login", method = RequestMethod.GET)
	public String main(Model model) {
		System.out.println("login Page");
		return "/login/login";
	}
	@RequestMapping(value = "/login/login", method = RequestMethod.POST)
	public String main(@Param("id")String id,@Param("pw")String pw, HttpSession session)throws Exception {
		System.out.println("login....\n"+id+"\n"+pw);
			UserDto loginUserDto = userService.login(id,pw);
		if(id!=null||pw!=null) {
		 if(id.equals(loginUserDto.getId())&&pw.equals(loginUserDto.getPw())){
			 session.setAttribute("id",id);
			 session.setMaxInactiveInterval(600);
			 System.out.println(session);
			 return "redirect:/login/member";	 
		 }else {
			 System.out.println("fail to login");
		 }
		}
		 return "/login/login";
	}
	@RequestMapping(value = "/login/logout", method = RequestMethod.GET)
	public String main(HttpSession session)throws Exception {
		String userId = (String)session.getAttribute("id");
		System.out.println("logout\n"+userId);
		session.getAttribute(userId);
		session.invalidate();
		 return "/login/login";
	}
	@RequestMapping(value = "/login/join", method = RequestMethod.GET)
	public String join(Model model)throws Exception {
		return "/login/join";
	}	
	@RequestMapping(value = "/login/complete", method = RequestMethod.POST)
	public String insert(UserDto dto)throws Exception {
		System.out.println("join....\n"+dto);
		userService.insert(dto);
		return "/login/complete";
	}
	@RequestMapping(value = "/login/complete", method = RequestMethod.GET)
	public String complete(Model model)throws Exception {
		System.out.println("complete");
		return "/login/complete";
	}
	@RequestMapping(value = "/login/member", method = RequestMethod.GET)
	public String member(HttpSession session, Model model)throws Exception {
		System.out.println("member");
		return "/main";
	}
}
