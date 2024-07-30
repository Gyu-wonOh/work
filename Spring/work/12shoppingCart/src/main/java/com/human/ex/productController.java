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

import com.human.dto.ProductDto;
import com.human.dto.UserDto;
import com.human.service.IProductService;
import com.human.service.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class productController {
	@Autowired
	private IProductService productService;
	private static final Logger logger = LoggerFactory.getLogger(productController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/product/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		System.out.println("selectAll");
		List<ProductDto> dto = productService.selectAll();
		System.out.println(dto);
		model.addAttribute("list",dto);
		return "product/selectAll";
	}
	@RequestMapping(value = "/product/select", method = RequestMethod.GET)
	public String select(String productCode,Model model) throws Exception {
		System.out.println("select");
		ProductDto dto = productService.select(productCode);
		System.out.println(dto);
		model.addAttribute("productDto",dto);
		return "product/select";
	}
	
	
}
