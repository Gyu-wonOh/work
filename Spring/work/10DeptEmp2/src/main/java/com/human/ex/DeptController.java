package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.DeptDto;
import com.human.service.IDeptService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptController {
	
	private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
	
	@Autowired
	private IDeptService deptService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	
	 */
	@RequestMapping(value = "/dept/modify", method = RequestMethod.POST)
	public String modifyDB(Model model,DeptDto dto,RedirectAttributes rttr) throws Exception{
		System.out.println("modify db");
		deptService.update(dto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/dept/selectAll";
	}
	@RequestMapping(value = "/dept/modify", method = RequestMethod.GET)
	public String modify(Model model,@RequestParam("deptNo")int deptNo) throws Exception{
		System.out.println("modify gui");
		model.addAttribute(deptService.select(deptNo));
		return "/dept/update";
	}
	
	@RequestMapping(value = "/dept/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("deptNo")int deptNo,RedirectAttributes rttr) throws Exception{
		System.out.println("delete");
		deptService.delete(deptNo);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/dept/selectAll";
	}
	
//	/ex/customer/read?bno=${
	@RequestMapping(value = "/dept/read", method = RequestMethod.GET)
	public void read(Model model,@RequestParam("deptNo")int deptNo) throws Exception{
		System.out.println("read");
		model.addAttribute(deptService.select(deptNo));				
	}
	@RequestMapping(value = "/dept/selectAll", method = RequestMethod.GET)
	public void home(Model model) throws Exception{
		System.out.println("selectAll");
		List<DeptDto> dto=deptService.selectAll();
		System.out.println(dto);
		model.addAttribute("list",dto);		
	}
	@RequestMapping(value = "/dept/insert", method = RequestMethod.GET)
	public void insert() throws Exception{
		System.out.println("insert GUI");
	}
	@RequestMapping(value = "/dept/insert", method = RequestMethod.POST)
	public String insertData(DeptDto dto,RedirectAttributes rttr) throws Exception{
		System.out.println("insert db");
		deptService.insert(dto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/dept/selectAll";
	}
	
}



