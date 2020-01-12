package com.ase.unittesting.mainfeatures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ase.unittesting.mainfeatures.FeatureTwo;

public class FeatureTwoTest {

	@Test
	public void testHowManyYearsUntilEndOfTheWorld() {
		FeatureTwo f2 = new FeatureTwo();
		
		long res = f2.howManyYearsUntilEndOfTheWorld(true);
		
		assertEquals(100, res);
	}

	@Test
	public void testWhoAteTheCookieFromTheCookieJar() {

		FeatureTwo f2 = new FeatureTwo();
		String res = f2.whoAteTheCookieFromTheCookieJar(false);
		
		assertEquals("me", res);
	}

}
