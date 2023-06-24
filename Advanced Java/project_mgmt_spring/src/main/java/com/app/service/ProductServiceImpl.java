package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ProductDao;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	// dependencies
	@Autowired
	private ProductDao productDao;
	
	@Override
	public Product addProduct(Product newProduct) {
		System.out.println("In add product");
		return productDao.save(newProduct);
	}

	@Override
	public List<Product> getAllProducts() {
		System.out.println("in get products");
		return productDao.findAll();
	}

}
