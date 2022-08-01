package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SetUpClass;

public class LandingPageObject {
	
	SetUpClass setUp;
	public WebDriver driver;
	
	public LandingPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By getText= By.xpath("//div[@class=\"product\"]/h4");
	private By dealLink= By.linkText("Top Deals");
	private By increment=By.cssSelector("a.increment");
	private By addToCartButton=By.xpath("//button[text()='ADD TO CART']");
			
	
	public void searchProduct(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchProduct()
	{
		driver.findElement(search).getText();
	}
	
	public String getTextProduct()
	{
		return driver.findElement(getText).getText();
	}
	
	public void switchToWindow()
	{
		driver.findElement(dealLink).click();
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public void incrementQuantity(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart()
	{
		driver.findElement(addToCartButton).click();
	}

}
