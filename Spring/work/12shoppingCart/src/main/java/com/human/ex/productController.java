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
	@RequestMapping(value = "/product/insert", method = RequestMethod.GET)
	public String insert(Model model) throws Exception {
		System.out.println("move insert page");
		return "/product/insert";
	}
	@RequestMapping(value = "/product/insert", method = RequestMethod.POST)
	public String insertDB(ProductDto dto) throws Exception {
		System.out.println("insert data:"+dto);
		String path="/ex/resources/";
		path=path+dto.getProductImagePath();
		dto.setProductImagePath(path);
		System.out.println("path:"+path);
		productService.insert(dto);
		return "redirect:/product/selectAll";
	}
	@RequestMapping(value = "/product/select", method = RequestMethod.GET)
	public String select(String productCode,Model model) throws Exception {
		System.out.println("select");
		ProductDto dto = productService.select(productCode);
		System.out.println(dto);
		model.addAttribute("productDto",dto);
		return "product/select";
	}
	@RequestMapping(value = "/product/update", method = RequestMethod.GET)
	public String update(String productCode,Model model) throws Exception {
		System.out.println("move update page");
		ProductDto dto = productService.select(productCode);
		System.out.println(dto);
		model.addAttribute("productDto",dto);
		return "product/update";
	}
	@RequestMapping(value = "/product/update", method = RequestMethod.POST)
	public String updateDB(ProductDto dto) throws Exception {
		System.out.println("update data:"+dto);
		String path="/ex/resources/";
		path=path+dto.getProductImagePath();
		dto.setProductImagePath(path);
		System.out.println("path:"+path);
		productService.update(dto);
		return "redirect:/product/selectAll";
	}
	@RequestMapping(value = "/product/delete", method = RequestMethod.GET)
	public String delete(String productCode) throws Exception {
		System.out.println("delete data:"+productCode);
		productService.delete(productCode);
		return "redirect:/product/selectAll";
	}
}
