package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjectManager.PageObjectManagerClass;
import io.cucumber.java.en.Then;
import pageObjectClass.LandingPageObject;
import pageObjectClass.OfferPageObject;
import utils.SetUpClass;

public class OfferPageStepDefination {
	
	 SetUpClass setUp;
	 PageObjectManagerClass pageManager;
	 
	public OfferPageStepDefination(SetUpClass setUp)
	{
		this.setUp=setUp;
	}
	
	@Then("^User searched for same shortname (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) {
		
		switchToOffersPage();
		//pageManager=new PageObjectManagerClass(setUp.driver);
		OfferPageObject opo = setUp.pageManager.getOffersPage();
		opo.searchProduct(shortname);
		setUp.OfferPageProductName=opo.getProduct();
		
		System.out.println(setUp.OfferPageProductName+"extracted from offersPage");
	}
	
	public void switchToOffersPage()
	{
		    LandingPageObject lpd =setUp.pageManager.getLandingPage();
			lpd.switchToWindow();
			setUp.genericUtils.switchWindowToChild();
	}

	@Then("validate the products of both the pages")
	public void validate_the_products_of_both_the_pages() {
		Assert.assertEquals(setUp.GreenKartPageproductName,setUp.OfferPageProductName);
		//setUp.driver.quit();
	    
	}

}
