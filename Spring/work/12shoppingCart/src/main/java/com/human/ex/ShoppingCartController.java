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

import com.human.dao.IShoppingCartDao;
import com.human.dto.ShoppingCartDto;
import com.human.service.IShoppingCartService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ShoppingCartController {
	@Autowired
	private IShoppingCartService shoppingCartService;
	private static final Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/ShoppingCart/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		System.out.println("selectAll");
		List<ShoppingCartDto> dto = shoppingCartService.selectAll();
		System.out.println(dto);
		model.addAttribute("list",dto);
		return "ShoppingCart/selectAll";
	}
}
