package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.model.AddressDoa;
import com.project.model.Employee;
import com.project.model.Address;
import com.project.model.EmployeeDoa;
import com.project.model.FacadeDoa;
import com.project.model.Phone;

public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		Employee employee   = new Employee();
        Address  address    = new Address();
        Phone    phone      = new Phone();
        FacadeDoa facadeDoa = new FacadeDoa();
       
    
        employee.setFirstName(request.getParameter("fname"));
        employee.setLastName(request.getParameter("lname"));
        employee.setSalary(new Double (request.getParameter("salary")).doubleValue());
        employee.setStartDate(request.getParameter("statDate"));
        employee.setEndDate(request.getParameter("endDate"));
        employee.setManagerId(new Integer (request.getParameter("leaderId")).intValue());
        
       
        address.setStreet(request.getParameter("street"));
        address.setCity(request.getParameter("city"));
        address.setProvience(request.getParameter("provience"));
        address.setCountry(request.getParameter("country"));
        address.setPostCode(request.getParameter("postcode"));
        
        phone.setType(request.getParameter("ptype"));
        phone.setAreaCode(request.getParameter("areacode"));
        phone.setPhoneNumber(request.getParameter("phonenumber"));
      
        
        if(facadeDoa.addEmployee(employee,address,phone)==true)
          response.sendRedirect("home.jsp");
        else
          response.sendRedirect("employee.jsp");	 
        
       
	
	}


}
