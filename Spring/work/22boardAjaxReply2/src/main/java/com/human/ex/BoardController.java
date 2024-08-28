package com.human.ex;

import java.util.List;

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
import com.human.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private IBoardService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET )
	public void registerGET(BoardDto board,Model model)throws Exception {
		logger.info("register get..........");
	}
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public String registPOST(BoardDto dto, Model model, RedirectAttributes rttr)throws Exception{
		logger.info("register post............");
		logger.info(dto.toString());
		
		service.regist(dto);
		
		rttr.addFlashAttribute("msg","success");
		
		return "redirect:/board/listAll";
		
	}
	@RequestMapping(value="reply", method = RequestMethod.GET)
	public void replyGET(@RequestParam("bId") int bId, Model model)throws Exception{
		logger.info("register get................");
		model.addAttribute(service.read(bId));
	}
	@RequestMapping(value = "/reply", method = RequestMethod.POST )
	public String replyPost(@RequestParam("bId") int bId, BoardDto dto, Model model, RedirectAttributes rttr)throws Exception {
		service.reply(dto);
		service.replyUpdate(dto);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value = "/listAll", method = RequestMethod.POST )
	public void listAll (@RequestParam(value="bGroupKind",required=false) String bGroupKind,BoardVo vo, Model model)throws Exception {
		logger.info("show all list............");
		System.out.println("--list pm"+vo);
		
		if(bGroupKind==null) {
			List<BoardDto> searchList = service.listSearchCriteria(vo);
			model.addAttribute("list",searchList);
		}else {
			model.addAttribute("list", service.listMenu(bGroupKind));
			List<BoardDto> searchList = service.listSearchCriteria(vo);
			model.addAttribute("list",searchList);
		}
		model.addAttribute("category",service.menuKind());
		vo.setTotalCount(service.listSearchCount(vo));
		model.addAttribute("bGroupKind",vo.getPage());
		model.addAttribute("page",vo.getPage());
		model.addAttribute("perPageNum",vo.getPerPageNum());
		model.addAttribute("searchType",vo.getSearchType());
		model.addAttribute("keyword",vo.getKeyword());
		model.addAttribute("categoryType",vo.getCategoryType());
		
	}
	@RequestMapping(value="/read", method= RequestMethod.GET)
	public void read(@RequestParam("bId") int bId, Model model)throws Exception{
		logger.info("read......."+bId);
		model.addAttribute(service.read(bId));
		BoardDto board =service.read(bId);
		service.bHitUpdate(bId);
	}
	@RequestMapping (value="bLike",method =RequestMethod.GET)
	public String bLike(@RequestParam("bId") int bId, Model model) throws Exception{
		logger.info("bLike........"+bId);
		service.bLike(bId);
		return "forward:/board/listAll";
	}
	@RequestMapping(value="bHitUpdate", method = RequestMethod.GET)
	public String bHitUpdate(@RequestParam("bId") int bId, RedirectAttributes rttr)throws Exception{
		service.bHitUpdate(bId);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bId")int bId,RedirectAttributes rttr) throws Exception{
		service.remove(bId);
		rttr.addFlashAttribute("msg","success");
		return "redirect:board/listAll";
	}
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public void modifyGET(int bId, Model model) throws Exception{
		model.addAttribute(service.read(bId));
	}
	@RequestMapping(value="modify", method = RequestMethod.POST)
	public String modifyPOST(BoardDto board, RedirectAttributes rttr)throws Exception{
		logger.info("mod post...............");
		
		service.modify(board);
		rttr.addFlashAttribute("msg","success");
		
		return"redirect:/board/listAll";
	}
}
