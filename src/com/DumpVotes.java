package com;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DumpVotes extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	{	
		resp.setContentType("text/plain");
		
		for ( int i = 0; i < Quotes.quotes.length; i++)
		{
			String name = Character.getName(Quotes.quotes[i].characterid);
			resp.getWriter().println(name + " " + Quotes.quotes[i].votes + " " + Quotes.quotes[i].quote);
		}
	}
	

}
