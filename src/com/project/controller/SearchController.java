package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.model.Employee;
import com.project.model.Search;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query=request.getParameter("search");
		Search search = new Search();
		List<Employee> employeeList=search.searchByLast(query);
		request.setAttribute( "employeeList" , employeeList );
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher( "/search.jsp" );
		  dispatcher.forward(request,response );
	}

}
