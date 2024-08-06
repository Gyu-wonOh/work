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
	public String main(@Param("id")String id,@Param("pw")String pw)throws Exception {
		System.out.println("login....\n"+id+"\n"+pw);
			UserDto loginUserDto = userService.login(id,pw);
		if(id!=null||pw!=null) {
		 if(id.equals(loginUserDto.getId())&&pw.equals(loginUserDto.getPw()));
		 return "redirect:/main";
		}
		 return "/login/login";
	}
	@RequestMapping(value = "/login/join", method = RequestMethod.GET)
	public String join(Model model)throws Exception {
		return "/login/join";
	}	
	@RequestMapping(value = "/login/insert", method = RequestMethod.POST)
	public String insert(UserDto dto)throws Exception {
		System.out.println("join....\n"+dto);
		userService.insert(dto);
		return "/login/complete";
	}	
}
