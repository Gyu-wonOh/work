package com.human.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.BoardDto;
import com.human.service.IBoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	IBoardService boardService;
	@RequestMapping(value ="/listAll",method=RequestMethod.GET)
	public String listAll(@RequestParam(value="bGroupKind",required=false)String bGroupKind,Model model)throws Exception{
		logger.info(bGroupKind);
		if(bGroupKind == null) {
			model.addAttribute("list",boardService.listAll());
		}else {
			model.addAttribute("list",boardService.listMenu(bGroupKind));
		}
		model.addAttribute("category",boardService.menukind());
		return "/board/listAll";
	}
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public void create()throws Exception{
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(BoardDto dto, RedirectAttributes rttr) throws Exception{
		if(dto!=null) {
		boardService.create(dto);
		rttr.addFlashAttribute("msg","success");
		}rttr.addFlashAttribute("msg","fail");
		return "redirect:/listAll";
	}
}