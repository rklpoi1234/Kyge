package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mSignUp")
public class mSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public mSignUp() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=UTF-8");
	
		PrintWriter out = response.getWriter();
		
	String mName = request.getParameter("m_name");
	String mNickName = request.getParameter("m_nickname");
	
	out.print("<p>mName :" + mName + "</P>");
	out.print("<p>mNickName :" + mNickName + "</P>");
	
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
