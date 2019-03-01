package com.employee.testcase;

import static org.junit.Assert.*;
import org.junit.Test;

import com.employee.dao.implementation.DaoImplementation;
import com.employee.model.Pojo;

public class UpdateEmployeeTest {

	@Test
	public void test() {
DaoImplementation dao = new DaoImplementation();
		
		Pojo p = new Pojo();
		p.setEmployeeName("yash");
		
		p.setEmployeeId(1);
		
		p.setEmployeeSalary((float) 500);
		int count =  dao.updateEmployee(p);
		 assertEquals(1,count);
	}

}
