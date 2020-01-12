package com.ase.unittesting.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ase.unittesting.features.FeatureOneTest;
import com.ase.unittesting.features.FeatureTwoTest;

@RunWith(Suite.class)
@SuiteClasses({ FeatureOneTest.class, FeatureTwoTest.class })
public class MainFeatures {

}
