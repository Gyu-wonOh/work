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
	public String home( Model model) throws Exception {
		//두테이블을 조인하는 customerHobbyService제작
		List<CustomerHobbyDto> dtos= customerHobbyService.selectAll();
		for(CustomerHobbyDto dto:dtos) {
			System.out.println(dto);
		}
		model.addAttribute("list",dtos);
		return "customerHobby/selectAll";
	}

}
