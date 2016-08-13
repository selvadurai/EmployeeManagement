package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.model.Address;
import com.project.model.AddressDoa;
import com.project.model.Employee;
import com.project.model.EmployeeDoa;
import com.project.model.Phone;
import com.project.model.PhoneDoa;


public class ControllerActionUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emp=request.getParameter("emp");
		int    empNum= Integer.parseInt(emp)-1;

		List<Employee> empList     = null;
		List<Phone>    phoneList   = null;
		List<Address>  addressList = null;
	    EmployeeDoa employeeDoa = new EmployeeDoa();
	    AddressDoa  addressDoa  = new  AddressDoa();
	    PhoneDoa    phoneDoa    = new  PhoneDoa();
	    
	    employeeDoa.open();
	    addressDoa.open();
	    phoneDoa.open();
	    
	    
	    try {
			 empList     =  employeeDoa.CreateEmployeeList();
		     phoneList   =  phoneDoa.CreatePhoneList();
			 addressList =  addressDoa.CreateAddressList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    employeeDoa.close();
	    addressDoa.close();
	    phoneDoa.close();
	    
	    
	    Employee employee = empList.get(empNum);
	    Address  address  = addressList.get(empNum);
	    Phone    phone    = phoneList.get(empNum);
	    
	  
	     request.setAttribute( "employee" , employee );
	     request.setAttribute( "address" ,  address );
	     request.setAttribute( "phone"  ,   phone );
	     
	     
	     
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher( "/update.jsp" );
		 dispatcher.forward(request,response );
	    
	
	
   }

}
