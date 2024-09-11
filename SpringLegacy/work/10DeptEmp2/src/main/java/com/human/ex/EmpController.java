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

import com.human.dto.EmpDto;
import com.human.service.IEmpService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	private IEmpService empService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	
	 */
	@RequestMapping(value = "/emp/modify", method = RequestMethod.POST)
	public String modifyDB(Model model,EmpDto dto,RedirectAttributes rttr) throws Exception{
		System.out.println("modify db");
		empService.update(dto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/emp/selectAll";
	}
	@RequestMapping(value = "/emp/modify", method = RequestMethod.GET)
	public String modify(Model model,@RequestParam("empNo")int empNo) throws Exception{
		System.out.println("modify gui");
		model.addAttribute(empService.select(empNo));
		return "/emp/update";
	}
	
	@RequestMapping(value = "/emp/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("empNo")int empNo,RedirectAttributes rttr) throws Exception{
		System.out.println("delete");
		empService.delete(empNo);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/emp/selectAll";
	}
	
//	/ex/customer/read?bno=${
	@RequestMapping(value = "/emp/read", method = RequestMethod.GET)
	public void read(Model model,@RequestParam("empNo")int empNo) throws Exception{
		System.out.println("read");
		model.addAttribute(empService.select(empNo));				
	}
	@RequestMapping(value = "/emp/selectAll", method = RequestMethod.GET)
	public void home(Model model) throws Exception{
		System.out.println("selectAll");
		List<EmpDto> dto=empService.selectAll();
		System.out.println(dto);
		model.addAttribute("list",dto);		
	}
	@RequestMapping(value = "/emp/insert", method = RequestMethod.GET)
	public void insert() throws Exception{
		System.out.println("insert GUI");
	}
	@RequestMapping(value = "/emp/insert", method = RequestMethod.POST)
	public String insertData(EmpDto dto,RedirectAttributes rttr) throws Exception{
		System.out.println("insert db");
		empService.insert(dto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/emp/selectAll";
	}
	
}



