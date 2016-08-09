package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.model.FacadeDoa;
import com.project.model.Project;
import com.project.model.ProjectDoa;


public class AddProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String [] employee=request.getParameterValues("employee");//get employees
	    FacadeDoa facadeDoa = new FacadeDoa();
	  
	    
	    Project project = new Project();
	    project.setType(request.getParameter("type"));
	    project.setName(request.getParameter("name"));
	    project.setLeaderId(new Integer (request.getParameter("leaderId")).intValue());
	    project.setBudget(new Double (request.getParameter("budget")).doubleValue());
	   
	    facadeDoa.addProject(project);
	    
	    ProjectDoa projectDoa =new ProjectDoa();
	    List<Project>projectList=null;
	    
	    projectDoa.open();
	    try {
	  		projectList=projectDoa.CreateProjectList();
	  	} catch (SQLException e) {
	  		response.sendRedirect("project.jsp");
	  	}
	    
	    projectDoa.close();
	    
	    try {
			facadeDoa.addEmployeeToProject(employee,projectList.size());
		} catch (SQLException e) {
			response.sendRedirect("project.jsp");
		}
	    
	    

	    response.sendRedirect("home.jsp");
	        
	}

}
