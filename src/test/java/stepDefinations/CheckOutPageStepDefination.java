package stepDefinations;

import org.testng.Assert;

import PageObjectManager.PageObjectManagerClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectClass.CheckOutPageObject;
import pageObjectClass.LandingPageObject;
import utils.SetUpClass;

public class CheckOutPageStepDefination {
	
	SetUpClass setUp;
	PageObjectManagerClass pageManager;
	public CheckOutPageObject checkOutObject ;
	
	
	
	public CheckOutPageStepDefination(SetUpClass setUp)
	{
		this.setUp=setUp;
		this.checkOutObject=setUp.pageManager.getCheckOutPage();
	}
	
/**
 * 
 */
@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
	
	Assert.assertTrue(checkOutObject.verifyPromoButton());
	Assert.assertTrue(checkOutObject.verifyPlaceOrderButton());
	}

@Then("^User proceeds to Checkout and validate the (.+) in checkout page$")

	public void User_proceeds_to_Checkout_and_validate(String name) throws InterruptedException
	{
	checkOutObject.checkBasket();
	Thread.sleep(3000);
	}
	


}
