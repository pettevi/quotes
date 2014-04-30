package com;

import java.util.Random;

public class Quotes {

	public static String[][] quotes =
	{
		{"Billions of blue blistering barnacles", "H"},
		{"Blistering blundering bird-brain", "C"},	
		{"Blue Blistering Bell-Bottomed Balderdash!", "D"},		
		{"Bloodsuckers!", "T"}
	};
	
	public static int[] votes = 
	{
		0,0,0,0
	};
	
	public static Quote getRandomQuote()
	{
		Random r = new Random();
		int i = r.nextInt(quotes.length);
		
		Quote quote = new Quote(quotes[i][0], quotes[i][1]);
		quote.ID = i;
		quote.votes = votes[i];
		
		return quote;
	}
	
	
}
