package com.human.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("/board/view")
	public String view() {
		return "board/view";
	}

}
