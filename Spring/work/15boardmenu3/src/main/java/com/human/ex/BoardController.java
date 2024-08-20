package com.human.ex;

import java.util.List;

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

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	IBoardService boardService;
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public String listAll(@RequestParam(value="bGroupKind",required=false)String bGroupKind,Model model) throws Exception{
		
		logger.info(bGroupKind);
		if(bGroupKind==null) {
			model.addAttribute("list", boardService.listAll());
		}else {
			model.addAttribute("list", boardService.listMenu(bGroupKind));
		}
			model.addAttribute("category", boardService.menuKind());
			return "/board/listAll";
	}
	
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	  public void read(@RequestParam("bId") int bId, Model model) throws Exception {
		    logger.info("read......................"+bId);
	    model.addAttribute(boardService.read(bId));
	    BoardDto board = boardService.read(bId);
	    boardService.bHitUpdate(bId);
	  }
	 
	 @RequestMapping(value="/register", method= RequestMethod.GET)
	 public String register(Model model) throws Exception{
		 logger.info("register............");
	
		 return "/board/register";
	 }
	 @RequestMapping(value="/register", method = RequestMethod.POST)
	 public String registerDB(BoardDto dto,Model model,RedirectAttributes rttr) throws Exception{
		 System.out.println(dto);
		 boardService.create(dto);
		 rttr.addFlashAttribute("msg", "success");
		 return "redirect:/board/listAll";
	 }
	 @RequestMapping(value="/modify", method = RequestMethod.GET)
	 public String mod(BoardDto dto,Model model) throws Exception{
		 model.addAttribute(dto);
		 return "/board/modify";
	 }
}
