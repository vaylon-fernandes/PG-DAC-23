package com.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Product;

@DataJpaTest // Spring boot supplied annotation for testing ONLY
// Dao 
@AutoConfigureTestDatabase(replace = Replace.NONE) // To tell
// Spring boot not to replace the original DB, configured in app 
@Rollback(false) // @Rollback is a test annotation that is used to indicate whether a test-managed
					// transaction should be rolled back after the test method has completed.
class ProductDaoTest {
	@Autowired
	private ProductDao productDao;

	@Test
	void testStoreProduct() {
		// String productName, int quantity, double price,
		// String description
		List<Product> list = List.of(
				new Product("good 1", 2, 100, "good product 1"),
				new Product("good 4", 4, 300, "good product 4"), 
				new Product("good 5", 5, 400, "good product 5"));
		List<Product> list2 = productDao.saveAll(list);
		assertEquals(3, list2.size());
	}

}
