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
import com.human.dto.CustomerHobbysDto;
import com.human.service.ICustomerHobbyService;
import com.human.service.ICustomerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerHobbyController {

	@Autowired
	private ICustomerHobbyService customerHobbyService;
	@Autowired
	private ICustomerHobbyService customerHobbysService;
	private static final Logger logger = LoggerFactory.getLogger(CustomerHobbyController.class);

	@RequestMapping(value = "/customerHobby/selectAll", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
		System.out.println("selectAll");
		List<CustomerHobbysDto> dtos = customerHobbysService.selectAll2();
		model.addAttribute("list",dtos);
		System.out.println(dtos);
		return "customerHobby/selectAll2";
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
			System.out.println("insert db" + hobby);
		}
		 customerHobbyService.insertCustomHobby(dto, hobbysArr);

		 //customerService.insert(dto);
        //hobbyService.insert(dto);
        //rttr.addFlashAttribute("msg","success");
        return "redirect:/customerHobby/selectAll";
     }
	//삭제 방법
	//1-1.고객 상세페이지를 통해서 지우는 경우
	//1-2.고객이 보유한 하비 정보를  하비 db에서 모두 삭제한 다음에 고객 db에서 삭제해야한다.
	//customerHobby/deleteCustomer?id=20
	//2-1.하비 상세페이지를 통해서 자우는 경우
	//2-2.하비를 소유한 고객아이디를  하비 db에서 하비 이름으로 하비만 삭제해야 한다.
	//customerHobby/deleteCustomer?id=20&hobby=야구
//	/ex/customer/read?bno=${
	@RequestMapping(value = "/customerHobby/deleteCustomer", method = RequestMethod.GET)
	public String deleteCustomer(Integer id,Model model) throws Exception{
		System.out.println("deleteCustomer");
		customerHobbyService.deleteCustom(id);
		return "redirect:/customerHobby/selectAll";
	}

	@RequestMapping(value = "/customerHobby/deleteHobby", method = RequestMethod.GET)
	public String deleteHobby(String hobby,Integer id,Model model) throws Exception{
		System.out.println("/customerHobby/deleteHobby");
		customerHobbyService.deleteHobby(id, hobby);
		return "redirect:/customerHobby/selectAll";
	}
}
