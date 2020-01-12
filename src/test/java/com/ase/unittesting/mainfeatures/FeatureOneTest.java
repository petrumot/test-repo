package com.ase.unittesting.mainfeatures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ase.unittesting.mainfeatures.FeatureOne;

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
