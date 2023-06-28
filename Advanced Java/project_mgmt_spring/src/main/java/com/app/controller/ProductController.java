package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	// dependency 
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> displayProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping
	public Product storeProduct(@RequestBody Product product) {
		System.out.println("in store product "+product);
		return productService.addProduct(product);
	}
	@GetMapping("/{id}")
	public @ResponseBody String getById(@PathVariable Long id){
		String mesg = "";
		System.out.println("In get by Id");
		Product prod =null;
		try {
			prod = productService.getProductById(id);
			mesg=prod.toString(); 
			return mesg;

		}
		catch (RuntimeException e) {
			// TODO: handle exception
			return e.getMessage();
		}

	}
	
	
}
