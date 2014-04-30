package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Vote extends HttpServlet 
{

	public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException 
	{
		String id = req.getParameter("id");
		int i = Integer.valueOf(id);
		
		Quotes.votes[i]++;
		
//		try 
//		{
			response.setStatus(303);
	 		response.setHeader( "Location", "http://localhost:8080" );
	 		response.setHeader( "Connection", "close" );

//	 		RequestDispatcher disp;
//			disp = getServletContext().getRequestDispatcher("/index.jsp");
//			if (disp != null)
//				disp.forward(req, resp);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}