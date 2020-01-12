package com.ase.unittesting.features;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ase.unittesting.features.FeatureThree;

public class FeatureThreeTest {

	@Test
	public void testWhyDidTheChickenCross() {
		FeatureThree f3 = new FeatureThree();
		
		boolean res = f3.isTheEarthFlat(true);
		
		assertTrue(res);
	}

	@Test
	public void testIsTheEarthFlat() {
		FeatureThree f3 = new FeatureThree();
		
		String res = f3.whyDidTheChickenCross(false);
		
		assertEquals("because", res);
		
	}

}
