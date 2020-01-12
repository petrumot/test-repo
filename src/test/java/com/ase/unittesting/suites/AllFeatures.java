package com.ase.unittesting.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ase.unittesting.mainfeatures.FeatureOneTest;
import com.ase.unittesting.mainfeatures.FeatureTwoTest;
import com.ase.unittesting.otherfeatures.FeatureThreeTest;

@RunWith(Suite.class)
@SuiteClasses({ FeatureOneTest.class, FeatureThreeTest.class, FeatureTwoTest.class })
public class AllFeatures {

}
