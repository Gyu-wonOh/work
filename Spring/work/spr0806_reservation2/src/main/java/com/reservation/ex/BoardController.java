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
		 if(bGroupKind==null) {
		    	model.addAttribute("list", boardService.listAll());
		    }else {
		    	model.addAttribute("list", boardService.listMenu(bGroupKind));
		    }
		    	model.addAttribute("category",boardService.menuKind());
		return "board/listAll";
	}
	@RequestMapping(value="/board/register", method=RequestMethod.GET)
	public String register(@RequestParam(value="bGroupKind", required = false)String bGroupKind,Model model)throws Exception{
		System.out.println("Register.....");
		model.addAttribute("category",boardService.menuKind());
		return "board/register";
	}
	@RequestMapping(value="/board/register", method=RequestMethod.POST)
	public String register(BoardDto dto,Model model)throws Exception{
		System.out.println("Register.....DB"+dto);
		boardService.create(dto);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/board/read", method=RequestMethod.GET)
	public String read(@RequestParam("bId") int bId,Model model)throws Exception{
		System.out.println("read...."+bId);
		BoardDto dto=boardService.read(bId);
		System.out.println("read...."+dto);
		model.addAttribute("boardDto",dto);
		boardService.bHitUpdate(bId);
		return "board/read";
	}
	@RequestMapping(value="/board/like", method=RequestMethod.GET)
	public String like(@RequestParam("bId") int bId,Model model)throws Exception{
		System.out.println("like...."+bId);
		boardService.bLike(bId);
		return "redirect:/board/read";
	}
	@RequestMapping(value="/board/dislike", method=RequestMethod.GET)
	public String dislike(@RequestParam("bId") int bId,Model model)throws Exception{
		System.out.println("dislike...."+bId);
		boardService.bDislike(bId);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/board/modify", method=RequestMethod.GET)
	public String modify(@RequestParam("bId") int bId,Model model)throws Exception{
		System.out.println("moidfy...."+bId);
		BoardDto dto =boardService.read(bId);
		model.addAttribute("boardDto",dto);
		return "/board/modify";
	}
	@RequestMapping(value="/board/modify", method=RequestMethod.POST)
	public String modifyDB(BoardDto dto,Model model)throws Exception{
		System.out.println("modify....DB..."+dto);
		boardService.update(dto);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/board/remove", method=RequestMethod.GET)
	public String delete(int bId,Model model)throws Exception{
		System.out.println("delete....."+bId);
		boardService.delete(bId);
		return "redirect:/board/listAll";
	}
}
