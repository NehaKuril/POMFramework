package org.project.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	
	  public WebDriver driver = null;
	
public void initializeBrowser() {
	
		
		if(Constants.BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		else if(Constants.BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else {
			System.out.println("broswer not defined");
		}
		
		driver.get(Constants.URL);
		driver.manage().window().maximize();
		
	}
	
	public void closebrowser() {
		driver.close();
	}
	

	
	

}
