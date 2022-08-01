package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream instream=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(instream);
		String url=prop.getProperty("url");
		//String browser_prop= prop.getProperty("browser");
		//String browser_maven=System.getProperty("browser");
		
		//String browser = browser_maven!=null ? browser_maven : browser_prop ;
		
		String browser= prop.getProperty("browser");
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			}
			else
				if(browser.equalsIgnoreCase("firefox"))
				{
					
				}
				else if(browser.equalsIgnoreCase("Edge"))
				{
					System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\msedgedriver.exe");
					WebDriver driver = new EdgeDriver();
					driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				} 
				else
				{
					System.out.println("Invalid Browser details");
				}
		}
		return driver;
	}

}
