package utils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitClass {
	
public WebDriver driver;
	
	public WaitClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitMethod()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
