package com.human.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController2 {
	@RequestMapping("/view2")
	public String view2() {
		return "board/view";
	}
	
	@RequestMapping("/view3")
	public ModelAndView view3() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/view3");		
		return mv;
	}
	
	

}
