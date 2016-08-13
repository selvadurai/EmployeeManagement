package com.project.model;

import java.sql.SQLException;
import java.util.List;

public class FacadeDoa {

public boolean addEmployee(Employee employee, Address address,Phone phone){
    
	try{
	AddressDoa addressDoa = new AddressDoa();
    addressDoa.open();
    addressDoa.add(address);
    addressDoa.close();
    
    
    
    EmployeeDoa employeeDoa = new EmployeeDoa();
    employeeDoa.open();
    employeeDoa.add(employee);
    employeeDoa.close();
    
    
    PhoneDoa phoneDoa = new PhoneDoa();
    phoneDoa.open();
    phoneDoa.add(phone);
    phoneDoa.close();
    
    
    return true;
	
	}catch(Exception e){
		return false;
	}
	
}


public void addProject(Project project){
 ProjectDoa projectDoa = new ProjectDoa(); 
 projectDoa.open();
 projectDoa.add(project);
 projectDoa.close();
}

public void addEmployeeToProject(String [] employees,int project_num) throws SQLException{
   
   ProjectEmployeeDoa projectEmployeeDoa=new ProjectEmployeeDoa();
	
    projectEmployeeDoa.open();
   
    for (int i = 0; i < employees.length; i++){
	   ProjectEmployee projectEmployee=new ProjectEmployee();
	   projectEmployee.setEmployeedId(Integer.parseInt(employees[i]));
	   projectEmployee.setProjectId(project_num);
	   projectEmployeeDoa.add(projectEmployee);
    } 
	
    projectEmployeeDoa.close();
}




public void updateEmployee(Phone phone,Address address, Employee employee){
	AddressDoa addressDoa = new AddressDoa();
    addressDoa.open();
    addressDoa.update(address);
    addressDoa.close();
    
    EmployeeDoa employeeDoa = new EmployeeDoa();
    employeeDoa.open();
    employeeDoa.update(employee);
    employeeDoa.close();
    
    PhoneDoa phoneDoa = new PhoneDoa();
    phoneDoa.open();
    phoneDoa.update(phone);
    phoneDoa.close();
    
	
}



}
