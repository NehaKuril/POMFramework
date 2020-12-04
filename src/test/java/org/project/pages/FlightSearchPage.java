package org.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.project.base.Basepage;

public class FlightSearchPage extends Basepage {
	
	@FindBy(css="button[data-stid=location-field-leg1-origin-menu-trigger]")
	WebElement OriginBtn;
	
	@FindBy(css="input[id=location-field-leg1-origin]")
	WebElement OriginInput;
	
	@FindBy(css="button[data-stid=location-field-leg1-destination-menu-trigger]")
	WebElement DestinationBtn;
	
	@FindBy(css="input[id=location-field-leg1-destination]")
	WebElement DestinationInput;
	
	@FindBy(css="button[id=d1-btn]")
	WebElement DepartDateBtn;
	
	@FindBy(css="button[id=d2-btn]")
	WebElement ReturnDateBtn;
	
	@FindBy(css="button[data-stid=apply-date-picker]")
	WebElement DoneBtn;
	
	@FindBy(css="button[data-testid=submit-button]")
	WebElement SearchBtn;
	
	public FlightSearchResultPage SearchResult(String Origin, String Destination, String DepartDate, String ReturnDate ){
		
		OriginBtn.click();
		OriginInput.sendKeys(Origin);
		
		DestinationBtn.click();
		DestinationInput.sendKeys(Destination);
		
		DepartDateBtn.click();
		WebElement DepartDateInput = driver.findElement(By.xpath("//button[@aria-label='"+DepartDate+"']"));
		DepartDateInput.click();
		
		ReturnDateBtn.click();
		WebElement ReturnDateInput = driver.findElement(By.xpath("//button[@aria-label='"+ReturnDate+"']"));
		ReturnDateInput.click();
		
		 DoneBtn.click();
		 
		 SearchBtn.click();
		 
		
		return new  FlightSearchResultPage();
		
		
	}
	
}
