package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class QuotesServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	{
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	{
		Quote quote = Quotes.getRandomQuote();

		String name, image;
		if (quote.name.equals("H"))
		{
			name = "Captain Haddock";
			image = "haddock";
		}
		else if (quote.name.equals("C"))
		{
			name = "Prof. Calculus";
			image = "calculus";
		}
		else if (quote.name.equals("D"))
		{
			name = "Thomson & Thompson";
			image = "detectives";
		}
		else if (quote.name.equals("T"))
		{
			name = "Tintin";
			image = "tintin";
		}
		else
		{
			name = "unknown";
			image = "tintin";
		}

		req.setAttribute("quote", quote.quote);
		req.setAttribute("name", name);
		req.setAttribute("id", quote.ID);
		req.setAttribute("votes", quote.votes);
		req.setAttribute("image", image);

		try 
		{
			RequestDispatcher disp;
			disp = getServletContext().getRequestDispatcher("/index.jsp");
			if (disp != null)
				disp.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
