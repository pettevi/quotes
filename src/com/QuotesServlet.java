package com;

import java.io.IOException;
import java.util.Random;

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
		String character = req.getParameter("character");

		Quote quote;

		try 
		{
			int characterid = Integer.parseInt(character);
			if (Character.validate(characterid))
			{
				quote = Quotes.getRandomQuote(characterid);
			}
			else
				quote = Quotes.getRandomQuote();
		}
		catch (NumberFormatException e)
		{
			quote = Quotes.getRandomQuote();	
		}
		
		String image = Character.getImage(quote.characterid);
		String name = Character.getName(quote.characterid);
		String book = Book.getBookName(quote.bookid);

		req.setAttribute("quote", quote.quote);
		req.setAttribute("name", name);
		req.setAttribute("id", quote.quoteID);
		req.setAttribute("votes", quote.votes);
		req.setAttribute("image", image);
		req.setAttribute("book", book);

		Random r = new Random();
		String s = "rgb(" + (255-r.nextInt(55)) + "," +  (255-r.nextInt(55)) + "," + (255-r.nextInt(55)) + ")";
		req.setAttribute("bgcolor", s);

		req.setAttribute("x1", 50 + r.nextInt(400));
		req.setAttribute("y1", 30 + r.nextInt(80));
		req.setAttribute("x2", r.nextInt(170));
		req.setAttribute("y2", r.nextInt(50));
		
		try 
		{
			RequestDispatcher disp;
			disp = getServletContext().getRequestDispatcher("/index.jsp");
			if (disp != null)
				disp.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
}