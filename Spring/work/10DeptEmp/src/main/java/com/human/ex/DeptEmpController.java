package com.human.ex;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

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
import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;
import com.human.dto.EmpDto;
import com.human.service.IDeptEmpService;
import com.human.service.IDeptService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptEmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(DeptEmpController.class);
	
	@Autowired
	private IDeptService deptService;
	@Autowired
	private IDeptEmpService deptEmpService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	
	 */

	@RequestMapping(value = "/deptEmp/selectAll", method = RequestMethod.GET)
	public void home(Model model) throws Exception{
		System.out.println("selectAll");
		List<DeptEmpDto> dto=deptEmpService.selectAll();
		System.out.println(dto);
		model.addAttribute("list",dto);		
	}
	@RequestMapping(value = "/deptEmp/insert", method = RequestMethod.GET)
    public String insert(Model model) throws Exception{
       System.out.println("deptEmp");
       System.out.println("insert GUI");
       return "deptEmp/insert";
    }
	@RequestMapping(value = "/deptEmp/insert", method = RequestMethod.POST)
    public String insertData(@RequestParam("deptNo") int deptNo,@RequestParam("dName") String dName,@RequestParam("loc") String loc,@ModelAttribute EmpDto emp,RedirectAttributes rttr) throws Exception{
       System.out.println("insert db"+deptNo);
       System.out.println("insert db"+dName);
       System.out.println("insert db"+loc);
       System.out.println("insert db"+emp);
          
       deptEmpService.insertDeptEmp(deptNo,dName,loc,emp);
       
       //customerService.insert(dto);
       //hobbyService.insert(dto);
       //rttr.addFlashAttribute("msg","success");
       return "redirect:/deptEmp/selectAll";
    }
	//http://localhost:8089/ex/deptEmp/deleteDept?=90
	@RequestMapping(value = "/deptEmp/deleteDept", method = RequestMethod.GET)
    public String delete(int deptNo) throws Exception{
       System.out.println("deptNo:"+ deptNo);
       deptEmpService.deleteDept(deptNo);
       return "redirect:/deptEmp/selectAll";
    }
}



