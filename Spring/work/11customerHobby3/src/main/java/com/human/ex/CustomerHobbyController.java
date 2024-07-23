package com.human.ex;

import java.text.DateFormat;
import java.util.ArrayList;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.CustomerDto;
import com.human.dto.CustomerHobbyDto;
import com.human.dto.HobbyDto;
//import com.human.service.ICustomerHobbyService;
import com.human.service.ICustomerHobbyService;
import com.human.service.ICustomerService;
import com.human.service.IHobbyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerHobbyController {

	@Autowired
	private ICustomerHobbyService customerHobbyService;
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IHobbyService hobbyService;

	private static final Logger logger = LoggerFactory.getLogger(CustomerHobbyController.class);

	@RequestMapping(value = "/customerHobby/selectAll", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
		// 두테이블을 조인하는 customerHobbyService제작
		List<CustomerHobbyDto> dtos = customerHobbyService.selectAll();
		for (CustomerHobbyDto dto : dtos) {
			System.out.println(dto);
		}
		model.addAttribute("list", dtos);
		return "customerHobby/selectAll";
	}
	@RequestMapping(value = "/customerHobby/insert", method = RequestMethod.GET)
	public String insert(Model model) throws Exception {
//       System.out.println("customHobby");
//       System.out.println("insert GUI");
		return "customerHobby/insert";
	}
	
	@RequestMapping(value = "/customerHobby/insert", method = RequestMethod.POST)
	public String insertData(CustomerDto dto, String[] hobbys, RedirectAttributes rttr) throws Exception {
		System.out.println("insert db" + hobbys);
		ArrayList<String> hobbysArr = new ArrayList<String>();
		for (String hobby : hobbys) {
			hobbysArr.add(hobby);
		}

		customerHobbyService.insertCustomHobby(dto, hobbysArr);

		// customerService.insert(dto);
		// hobbyService.insert(dto);
		// rttr.addFlashAttribute("msg","success");
		return "redirect:/customerHobby/selectAll";
	}

	@RequestMapping(value = "/customerHobby/deleteCustomer", method = RequestMethod.GET)
	public String deleteCustomer(Integer id, Model model) throws Exception {
		System.out.println("deleteCustomer");
		customerHobbyService.deleteCustom(id);
		// 하비테이블의 id에 해당하는 취미 삭제
		// 고객테이블의 id에 해당하는 취미 삭제
		return "redirect:/customerHobby/selectAll";
	}

	@RequestMapping(value = "/customerHobby/deleteHobby", method = RequestMethod.GET)
	public String deleteHobby(String hobby, Integer id, Model model) throws Exception {
		System.out.println("/customerHobby/deleteHobby");
		// 하비테이블에 id,hobby로 원하는 hobby데이터를 지우는 작업
		customerHobbyService.deleteHobby(id, hobby);
		return "redirect:/customerHobby/selectAll";
	}
	//customerHobby/updateCustomer?id=20
	@RequestMapping(value = "/customerHobby/updateCustomer", method = RequestMethod.GET)
	public String updateCustomer(Integer id,Model model) throws Exception{
		System.out.println("updateCustomer");
		model.addAttribute(customerService.select(id));
		return "/customerHobby/updateCustomer";
	}
	@RequestMapping(value = "/customerHobby/updateCustomer", method = RequestMethod.POST)
	public String updateCustomerDB(CustomerDto dto,RedirectAttributes rttr,Model model) throws Exception{
		System.out.println("updateCustomerDB");
		customerService.update(dto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/customerHobby/selectAll";
	}
	//customerHobby/updateHobby?id=20&hobby=야구
	@RequestMapping(value = "/customerHobby/updateHobby", method = RequestMethod.GET)
	public String updateHobby(Integer id,Model model,HobbyDto dto) throws Exception{
		System.out.println("updateHobby");
		model.addAttribute(hobbyService.select(dto));
		return "/customerHobby/updateHobby";
	}
	@RequestMapping(value = "/customerHobby/updateHobby", method = RequestMethod.POST)
	public String updateHobbyDB(HobbyDto dto,RedirectAttributes rttr,Model model) throws Exception{
		System.out.println("/customerHobby/updateHobby  post");
		hobbyService.update(dto);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/customerHobby/selectAll";
	}
}
