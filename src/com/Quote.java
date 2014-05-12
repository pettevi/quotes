package com;

public class Quote {

	String quote;
	int characterid = 0;
	int quoteID = 0;
	int votes = 0;
	int bookid = 0;

	/**
	 * Captain Haddock = 1
	 * Prof. Calculus = 2
	 * Thomson & Thompson = 3
	 * Tintin = 4
	 * Snowy = 5
	 * 
	 * @param quote
	 * @param name
	 * @param book
	 */
	public Quote(String quote, int characterid, int bookid) 
	{
		super();
		this.quote = quote;
		this.characterid = characterid;
		this.bookid = bookid;
	}
	
}
