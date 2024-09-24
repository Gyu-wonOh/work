package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		
		return "home";
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public String listAll(Model model,HumanDto dto) throws Exception {
		List<HumanDto> dtos = service.selectAll();
		model.addAttribute("list", dtos);
		return "listAll";
	}
	@RequestMapping(value = "/insert", method =RequestMethod.GET)
	public String insert (Model model) throws Exception {
		return "insert";
	}
	@RequestMapping(value = "/insert", method =RequestMethod.POST)
	public String insertDB (Model model,HumanDto dto) throws Exception {
		service.insert(dto);
		return "redirect: listAll";
	}
	@RequestMapping(value = "/selectName" , method = RequestMethod.GET)
	public String read (Model model,String name) throws Exception{
		HumanDto humanDto = service.selectName(name);
		System.out.println(humanDto);
		model.addAttribute("humanDto",humanDto);
		
		return "selectName";
	}
	@RequestMapping(value = "/update" , method = RequestMethod.GET)
	public String update (Model model,String name) throws Exception{
		HumanDto dto = service.selectName(name);
		model.addAttribute(dto);
		return "update";
	}
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String updateDB (Model model,HumanDto dto) throws Exception{
		service.update(dto);
		return "redirect:/listAll";
	}
	@RequestMapping(value = "/delete" , method = RequestMethod.GET)
	public String updateDB (Model model,String name) throws Exception{
		service.delete(name);
		return "redirect:/listAll";
	}
}
