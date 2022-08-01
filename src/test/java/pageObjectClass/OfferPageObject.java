package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SetUpClass;

public class OfferPageObject {
	
	SetUpClass setUp;
	public WebDriver driver;
	
	public OfferPageObject(WebDriver driver)
	{
		this.driver=driver;
	}

	private By search = By.xpath("//input[@id='search-field']");
	private By getProductText = By.xpath("//table[@class=\"table table-bordered\"]/tbody/tr/td[1]");

	public void searchProduct(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchProduct()
	{
		driver.findElement(search).getText();
	}
	
	public String getProduct()
	{
		return driver.findElement(getProductText).getText();
	}

}
