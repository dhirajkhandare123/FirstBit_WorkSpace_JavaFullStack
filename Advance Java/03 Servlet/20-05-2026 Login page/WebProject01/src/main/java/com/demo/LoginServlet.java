package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String user = req.getParameter("uname");
		 String password = req.getParameter("pass");
		 
		 System.out.println("User = " + user);
		 System.out.println("Password = " + password);
		 
		 
//		 String xyz = req.getParameter("xyz");
		 
		 
//		 System.out.println(user);
//		 System.out.println(password);
//		 System.out.println(xyz);
		 
		 // verified karna hai
		 
//		 Map<String, String[]> map = req.getParameterMap();
//		 
//		 for(String key: map.keySet()) {
//			 System.out.println("Key: " + key);
//			 
//			 String arr[] = map.get(key);
//			 
//			 for(String val : arr) {
//				 System.out.println(val);
//			 }
//		 }
		 
		  
		
		
//		PrintWriter pw = resp.getWriter();
//		pw.print("welcome to Advance JAVA doGet");
//		
//		System.out.println("inside do get");
		 
		 PrintWriter pw = resp.getWriter();
		 if(user.equals("firstbit")&&password.equals("12345")) {
			 pw.print("Welocome " + user);
		 }
		 
		 else {
			 pw.print("invalid username or password");
		 }
	}
	 
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		 String user = req.getParameter("uname");
//		 String password = req.getParameter("pass");
//		 String xyz = req.getParameter("xyz");
//		 
//		 
//		 System.out.println(user);
//		 System.out.println(password);
//		 System.out.println(xyz);
		 
		
		PrintWriter pw = resp.getWriter();
		pw.print("welcome to Advance JAVA doPost");
		
		System.out.println("inside do post");
	}
}
