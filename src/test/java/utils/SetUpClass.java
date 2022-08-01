package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectManager.PageObjectManagerClass;
import pageObjectClass.CheckOutPageObject;

public class SetUpClass {

		public WebDriver driver;
		public String GreenKartPageproductName,OfferPageProductName;
		public PageObjectManagerClass pageManager;
		public BaseClass baseObject;
		public GenericUtilClass genericUtils;
		
		
		public SetUpClass() throws IOException
		{
			baseObject=new BaseClass();
			pageManager = new PageObjectManagerClass(baseObject.WebDriverManager());
			genericUtils= new GenericUtilClass(baseObject.WebDriverManager());
		}

	}