package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.RegistrationDAO;

public class LoginController extends HttpServlet{
	RegistrationDAO rdao=new RegistrationDAO();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		PrintWriter out=  resp.getWriter();
		
		String id= req.getParameter("empid");
		int empid = Integer.parseInt(id);
		
		String empname= req.getParameter("empname");
	    boolean result=rdao.registerEmployee(empid, empname);
	    if(result)
	     out.print("Successfully Registered");
	    else
	    	out.print("sorrry Not Registered");
		
		//out.println("Registration:" +empid + empname);
	}

}
