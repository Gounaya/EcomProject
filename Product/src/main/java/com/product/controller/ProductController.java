package com.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.product.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	
	private ProductService productService; 
	
	//@RequestMapping(value= {"/"}, method= RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		return "product/index";
	}
	
    //@RequestMapping(value = {"/product/show/{id}"}, method= RequestMethod.GET)
    @GetMapping("/product/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("product", productService.getById(Long.valueOf(id)));
        return "product/show";
    }
    
    //@RequestMapping(value = {"/product/list", "/product"}, method= RequestMethod.GET)
    @GetMapping("/product/list")
    public String listProducts(Model model){
        model.addAttribute("products", productService.listAll());
        return "product/list";
    }

	
}
