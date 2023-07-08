package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Employees;
import com.app.repositories.EmployeeRepository;

@DataJpaTest // for testing only DAO
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class EmployeeRepoTest {
	@Autowired
	private EmployeeRepository empRepo;
	@Test
	void test() {
		List<Employees> list = List.of(
//				new Employees("name","mail1","pass4","addr",23,"dept1")
//				new Employees("name2","mail2","pass2","addr2",24,"dept2")
//				new Employees("name3","mail3","pass3","addr3",25,"dept3")
				);
		List<Employees> list2= empRepo.saveAll(list);
		assertEquals(1, list2.size());
	}
	
}
