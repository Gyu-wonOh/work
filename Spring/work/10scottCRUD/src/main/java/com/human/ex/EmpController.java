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

import com.human.dto.EmpDto;
import com.human.service.IEmpService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpController {
	@Autowired
	private IEmpService service;
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
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
	
	@RequestMapping(value = "/emp/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		ArrayList<EmpDto> dtos= service.selectAll();
		model.addAttribute("list",dtos);
		return "emp/selectAll";
	}
	@RequestMapping(value = "/emp/insert", method = RequestMethod.GET)
	public String insert() throws Exception {
		return "emp/insert";
	}
	@RequestMapping(value = "/emp/insert", method = RequestMethod.POST)
	public String insertDB(EmpDto empDto,RedirectAttributes rttr) throws Exception {
		service.insert(empDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:emp/selectAll";
	}
	@RequestMapping(value = "/emp/selectEmpNo", method = RequestMethod.GET)
	public String selectEmpNo(int empNo,Model model) throws Exception {
		EmpDto empDto = service.selectEmpNo(empNo);
		model.addAttribute("dto",empDto);
		return "emp/selectDeptNo";
	}
	@RequestMapping(value = "/emp/delete", method = RequestMethod.GET)
	public String selectEmpNo(int empNo) throws Exception {
		service.delete(empNo);
		return "redirect:emp/selectAll";
	}
	@RequestMapping(value = "/emp/update", method = RequestMethod.GET)
	public String update(EmpDto empDto) throws Exception {
		
		return "emp/update";
	}
	@RequestMapping(value = "/emp/update", method = RequestMethod.POST)
	public String updateDB(EmpDto empDto,RedirectAttributes rttr) throws Exception {
		service.update(empDto);
		return "redirect:emp/selectAll";
	}
}
