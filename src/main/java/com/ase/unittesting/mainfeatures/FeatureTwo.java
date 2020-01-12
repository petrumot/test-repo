package com.ase.unittesting.mainfeatures;

public class FeatureTwo {
	
	public long howManyYearsUntilEndOfTheWorld(boolean useFossils) {
		if(useFossils)
			return 100;
		
		return 1000000;
	}
	
	public String whoAteTheCookieFromTheCookieJar(boolean lie) {
		if (lie)
			return "you";
		else
			return "me";
	}

}
