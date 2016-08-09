package com.project.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDoa extends AbstractDoa {

public void add(Employee employee){
		
		try{
			stmt = conn.createStatement();
        
        	preparedStatement = conn.prepareStatement("insert into employee ( firstName, lastName, salary, startDate,endDate,mangerId,addressedId) values ( ?, ?, ?, ?,?,?,?)");
        	preparedStatement.setString( 1 , employee.getFirstName()     );
        	preparedStatement.setString( 2 , employee.getLastName()      );
        	preparedStatement.setDouble( 3,  employee.getSalary()        );
        	preparedStatement.setString( 4,  employee.getStartDate()     );
        	preparedStatement.setString( 5,  employee.getEndDate()       );
        	preparedStatement.setInt   ( 6,  employee.getManagerId()     );
        	preparedStatement.setInt   ( 7,  employee.getAdressId()      );
        	
	    	preparedStatement.executeUpdate();
	    	preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

  }



public List<Employee> CreateEmployeeList() throws SQLException{
	   stmt = conn.createStatement();
	   String sql = "SELECT id,firstName, lastName,salary,startDate,endDate,mangerId,addressedId FROM employee";
	   ResultSet rs = stmt.executeQuery(sql);
	   List<Employee> employeeList = new ArrayList<Employee>();
	    
	    while(rs.next()){
	         Employee employee = new Employee();
	         employee.setId(rs.getInt("id"));
	         employee.setFirstName(rs.getString("firstName"));
	         employee.setLastName(rs.getString("lastName"));
	         employee.setSalary(rs.getDouble("salary"));
	         employee.setStartDate(rs.getString("startDate"));
	         employee.setEndDate(rs.getString("endDate"));
	         employee.setManagerId(rs.getInt("mangerId"));
	         employee.SetAddressId(rs.getInt("addressedId"));
	         employeeList.add(employee);
	    }
	   
     rs.close(); 
	    
	    return employeeList;
	   
}

	
}
