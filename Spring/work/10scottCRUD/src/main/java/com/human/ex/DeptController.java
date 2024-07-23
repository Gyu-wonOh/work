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

import com.human.dto.DeptDto;
import com.human.service.IDeptService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptController {
	@Autowired
	private IDeptService service;
	private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/dept/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		ArrayList<DeptDto> dtos= service.selectAll();
		model.addAttribute("list",dtos);
		return "dept/selectAll";
	}
	@RequestMapping(value = "/dept/insert", method = RequestMethod.GET)
	public String insert() throws Exception {
		return "dept/insert";
	}
	@RequestMapping(value = "/dept/insert", method = RequestMethod.POST)
	public String insertDB(DeptDto deptDto,RedirectAttributes rttr) throws Exception {
		service.insert(deptDto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:dept/selectAll";
	}
	@RequestMapping(value = "/dept/selectDeptNo", method = RequestMethod.GET)
	public String selectDeptNo(int deptNo,Model model) throws Exception {
		DeptDto deptDto = service.selectDeptNo(deptNo);
		model.addAttribute("dto",deptDto);
		return "dept/selectDeptNo";
	}
	@RequestMapping(value = "/dept/delete", method = RequestMethod.GET)
	public String selectdeptNo(int deptNo) throws Exception {
		service.delete(deptNo);
		return "redirect:dept/selectAll";
	}
	@RequestMapping(value = "/dept/update", method = RequestMethod.GET)
	public String update(DeptDto deptDto) throws Exception {
		
		return "dept/update";
	}
	@RequestMapping(value = "/dept/update", method = RequestMethod.POST)
	public String updateDB(DeptDto deptDto,RedirectAttributes rttr) throws Exception {
		service.update(deptDto);
		return "redirect:dept/selectAll";
	}
}
