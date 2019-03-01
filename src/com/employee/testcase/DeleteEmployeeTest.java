package com.employee.testcase;

import static org.junit.Assert.*;

import org.junit.Test;
import com.employee.dao.implementation.*;
import com.employee.model.*;
public class DeleteEmployeeTest {
	DaoImplementation dao = new DaoImplementation();
	@Test
	public void test() {
		Pojo p = new Pojo();
		p.setEmployeeId(7);
		boolean count =  dao.deleteEmployee(p);
		assertEquals(false,count);
	}

}
