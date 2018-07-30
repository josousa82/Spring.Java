package com.packt.webstore.controller;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.domain.Product;

@Controller
public class ProductController {

	@RequestMapping("/products")
	public String list(Model model) {
		Product iphone = new Product("P1234", "IPhone 6", new BigDecimal(500));
		iphone.setDescription("Apple Iphone 6s  smartphone with 4.00-inch display, and 8 mega rear camera");
		iphone.setCategory("Smartphone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		model.addAttribute("product", iphone);
		return "products";
	}
	
	
	

}
