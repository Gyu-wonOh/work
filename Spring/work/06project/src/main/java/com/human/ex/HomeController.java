package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.dto.HumanDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//사용자에게 id를 입력받아  id가 hi면 ok.jsp 아니면  fail.jsp로 이동하는 프로그램
		@RequestMapping(value = "/myForm/input", method = RequestMethod.GET)
		public String myFormInput(Model model) {
			return "myForm/input";
		}
		@RequestMapping(value = "/myForm/result", method = RequestMethod.GET)
		public String myFormResultPost(HumanDto humanDto,Model model) {
			model.addAttribute("humanDto",humanDto);
			return "myForm/result";
		}
		
		@RequestMapping(value = "/redirect/select", method = RequestMethod.GET)
		public String redirectOk(Model model) {
			
			return "redirect/select";
		}
		@RequestMapping(value = "/redirect/", method = RequestMethod.GET)
		public String redirectOk(Model model) {
			
			return "redirect/select";
		}
		
}
