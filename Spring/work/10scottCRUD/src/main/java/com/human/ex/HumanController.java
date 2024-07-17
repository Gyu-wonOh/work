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

import com.human.dto.deptDto;
import com.human.service.IHumanService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HumanController {
	@Autowired
	private IHumanService service;
	private static final Logger logger = LoggerFactory.getLogger(HumanController.class);
	
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
	public String selectAll(Model model) throws Exception {
		ArrayList<deptDto> dtos= service.selectAll();
		model.addAttribute("list",dtos);
		return "selectAll";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() throws Exception {
		return "insert";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertDB(deptDto humanDto,RedirectAttributes rttr) throws Exception {
		service.insert(humanDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/selectAll";
	}
	@RequestMapping(value = "/selectName", method = RequestMethod.GET)
	public String selectName(String name,Model model) throws Exception {
		deptDto humandto = service.selectName(name);
		model.addAttribute("dto",humandto);
		return "selectName";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String selectName(String name) throws Exception {
		service.delete(name);
		return "redirect:selectAll";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(deptDto humanDto) throws Exception {
		
		return "update";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateDB(deptDto humanDto,RedirectAttributes rttr) throws Exception {
		service.update(humanDto);
		return "redirect:selectAll";
	}
}
