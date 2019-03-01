package com.employee.testcase;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.employee.dao.implementation.DaoImplementation;
import com.employee.model.Pojo;

public class ShowEmployeeTest {

	@Test
	public void test() {
		DaoImplementation dao = new DaoImplementation();
		
			Pojo p = new Pojo();
			p.setEmployeeId(1);
			List<Pojo> count =  dao.showEmployeeProject(p);
			 assertEquals(false,count.isEmpty());
	}

}
