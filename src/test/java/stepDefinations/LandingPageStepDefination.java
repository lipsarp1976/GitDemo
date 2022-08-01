package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjectManager.PageObjectManagerClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectClass.CheckOutPageObject;
import pageObjectClass.LandingPageObject;
import utils.SetUpClass;

public class LandingPageStepDefination {
	SetUpClass setUp;
	PageObjectManagerClass pageManager;
	LandingPageObject lpd;
	
	
	public LandingPageStepDefination(SetUpClass setUp)
	{
		this.setUp=setUp;
		this.lpd=setUp.pageManager.getLandingPage();
	}
	
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		//setUp.driver = new ChromeDriver();
		//setUp.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Assert.assertTrue(lpd.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) {
		//pageManager=new PageObjectManagerClass(setUp.driver);
		
		//LandingPageObject lpd=new LandingPageObject(setUp.driver);
		
		lpd.searchProduct(shortname);
		
		setUp.GreenKartPageproductName=lpd.getTextProduct().split("-")[0].trim();
	    System.out.println(setUp.GreenKartPageproductName+"extracted from productpage");
	}
	
	@When("Added {string} items of the selected to cart")

	public void Added_items_of_the_selected_to_cart(String quantity) throws InterruptedException
	{
		
		lpd.incrementQuantity(Integer.parseInt(quantity));
		
		lpd.addToCart();
		
	}




}
