package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.SetUpClass;

public class Hooks {
	
	SetUpClass setUp;
	
	public Hooks(SetUpClass setUp )
	{
		this.setUp=setUp;
	}
	
	@After
	public void afterScenario() throws IOException
	 {
		
		setUp.baseObject.WebDriverManager().quit();
	 }
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = setUp.baseObject.WebDriverManager();
		if(scenario.isFailed())
		{
			File SourcePath1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(SourcePath1);
			scenario.attach(fileContent, "image/png", "image");
			
						
		}
	}
	

}
