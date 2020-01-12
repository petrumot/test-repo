package com.ase.unittesting.mainfeatures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FeatureOneTest.class, FeatureThreeTest.class, FeatureTwoTest.class })
public class AllFeatures {

}
