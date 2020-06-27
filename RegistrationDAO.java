package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegistrationDAO {
	
	public boolean registerEmployee(int empid, String empname)
	{
		
		boolean result=false;
		Connection con=MYSQLConnectionUtil.getConnection();
		
		try {
		PreparedStatement ps= con.prepareStatement("insert into techm_employee values(?,?)");
		ps.setInt(1, empid );
		ps.setString(2, empname );
		
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			result=true;
		}
		
	}
		catch(Exception e) {
		System.out.println(e);
	}
    return result;
 }
}