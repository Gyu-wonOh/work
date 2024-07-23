package com.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {
	//사용자에게 id를 입력받아  id가 hi면 ok.jsp 아니면  fail.jsp로 이동하는 프로그램
	@RequestMapping(value = "/redirect/input", method = RequestMethod.GET)
	public String myFormResultPost(Model model) {
		return "redirect/input";
	}
	@RequestMapping(value = "/redirect/result", method = RequestMethod.GET)
	public String redirectResult(String id,Model model) {
		if(id.equals("hi")) {
			//로그인 성공
			return "redirect:/redirect/ok";
		}
		//로그인 실패
		return "redirect:/redirect/fail";
	}
	@RequestMapping(value = "/redirect/ok", method = RequestMethod.GET)
	public String redirectOk(Model model) {
		return "redirect/ok";
	}
	@RequestMapping(value = "/redirect/fail", method = RequestMethod.GET)
	public String redirectFail(Model model) {
		return "redirect/fail";
	}
}
