package org.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.project.base.Basepage;

public class HotelSearchPage extends Basepage {
	
	@FindBy(css="button[data-stid=location-field-destination-menu-trigger]")
	WebElement LocationBtn;
	
	@FindBy(css="input[id=location-field-destination]")
	WebElement LocationInput;
	
	@FindBy(css="button[id=d1-btn]")
	WebElement CheckInDateBtn;
	
	@FindBy(css="button[id=d2-btn]")
	WebElement CheckOutDateBtn;
	
	@FindBy(css="button[data-stid=apply-date-picker]")
	WebElement DoneBtn;
	
	@FindBy(css="button[data-testid=submit-button]")
	WebElement SearchBtn;
	
	public HotelSearchResultPage HotelSearch(String Location, String CheckInDate, String CheckOutDate) {
		
		LocationBtn.click();
		LocationInput.sendKeys(Location);
		
		CheckInDateBtn.click();
		WebElement CheckInDateInput = driver.findElement(By.xpath("//button[@aria-label='"+CheckInDate+"']"));
		CheckInDateInput.click();
		
		CheckOutDateBtn.click();
		WebElement CheckOutDateInput = driver.findElement(By.xpath("//button[@aria-label='"+CheckOutDate+"']"));
		CheckOutDateInput.click();
		
         DoneBtn.click();
		 SearchBtn.click();
		 
		return new HotelSearchResultPage();
		
	}
	
	
}
