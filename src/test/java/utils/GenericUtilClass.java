package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilClass {
	
	public WebDriver driver;
	
	public GenericUtilClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchWindowToChild()
	{
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> i1 = windows.iterator();
	String Parent = i1.next();
	String Child = i1.next();
	driver.switchTo().window(Child);
	}

}
