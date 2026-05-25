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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String userName = req.getParameter("user");
		String password = req.getParameter("pass");
		
		PrintWriter pw = resp.getWriter();
		
		if(userName.equals("firstbit") && password.equals("1234")) {
			pw.print("welcome " + userName);
		}
		else {
			pw.print("Invalid data");
		}
		
		
//		System.out.println(userName);
//		System.out.println(password);
//		
//		
//		Map<String, String[]> map = req.getParameterMap();
//		
//		for(String key: map.keySet()) {
//			System.out.println("Key = " + key);
//			
//			String arr[] = map.get(key);
//			
//			for(String val: arr) {
//				System.out.println(val);
//			}
//		}
		
		
//		System.out.println(req);
//		System.out.println(resp);
		
		
		
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("user");
		String password = req.getParameter("pass");
		
		PrintWriter pw = resp.getWriter();
		
		if(userName.equals("firstbit") && password.equals("1234")) {
			pw.print("welcome " + userName);
		}
		else {
			pw.print("Invalid data");
		}
	}
}
