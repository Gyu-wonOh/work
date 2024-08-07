package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.dto.CartDto;
import com.human.dto.ProductDto;
import com.human.dto.UserDto;
import com.human.service.ICartService;
import com.human.service.IProductService;
import com.human.service.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CartController {
	@Autowired
	private ICartService cartService;
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/Cart/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		System.out.println("selectAll");
		List<CartDto> dto = cartService.selectAll();
		System.out.println(dto);
		model.addAttribute("list",dto);
		return "Cart/selectAll";
	}
	@RequestMapping(value= "/Cart/add",method =RequestMethod.GET)
	public String addCart(CartDto dto) throws Exception {
		System.out.println("add to Cart :"+ dto);
		cartService.insert(dto);
		return "redirect:/Cart/selectId";
	}
	@RequestMapping(value= "/Cart/selectId",method =RequestMethod.GET)
	public String selectId(HttpSession session, Model model) throws Exception {
		String id = (String)session.getAttribute("id");
		System.out.println("cartList :"+ id);
		List<CartDto>dtos=cartService.selectUser(id);
		model.addAttribute("list",dtos);
		return "Cart/selectId";
	}
}
