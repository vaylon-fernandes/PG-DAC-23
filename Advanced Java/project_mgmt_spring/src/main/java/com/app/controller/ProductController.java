package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
