package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import com.Utility.GenericCode;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By logo = By.xpath("(//span[@class='site-logo-img'])[1]");
	//private By homeLink = By.xpath("(//a[text()='Home'])[1]");
	private By headerLinks = By.xpath("(//ul[@id='ast-hf-menu-1'])[1]");
	private By brandsLink = By.xpath("(//a[text()='Brands'])[1]");
	private By productsLink = By.xpath("(//a[text()='Products'])[1]");
	private By productSection = By.xpath("//section[@data-id='8dd8ae9']");
	private By carouselSection = By.xpath("//div[@data-id='1f1885ac']");
	private By footerSection = By.id("colophon");
	private By scrollUpBtn = By.id("ast-scroll-top");
	
	
	//Locators of first dropdown
	private By submenuFirstLink = By.xpath("(//a[text()='Laura Ashley'])[1]");
	private By submenuSecondLink = By.xpath("(//a[text()='Nest Home'])[1]");
	private By submenuLastLink = By.xpath("(//a[text()='Dunlopillo'])[1]");
	
	
	
	//Locators of second dropdown
	private By submenuFirstLinkSD = By.xpath("(//a[text()='Bedroom'])[1]");
	private By submenuSecondLinkSD = By.xpath("(//a[text()='Living'])[1]");
	private By submenuLastLinkSD = By.xpath("(//a[text()='Bathroom'])[1]");
	
	
	
	//LinkedIn icon
	private By linkedinFirstIconLink = By.xpath("//a[@class='elementor-icon']//*[name()='svg']");
	private By linkedinSecondIconLink = By.xpath("//*[@id=\"colophon\"]/div[1]/div/div/div[1]/div/div/div/a/span");
	
	
	
	//carousel arrows
	private By leftcarouselarrows= By.xpath("//div[@aria-label='Previous slide']");
	private By Rightcarouselarrows=By.xpath("//div[@aria-label='Next slide']");
	
	
	//email
	private By emailLink = By.linkText("Office@sleeplogik.co.uk");
	
	//common method
	public void moveToEle(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	
	public static void addWait()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Actions
	//1 is elements displayed?
	public void eleDisplay()
	{
		System.out.println(driver.findElement(logo).isDisplayed());
		System.out.println(driver.findElement(headerLinks).isDisplayed());
		System.out.println(driver.findElement(productSection).isDisplayed());
		System.out.println(driver.findElement(carouselSection).isDisplayed());
		System.out.println(driver.findElement(footerSection).isDisplayed());
		
		
		GenericCode.scrollDown(driver);
		WebElement scrollBtnElement = driver.findElement(scrollUpBtn);
		System.out.println(scrollBtnElement.isDisplayed());
		
		addWait();
		
		driver.findElement(scrollUpBtn).click();
	}
	
	
	//2. hover effect of dropdown
	public void hoverEffect()
	{
		//System.out.println(driver.findElement(headerLinks).isDisplayed());
		
		WebElement element = driver.findElement(brandsLink);
		WebElement element2 = driver.findElement(productsLink);
		
		moveToEle(element);
		
		moveToEle(element2);
						
	}
	
	
	
	//3. submenues of first dropdown
	//TS_005
	public void submenuLinksOfFirstDropdwn()
	{
		WebElement element = driver.findElement(brandsLink);
		
		
		//first item(TC_009)
		moveToEle(element);
		driver.findElement(submenuFirstLink).click();
		driver.navigate().back();
		
		addWait();
		
		//second item(TC_010)
		moveToEle(element);
		driver.findElement(submenuSecondLink).click();
		driver.navigate().back();
		
		addWait();
		
		// third item(TC_011)
		moveToEle(element);
		driver.findElement(submenuLastLink).click();
		driver.navigate().back();
		
		addWait();
		
	}
	
	
	//TS_005
		public void submenuLinksOfSecondDropdwn()
		{
			WebElement element = driver.findElement(productsLink);
			
			
			//first item(TC_012)
			moveToEle(element);
			driver.findElement(submenuFirstLinkSD).click();
			driver.navigate().back();
			
			addWait();
			
			//second item(TC_013)
			moveToEle(element);
			driver.findElement(submenuSecondLinkSD).click();
			driver.navigate().back();
			
			addWait();
			
			// third item(TC_014)
			moveToEle(element);
			driver.findElement(submenuLastLinkSD).click();
			driver.navigate().back();
			
			addWait();
			
		}
		
		
		//LinkedIn (TC_017)
		public void linkedInFirstIconLink()
		{
			driver.findElement(linkedinFirstIconLink).click();
			addWait();

			
			driver.navigate().back();
			
			
//			try {
//				driver.findElement(linkedinSecondIconLink).click();
//			} catch (ElementClickInterceptedException e) {
//				driver.findElement(linkedinSecondIconLink).click();
//			}
//			addWait();
		}
	
		//LinkedIn (TC_018)
				public void linkedInSecondIconLink()
				{
					driver.findElement(linkedinSecondIconLink).click();
					addWait();
				}
	
		//carousel 
				public void carouselArrows()
				{
					driver.findElement(leftcarouselarrows).click();
					addWait();
					driver.findElement(Rightcarouselarrows).click();
				}
				
				
				
		//Email
				public void emailLink()

				{
					driver.findElement(emailLink).click();
				}
		
		
}
