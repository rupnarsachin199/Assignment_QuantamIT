package com.Test;



import org.testng.annotations.Test;



public class HomePageTest extends BaseClass
{
	
	// element display
  @Test(priority = 0)
  public void verifyElementsDisplay()
  {
	  hp.eleDisplay();
  }
  
  //hover effect
  @Test(priority=1)
  public void verifyHoverEffect()
  {
	  hp.hoverEffect();
  }
  
  
  //submenu validation
  @Test(priority = 2)
  public void verifyFirstDropdown()
  {
	  hp.submenuLinksOfFirstDropdwn();
  }
  
  @Test(priority = 3)
  public void verifySecondDropdown()
  {
	  hp.submenuLinksOfSecondDropdwn();
  }
  
  
  
  @Test(priority = 4)
  public void verifyFirstLinkedInconLink()
  {
	  hp.linkedInFirstIconLink();
  }
  
  
  @Test(priority=5)
  public void verifySecondLinkedInconLink()
  {
	  hp.linkedInSecondIconLink();
  }
 
  @Test(priority=6)
  public void verifyCarouselArrows()
  {
	  hp.carouselArrows();
  }
  
  
  @Test(priority = 7)
  public void verifyEmail()
  {
	  hp.emailLink();
  }
  
  

  
  
  
}
