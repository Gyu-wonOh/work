package com.reservation.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.reservation.dto.BoardDto;
import com.reservation.service.IBoardService;

@Controller
public class BoardController {
	@Autowired
	private IBoardService boardService;
	
	@RequestMapping(value="/board/listAll", method=RequestMethod.GET)
	public String listAll(@RequestParam(value="bGroupKind", required = false)String bGroupKind,Model model)throws Exception{
		 if(bGroupKind==null) {z
		    	model.addAttribute("list", boardService.listAll());
		    }else {
		    	model.addAttribute("list", boardService.listMenu(bGroupKind));
		    }
		    	model.addAttribute("category",boardService.menuKind());
		return "board/listAll";
	}
	@RequestMapping(value="/board/register", method=RequestMethod.GET)
	public String register(Model model)throws Exception{
		System.out.println("Register.....");
		return "board/register";
	}
	@RequestMapping(value="/board/register", method=RequestMethod.POST)
	public String register(BoardDto dto,Model model)throws Exception{
		System.out.println("Register.....DB");
		boardService.create(dto);
		return "redirect:board/listAll";
	}
}
