package com.project.test;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public abstract class Test {

	public static void main(String[] args) {
		try
		{
			 InitialContext ctx = new InitialContext();			
	        DataSource ds = ( DataSource )ctx.lookup( "jdbc/_a3" );        
	        Connection conn = ds.getConnection();
	        System.out.println( " --------------- The connection " + conn );

	  }catch ( Exception e )
		{
			System.out.println( e );
		}

	}

}
