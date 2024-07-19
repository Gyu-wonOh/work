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
//import com.human.service.ICustomerHobbyService;
import com.human.service.ICustomerHobbyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerHobbyController {

	@Autowired
	private ICustomerHobbyService customerHobbyService;

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
}
