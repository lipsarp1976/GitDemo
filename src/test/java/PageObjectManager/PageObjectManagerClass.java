package PageObjectManager;

import org.openqa.selenium.WebDriver;

import pageObjectClass.CheckOutPageObject;
import pageObjectClass.LandingPageObject;
import pageObjectClass.OfferPageObject;

public class PageObjectManagerClass {
	
	public LandingPageObject landingPage;
	public OfferPageObject offerPage;
	public WebDriver driver;
	public CheckOutPageObject checkOut;
	
	public PageObjectManagerClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPageObject getLandingPage()
	{
		 landingPage = new LandingPageObject(driver);
		 return landingPage;
	}
	
	public OfferPageObject getOffersPage()
	{
		offerPage = new OfferPageObject(driver);
		return offerPage;
	}
	
	public CheckOutPageObject getCheckOutPage()
	{
		checkOut = new CheckOutPageObject(driver);
		return checkOut;
	}
}
