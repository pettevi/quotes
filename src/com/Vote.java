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
		
		try {
			int i = Integer.valueOf(id);
			if (i < Quotes.quotes.length-1 && i >= 0)
				Quotes.quotes[i].votes++;
		} catch(NumberFormatException e)
		{
		}
		
		response.setStatus(303);
 		response.setHeader( "Location", "/" );
 		response.setHeader( "Connection", "close" );

	}
	
}