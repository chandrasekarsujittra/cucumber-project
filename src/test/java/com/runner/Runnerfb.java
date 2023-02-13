package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile", 
glue = "com\\stepdef", 
stepNotifications = true, 
publish = true, 
monochrome = true, 
dryRun = false,
tags = "@login or @Regression",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runnerfb {

}