package com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.Pages.HomePage;

public class BaseClass 
{
	public WebDriver driver;
	public HomePage hp;
	
	
	
	
	
	//browser setup
	@BeforeTest
	public void browserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sleeplogik.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		hp = new HomePage(driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		
		
		driver.quit();
	}
	
	
	
}
