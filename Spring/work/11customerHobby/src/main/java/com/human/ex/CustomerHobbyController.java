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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.CustomerDto;
import com.human.dto.CustomerHobbyDto;
import com.human.service.ICustomerHobbyService;
import com.human.service.ICustomerService;

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

		 //customerService.insert(dto);
        //hobbyService.insert(dto);
        //rttr.addFlashAttribute("msg","success");
        return "redirect:/customerHobby/selectAll";
     }
}
