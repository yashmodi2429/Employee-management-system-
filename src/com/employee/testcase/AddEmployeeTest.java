package com.employee.testcase;

import static org.junit.Assert.*;
import com.employee.dao.implementation.*;
import com.employee.model.*;
import org.junit.Test;

public class AddEmployeeTest {
 DaoImplementation dao= new DaoImplementation();
	@Test
	public void test() {
		Pojo input = new Pojo();
		
		//Test to create Employee
		input.setEmployeeSalary((float) 109);
		input.setEmployeeName("Test Case");
		int create =dao.addEmployee(input);
		assertEquals(1,create);
	} 
}
