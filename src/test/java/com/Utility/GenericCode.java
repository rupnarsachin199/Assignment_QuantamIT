package com.Utility;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class GenericCode 
{
	static WebDriver driver;
	
	//Scroll method
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,10000)");
	}
	
	
	
}
