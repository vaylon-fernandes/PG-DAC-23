package com.app.service;

import java.util.List;

import com.app.pojos.Product;

public interface ProductService {
	// insert product 
	Product addProduct(Product newProduct);
	
	// retrive product
	List<Product> getAllProducts();
	
}
