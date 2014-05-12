package com;

public class Book 
{

	public static final int TINTIN_IN_AFRICA = 1;
	public static final int TINTIN_IN_AMERICA = 2;
	public static final int CIGARS_OF_THE_PHARAOH = 3;
	public static final int THE_BLUE_LOTUS = 4;
	public static final int TINTIN_AND_THE_BROKEN_EAR = 5;
	public static final int THE_BLACK_ISLAND = 6;
	public static final int KING_OTTOKARS_SCEPTRE = 7;
	public static final int THE_CRAB_WITH_THE_GOLDEN_CLAWS = 8;
	public static final int THE_SHOOTING_STAR = 9;
	public static final int THE_SECRET_OF_THE_UNICORN = 10;
	public static final int RED_RACKHAMS_TREASURE = 11;
	public static final int THE_SEVEN_CRYSTAL_BALLS = 12;
	public static final int PRISONERS_OF_THE_SUN = 13;
	public static final int LAND_OF_BLACK_GOLD = 14;
	public static final int DESTINATION_MOON = 15;
	public static final int EXPLORERS_ON_THE_MOON = 16;
	public static final int THE_CALCULUS_AFFAIR = 17;
	public static final int THE_RED_SEA_SHARKS = 18;
	public static final int TINTIN_IN_TIBET = 19;
	public static final int THE_CASTAFIORE_EMERALD = 20;
	public static final int FLIGHT_714 = 21;
	public static final int TINTIN_AND_THE_PICAROS = 22;

	public static String getBookName(int bookid)
	{
		String book;

		switch (bookid)
		{
		case TINTIN_IN_AFRICA:
			book = "Tintin In Africa";
			break;
		case TINTIN_IN_AMERICA:
			book = "Tintin In America";
			break;
		case CIGARS_OF_THE_PHARAOH:
			book = "Cigars Of The Pharaoh";
			break;
		case THE_BLUE_LOTUS:
			book = "The Blue Lotus";
			break;
		case TINTIN_AND_THE_BROKEN_EAR:
			book = "Tintin And The Broken Ear";
			break;
		case THE_BLACK_ISLAND:
			book = "The Black Island";
			break;
		case KING_OTTOKARS_SCEPTRE:
			book = "King Ottokar's Sceptre";
			break;
		case THE_CRAB_WITH_THE_GOLDEN_CLAWS:
			book = "The Crab With The Golden Claws";
			break;
		case THE_SHOOTING_STAR:
			book = "The Shooting Star";
			break;
		case THE_SECRET_OF_THE_UNICORN:
			book = "The Secret Of The Unicorn";
			break;
		case RED_RACKHAMS_TREASURE:
			book = "Red Rackham's Treasure";
			break;
		case THE_SEVEN_CRYSTAL_BALLS:
			book = "The Seven Crystal Balls";
			break;
		case PRISONERS_OF_THE_SUN:
			book = "Prisoners Of The Sun";
			break;
		case LAND_OF_BLACK_GOLD:
			book = "Land Of Black Gold";
			break;
		case DESTINATION_MOON:
			book = "Destination Moon";
			break;
		case EXPLORERS_ON_THE_MOON:
			book = "Explorers On The Moon";
			break;
		case THE_CALCULUS_AFFAIR:
			book = "The Calculus Affair";
			break;
		case THE_RED_SEA_SHARKS:
			book = "The Red Sea Sharks";
			break;
		case TINTIN_IN_TIBET:
			book = "Tintin In Tibet";
			break;
		case THE_CASTAFIORE_EMERALD:
			book = "The Castafiore Emerald";
			break;
		case FLIGHT_714:
			book = "Flight 714";
			break;
		case TINTIN_AND_THE_PICAROS:
			book = "Tintin And The Picaros";
			break;
		default:
			book = "Unknown";
			break;			
		}
		
		return book;
	}
}
