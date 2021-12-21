 package org.runner;

import org.Util.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition",dryRun=false,
                 plugin= {"json:target\\reports\\sample.json"})


public class TestRunner extends JvmReport {
	
	@AfterClass
	public static void sampleReport() {
		generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\sample.json");
		
	}

	
	

}
