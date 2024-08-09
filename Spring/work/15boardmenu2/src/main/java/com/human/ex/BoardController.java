package com.human.ex;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.human.dto.BoardDto;
import com.human.service.IBoardService;

import oracle.jdbc.proxy.annotation.Post;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	public IBoardService service;
	
	@RequestMapping(value="/register", method= RequestMethod.GET)
	public void registerGET(BoardDto board,Model model) throws Exception{
		logger.info("register get............");
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registPOST(BoardDto board,Model model, RedirectAttributes rttr) throws Exception {
		logger.info ("regist post...............");
		logger.info (board.toString());
		
		service.regist(board);
		rttr.addFlashAttribute("msg","success");
		
		return "redirect: /board/listAll";
	}
	@RequestMapping(value="/listAll", method = RequestMethod.POST)
	public void listAll(@RequestParam(value="bGroupKind",required=false)String bGroupKind,Model model) throws Exception {
		logger.info(bGroupKind);
		if(bGroupKind==null) {
			model.addAttribute("list",service.listAll());
		}else {
			model.addAttribute("list",service.listMenu(bGroupKind));
		}
	}
	@RequestMapping(value="/read",method = RequestMethod.GET)
	public void read(@RequestParam("bId")int bId,Model model) throws Exception{
		logger.info("read............."+bId);
		model.addAttribute(service.read(bId));
		BoardDto board = service.read(bId);
		service.bHitUpdate(bId);
	}
	/*@RequestMapping(value="/bLike"),method =RequestMethod.GET)
	public String bLike(@RequestMapping)*/
}
