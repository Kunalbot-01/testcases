package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericLibrary.DriverConfiguration;
import methodLibrary.OnlineToursPageLib;

public class TestTwo extends DriverConfiguration {

	@BeforeMethod
	public void navigateToApplication(){
		DriverConfiguration.driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("test end");
	}
	
	OnlineToursPageLib onlineToursPageLib;
	@BeforeClass
	public void config(){
		onlineToursPageLib = new OnlineToursPageLib();
	}
	
	public TestTwo(){
		
	}
}
