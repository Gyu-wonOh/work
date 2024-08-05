package com.human.ex;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.HumanDto;
import com.human.service.IHumanService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private IHumanService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "redirect:selectAll";
	}
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception{
		ArrayList<HumanDto> dtos=service.selectAll();
		model.addAttribute("list",dtos);
//		model.addAttribute("msg","success"); 있으면 성공메시지,없으면 성공메시지 안됨
		return "selectAll";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Model model)throws Exception{
		return "insert";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertDB(HumanDto humanDto,RedirectAttributes rttr)throws Exception{
		service.insert(humanDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:selectAll";
	}
	@RequestMapping(value = "/selectName", method = RequestMethod.GET)
	public String selectName(String name,Model model)throws Exception{
		HumanDto humanDto = service.selectName(name);
		model.addAttribute("dto",humanDto);
		return "selectName";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteName(String name,RedirectAttributes rttr)throws Exception{
		//이름으로 데이터 삭제
		service.delete(name);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/selectAll";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(HumanDto humanDto)throws Exception{
		
		//1.수정화면 update get
		return "update";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateDB(HumanDto humanDto,RedirectAttributes rttr)throws Exception{
		//2.수정 DB작업  update post
		service.update(humanDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/selectAll";
	}
}
