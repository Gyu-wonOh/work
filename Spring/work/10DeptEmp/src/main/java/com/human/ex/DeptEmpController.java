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
import com.human.service.IEmpService;

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
	@Autowired
	private IEmpService empService;
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
    public String deleteDept(int deptNo) throws Exception{
       System.out.println("deptNo:"+ deptNo);
       deptEmpService.deleteDept(deptNo);
       return "redirect:/deptEmp/selectAll";
    }
	//http://localhost:8089/ex/deptEmp/deleteEmp?empNo=
	@RequestMapping(value = "/deptEmp/deleteEmp", method = RequestMethod.GET)
    public String deleteEmp(int empNo) throws Exception{
       System.out.println("empNo:"+ empNo);
       deptEmpService.deleteEmp(empNo);
       return "redirect:/deptEmp/selectAll";
    }
	@RequestMapping(value = "/deptEmp/updateDept", method = RequestMethod.GET)
    public String updateDept(int deptNo,Model model) throws Exception{
       System.out.println("Update \ndeptNo: "+deptNo);
       System.out.println("insert GUI");
       model.addAttribute(deptService.select(deptNo));
       return "deptEmp/updateDept";
    }
	//http://localhost:8089/ex/deptEmp/updateDept
	@RequestMapping(value = "/deptEmp/updateDept", method = RequestMethod.POST)
    public String updateDeptDB(DeptDto dto) throws Exception{
       System.out.println("Update \ndeptDto"+dto);
       System.out.println("insert GUI");
       deptService.update(dto);
       return "redirect:/deptEmp/selectAll";
    }
	@RequestMapping(value = "/deptEmp/updateEmp", method = RequestMethod.GET)
    public String updateEmp(int empNo,Model model) throws Exception{
       System.out.println("Update \nempNo: "+empNo);
       System.out.println("insert GUI");
       model.addAttribute(empService.select(empNo));
       return "deptEmp/updateEmp";
    }
	//http://localhost:8089/ex/deptEmp/updateDept
	@RequestMapping(value = "/deptEmp/updateEmp", method = RequestMethod.POST)
    public String updateDB(EmpDto dto) throws Exception{
       System.out.println("Update \nEmpDto"+dto);
       System.out.println("insert GUI");
       empService.update(dto);
       return "redirect:/deptEmp/selectAll";
    }
}



