package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng extends BaseClass {
	@BeforeMethod
	private void starttime() {
		Date d = new Date();
		System.out.println("Start time: "+d);
	}

	@AfterMethod
	private void endtime() {
		Date d = new Date();
		System.out.println("End time:" +d);

	}

	@BeforeClass
	private void Launchbrowser() {
		launchbrowser();
		windowmaximize();
	}

	@AfterClass
	private void closebrowser() {
		closeEntireBrowser();
	}

	@Test(priority = -5)
	private void tc1() {
		System.out.println("Test case ...GMAIL");
       launchurl("https://accounts.google.com/");
	}

	@Test
	private void tc7() {
		System.out.println("Test case...Inmakes");
     launchurl("https://inmakes.com/");	
	}

	@Test(priority = -15)
	private void tc6() {
		System.out.println("Test case...RedBus");
     launchurl("https://www.redbus.in/");
	}
	@Test(priority = 10)
	private void tc4() {
		System.out.println("Test case...Flipkart");
		launchurl("https://www.flipkart.com/");
	}
	@Test(priority = 2)
	private void tc2() {
		System.out.println("Test case...Amazon");	
		launchurl("https://www.amazon.in/");
	}
	@Test(priority = 2)
	private void tc5() {
		System.out.println("Test case...Facebook");
	  launchurl("https://en-gb.facebook.com/");
	}
	@Test(priority = 7)
	private void tc3() {
		System.out.println("Test case...Youtube");
    launchurl("https://www.youtube.com/");
	}
	}
