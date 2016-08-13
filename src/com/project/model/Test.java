package com.project.model;

import java.sql.SQLException;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	  
		Address address = new Address();
		  address.setId(1);
		  address.setCity("xxxxx");
		  address.setProvience("xxxxx");
		
		
		
	 Employee employee = new Employee();
	  employee.setId(1);
	  employee.setFirstName("xxxxx");
	  employee.setLastName("xxxxx");
	  employee.SetAddressId(1);
	  
	  Phone phone = new Phone();
	  phone.setId(1);
	  phone.setType("sdss");
	  phone.setPhoneNumber("444-444-4444");
	  phone.SetOwnerId(1);
	  
	  AddressDoa aDoa = new AddressDoa();
      aDoa.open();
	   aDoa.add(address);
	   aDoa.close();
	

	  EmployeeDoa emp = new EmployeeDoa();
	   emp.open();
	   emp.add(employee);
	   emp.close();
	   

		  PhoneDoa pDoa = new PhoneDoa();
	       pDoa.open();
		   pDoa.add(phone);
		   pDoa.close();
	       
	
	}
}
