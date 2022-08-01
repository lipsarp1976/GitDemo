package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SetUpClass;

public class CheckOutPageObject {
	
	SetUpClass setUp;
	public WebDriver driver;
	
	public CheckOutPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By basketClick = By.xpath("//img[@alt='Cart']");
	private By checkOutClick= By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By applyPromo= By.xpath("//button[text()='Apply']");
	private By placeOrderButton= By.xpath("//button[text()='Place Order']");
	
	
	
	public void checkBasket()
	{
		driver.findElement(basketClick).click();
		driver.findElement(checkOutClick).click();
	}
	
	public boolean verifyPromoButton()
	{
		return driver.findElement(applyPromo).isDisplayed();
	}
	
	public boolean verifyPlaceOrderButton()
	{
		return driver.findElement(placeOrderButton).isDisplayed();
	}
	


}
