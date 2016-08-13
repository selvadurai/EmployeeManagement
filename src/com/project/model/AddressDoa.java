package com.project.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AddressDoa extends AbstractDoa {
	

	public void add(Address address){
		
		try{
			stmt = conn.createStatement();
        
        	preparedStatement = conn.prepareStatement("insert into address ( id,street, city, provience, country,postcode) values ( ?,?, ?, ?, ?,?)");
        	preparedStatement.setInt( 1 , address.getId()   );
        	preparedStatement.setString( 2 , address.getStreet()    );
        	preparedStatement.setString( 3 , address.getCity()      );
        	preparedStatement.setString( 4,  address.getProvience() );
        	preparedStatement.setString( 5,  address.getCountry()   );
        	preparedStatement.setString( 6,  address.getPostCode()   );
	    	preparedStatement.executeUpdate();
	    	preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

  }
	
	
   public List<Address> CreateAddressList() throws SQLException{
	   stmt = conn.createStatement();
	   String sql = "SELECT id, street, city, provience,postcode,country FROM address";
	   ResultSet rs = stmt.executeQuery(sql);
	   List<Address> addressList = new ArrayList<Address>();
	    
	    while(rs.next()){
	         Address address = new Address();
	         address.setId(rs.getInt("id"));
	         address.setStreet(rs.getString("street"));
	         address.setCity( rs.getString("city") );
	         address.setProvience (rs.getString("provience"));
	         address.setCountry(rs.getString("country"));
	         address.setPostCode(rs.getString("postcode"));
	         
	         addressList.add(address);

	    }
	   
        rs.close(); 
	    
	    return addressList;
	   
   }


   
   public void update(Address address){
		try{
			stmt = conn.createStatement();
        
        	preparedStatement = conn.prepareStatement("update address SET street=?, city=?, provience=?, country=?,postcode=? where id="+address.getId());
        	preparedStatement.setString( 1 , address.getStreet()    );
        	preparedStatement.setString( 2 , address.getCity()      );
        	preparedStatement.setString( 3,  address.getProvience() );
        	preparedStatement.setString( 4,  address.getCountry()   );
        	preparedStatement.setString( 5,  address.getPostCode()   );
	    	preparedStatement.executeUpdate();
	    	preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   
   }
   
   
   

}
