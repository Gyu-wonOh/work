package com.human.my;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/board/view4")
	public String view() {
		return "board/view";
	}
}
