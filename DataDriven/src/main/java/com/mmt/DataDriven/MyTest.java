package com.mmt.DataDriven;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest {
	
	@Test
	public void baseURL() {
		//String baseURL = "google.com";
		Assert.assertEquals("google.com", "google.com"); 
		
			
	}
	
	@BeforeTest
	public void myText() {
		System.out.println("my data");
	}
	
	

}
