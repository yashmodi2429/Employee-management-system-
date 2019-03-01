package com.employee.testcase;

import static org.junit.Assert.*;

import org.junit.Test;
import com.employee.dao.implementation.*;
import com.employee.model.*;
public class AddProjectTest {
	DaoImplementation dao = new DaoImplementation();
//	@Test
//	public void test() {
//		Pojo p = new Pojo();
//		p.setProjectName("PS QuickIt");
//		p.setAssignTo(20);
//		int count = dao.addProject(p);
//		assertEquals(1,count);
//		
//		//the above test case fails because there is no employeeId 20 in DB
//}

	
		@Test
		public void secondtest()
		{
			Pojo p = new Pojo();
			p.setProjectName("PS QuickIt");
			p.setAssignTo(8);
			int count = dao.addProject(p);
			assertEquals(1,count);
		}
}
