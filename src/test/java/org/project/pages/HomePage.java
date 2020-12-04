package org.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.project.base.Basepage;

public class HomePage extends Basepage {
	
	//@FindBy(css="a[href*=flight-pwa]")
	WebDriver driver = new ChromeDriver();
	WebElement FlightTab = driver.findElement(By.cssSelector("a[href*=flight-pwa]"));
	
	@FindBy(css="a[href*=hotel-pwa")
	WebElement HotelTab;
	
	public FlightSearchPage GoToFlightPage() {
		FlightTab.click();
		
		return  new FlightSearchPage();
	}
	
	public HotelSearchPage GoToHotelPage() {
		HotelTab.click();
		
		return  new HotelSearchPage();
	}
	

}
