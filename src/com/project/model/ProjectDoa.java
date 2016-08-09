package com.project.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectDoa extends AbstractDoa{

	
public void add(Project project){
		
	
	
		try{
			stmt = conn.createStatement();
        
        	preparedStatement = conn.prepareStatement("insert into project (type,name,budget,leaderId) values ( ?,?,?,?)");
        	preparedStatement.setString( 1 , project.getType()       );
        	preparedStatement.setString( 2 , project.getName()       );
        	preparedStatement.setDouble( 3 , project.getBudget()     );       
        	preparedStatement.setInt(    4,  project.getLeaderId()   );
	    	preparedStatement.executeUpdate();
	    	preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 }



public List<Project> CreateProjectList() throws SQLException{
	   stmt = conn.createStatement();
	   String sql = "SELECT id,type,name,budget,leaderId from project";
	   ResultSet rs = stmt.executeQuery(sql);
	   List<Project> projectList = new ArrayList<Project>();
	    
	    while(rs.next()){
	         Project project = new Project();
	         project.setId(rs.getInt("id"));
	         project.setType(rs.getString("type"));
	         project.setName(rs.getString("name"));
	         project.setBudget(rs.getDouble("budget"));
	         project.setLeaderId(rs.getInt("leaderId"));
	         projectList.add(project);
	    }
	   
        rs.close(); 
	    
	   return projectList;
	   
}




}
