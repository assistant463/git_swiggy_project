package com.swiggy.testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.swiggy.pages.CheckOut;
import com.swiggy.pages.Items;
import com.swiggy.pages.Landingpage;
import com.swiggy.pages.PlaceOrder;

public class Driver extends Tools {
	protected static DesiredCapabilities cap;
	protected static Landingpage landingPage;
 	protected static Items items;
	protected static PlaceOrder placeOrder;
	protected static CheckOut checkOut;
	
	public static void init() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.LINUX);
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	
		 landindPage = new Landingpage(driver);
		items = new Items(driver);
		placeOrder = new PlaceOrder(driver);
		checkOut = new CheckOut(driver);
		
	}

}
