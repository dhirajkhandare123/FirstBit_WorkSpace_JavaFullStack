package com.demo;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {

	    // CORS Headers
	    resp.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
	    resp.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
	    resp.setHeader("Access-Control-Allow-Headers", "Content-Type");

	    resp.setContentType("text/plain");

	    String uname = req.getParameter("user");
	    String pass = req.getParameter("pass");

	    PrintWriter pw = resp.getWriter();

	    System.out.println("User name = " + uname);
	    System.out.println("Password = " + pass);

	    if ("firstbit".equals(uname) && "1234".equals(pass)) {
	        pw.print("welcome " + uname);
	    } else {
	        pw.print("Invalid data");
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		PrintWriter pw = resp.getWriter();
		
		
		
		if(uname.equals("firstbit") && pass.equals("1234")) {
			pw.print("welcome " + uname);
		}
		else {
			pw.print("Invalid data");
		}
	}
}
