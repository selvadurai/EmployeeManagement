package com.project.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AbstractDoa {
	protected Connection conn = null;
    protected Statement stmt = null;
    protected PreparedStatement preparedStatement = null;
    protected InitialContext ctx;
    protected DataSource ds;
 
    public AbstractDoa(){
    	
    }

    public void open(){
       try
		  {
		    ctx = new InitialContext();			
	        DataSource ds = ( DataSource )ctx.lookup( "jdbc/_project" );
	        conn = ds.getConnection();
	      }
          catch ( Exception e )
		  {
			System.out.println( e );
		  }
    }
    
  
    	
   public void close(){
	   try {
            conn.close();
		    conn = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
    

}
   
   
     
   


