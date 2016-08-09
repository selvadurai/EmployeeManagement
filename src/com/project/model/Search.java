package com.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Search {

private List<Employee> employeeList = null;	
	
 public Search(){
	  EmployeeDoa employeeDoa = new EmployeeDoa();
	  employeeDoa.open();
	  try {
		  employeeList=employeeDoa.CreateEmployeeList();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  employeeDoa.close();
	
 }

 public List<Employee> searchByLast(String name) {
	 List<Employee> searchReturn =new  ArrayList();
	 
	 //Linear time
	 for(int i=0; i <employeeList.size();i++){
		 Employee employee=employeeList.get(i);
		 if(employee.getLastName().equals(name) || employee.getLastName().toLowerCase().contains(name.toLowerCase())){
			 searchReturn.add(employee);
		 }
	 }
	 
     return searchReturn;
 
 
 }






}
