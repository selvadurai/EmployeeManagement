package com.project.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectEmployeeDoa extends AbstractDoa {
	private  int projectId;
	private  int employeeId;
	
	public void add(ProjectEmployee projectEmployee) throws SQLException{

		preparedStatement = conn.prepareStatement("insert into projectemployee( projectId, employeeid) values ( ?, ?)");
    	
    	preparedStatement.setInt   ( 1,  projectEmployee.getProjectId()     );
    	preparedStatement.setInt   ( 2,  projectEmployee.getEmployeeId()    );
    	
    	preparedStatement.executeUpdate();
    	preparedStatement.close();
		
		
    }
	
	
	public List<ProjectEmployee> CreateProjectEmployeeList() throws SQLException{
		   stmt = conn.createStatement();
		   String sql = "SELECT projectId,employeeid FROM projectEmployee";
		   ResultSet rs = stmt.executeQuery(sql);
		   List<ProjectEmployee> projectemployeeList = new ArrayList<ProjectEmployee>();
		    
		    while(rs.next()){
		         ProjectEmployee pe =new ProjectEmployee();
		         pe.setProjectId(rs.getInt("projectId"));
		         pe.setEmployeedId(rs.getInt("employeeId"));
		         projectemployeeList.add(pe);
		    }
		   
	     rs.close(); 
		    
		    return projectemployeeList;
		   
	}
	
	
}
