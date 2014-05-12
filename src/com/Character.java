package com;

public class Character {

	public static final int CAPTAIN_HADDOC = 1;
	public static final int PROF_CALCULUS = 2;
	public static final int DETECTIVES = 3;
	public static final int TINTIN = 4;
	public static final int SNOWY = 5;
	public static final int CASTAFIORE = 6;

	public static String getName(int characterid)
	{
		String name;

		switch (characterid)
		{
		case CAPTAIN_HADDOC:
			name = "Captain Haddock";
			break;
		case PROF_CALCULUS:
			name = "Prof. Calculus";
			break;
		case DETECTIVES:
			name = "Thomson & Thompson";
			break;
		case TINTIN:
			name = "Tintin";
			break;
		case SNOWY:
			name = "Snowy";
			break;
		case CASTAFIORE:
			name = "Bianca Castafiore";
			break;
		default:
			name = "Unknown";
			break;
		}
		
		return name;
	}
	

	public static String getImage(int characterid)
	{
		String image;
		
		switch (characterid)
		{
		case CAPTAIN_HADDOC:
			image = "haddock";
			break;
		case PROF_CALCULUS:
			image = "calculus";
			break;
		case DETECTIVES:
			image = "detectives";
			break;
		case TINTIN:
			image = "tintin";
			break;
		case SNOWY:
			image = "snowy";
			break;
		case CASTAFIORE:
			image = "castafiore";
			break;
		default:
			image = "tintin";
			break;
		}
		
		return image;
	}
	
	public static boolean validate(int characterid)
	{
		if (characterid == CAPTAIN_HADDOC || characterid == PROF_CALCULUS  || 
				characterid == DETECTIVES || characterid == TINTIN || characterid == SNOWY || characterid == CASTAFIORE)
			return true;
		else
			return false;
	}
}
