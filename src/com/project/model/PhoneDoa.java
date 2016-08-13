package com.project.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class PhoneDoa extends AbstractDoa {

public void add(Phone phone){
		
		try{
			stmt = conn.createStatement();
        
        	preparedStatement = conn.prepareStatement("insert into phone (id,type,phonenumer, areaCode, ownerID) values ( ?,?,?,?,?)");
        	preparedStatement.setInt(   1     , phone.getId()             );
        	preparedStatement.setString( 2 , phone.getType()             );
        	preparedStatement.setString( 3 , phone.getPhoneNumber()      );
        	preparedStatement.setString( 4 , phone.getAreaCode()         );
        	preparedStatement.setInt   (5 , phone.getOwnerId()           );
	    	preparedStatement.executeUpdate();
	    	preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
  }





public List<Phone> CreatePhoneList() throws SQLException{
	   stmt = conn.createStatement();
	   String sql = "SELECT id,type,phonenumer, areaCode, ownerId FROM phone";
	   ResultSet rs = stmt.executeQuery(sql);
	   List<Phone> phoneList = new ArrayList<Phone>();
	    
	    while(rs.next()){
	         Phone phone = new Phone();
	         phone.setId(rs.getInt("id"));
	         phone.setType(rs.getString("type"));
	         phone.setPhoneNumber(rs.getString("phonenumer"));
	         phone.setAreaCode(rs.getString("areaCode"));
	         phone.SetOwnerId(rs.getInt("ownerId"));
	         phoneList.add(phone);
	    } 
	   
       rs.close(); 
	    
	    return phoneList;
	   
}



public void update(Phone phone){
	
	
	try{
		stmt = conn.createStatement();
    
    	preparedStatement = conn.prepareStatement("Update phone SET type=?,phonenumer=?, areaCode=?, ownerId=? where id="+phone.getId());
    	preparedStatement.setString( 1 , phone.getType()             );
    	preparedStatement.setString( 2 , phone.getPhoneNumber()      );
    	preparedStatement.setString( 3 , phone.getAreaCode()         );
    	preparedStatement.setInt   (4 , phone.getOwnerId()           );
    	preparedStatement.executeUpdate();
    	preparedStatement.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}








}
