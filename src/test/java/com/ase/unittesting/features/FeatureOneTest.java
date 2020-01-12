package com.ase.unittesting.features;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ase.unittesting.features.FeatureOne;

public class FeatureOneTest {

	@Test
	public void testCureCancer() {
		FeatureOne f1 = new FeatureOne();
		boolean res = f1.cureCancer();
		
		assertTrue(res);
	}

	@Test
	public void testAnswerToTheUltimateQuestionOfLife() {
		FeatureOne f1 = new FeatureOne();
		int res = f1.answerToTheUltimateQuestionOfLife(true);
		
		assertEquals(42, res);
	}

}
