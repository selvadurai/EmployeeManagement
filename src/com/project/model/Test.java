package com.project.model;

import java.sql.SQLException;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("usa");
		address.setStreet("csdss");
		address.setCountry("asasasaa");
		AddressDoa addDoa = new AddressDoa();
		addDoa.open();
		addDoa.add(address);
	   
		Employee employee = new Employee();
        employee.setFirstName("dsdsqwke");
        employee.setLastName("dssdd");
        employee.setSalary(23.55);
        employee.setStartDate("1991-03-12");
        employee.setEndDate("1991-03-12");
        employee.setManagerId(1);
        employee.SetAddressId(2);
        
        EmployeeDoa eDoa= new EmployeeDoa();
		
        eDoa.open();
        eDoa.add(employee);
        
        
      
      
        
		
		List<Address> list=null; 
		List<Employee> emplist=null;
		List<Phone>    phoneList = null;
		try {
		    list =addDoa.CreateAddressList();
		    emplist=eDoa.CreateEmployeeList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addDoa.close();
		eDoa.close();
		
		
		
		System.out.println(list.size() + " "+emplist.size());
		  
		    Phone phone =new Phone();
	       phone.setType("type");
	       phone.setPhoneNumber("416555-5555");
	       phone.setAreaCode("416");
	       phone.SetOwnerId(1);
	       
	       PhoneDoa pDoa = new PhoneDoa();
	       pDoa.open();
	       pDoa.add(phone);
	       
	       
	       Project project = new Project();
	       project.setType("dsdssd");
	       project.setName("dfesdsd");
	       project.setBudget(23.22);
	       project.setLeaderId(2);
	       
	       ProjectDoa prDoa = new ProjectDoa();
	       prDoa.open();
	       prDoa.add(project);
	       List<Project> p=null;
	       
	       
	       ProjectEmployee pe = new ProjectEmployee();
	       pe.setProjectId(1);
	       pe.setEmployeedId(1);
	       
	       
	       
	       ProjectEmployeeDoa peDoa = new ProjectEmployeeDoa();
	       List<ProjectEmployee>peList=null;
	       peDoa.open();
	       try {
			peDoa.add(pe);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	       
	       
	       
	       
	       try {
			phoneList=pDoa.CreatePhoneList();
			        peList =peDoa.CreateProjectEmployeeList();
			p=prDoa.CreateProjectList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 pDoa.close();
		 prDoa.close();
		 peDoa.close();
	       System.out.println(phoneList.size() +" "+ p.size()+" "+peList.size());

	}

}
