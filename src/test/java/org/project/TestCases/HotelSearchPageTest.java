package org.project.TestCases;

import org.project.Utilities.DataUtilities;
import org.project.base.Basepage;
import org.project.pages.HomePage;
import org.project.pages.HotelSearchPage;
import org.project.pages.HotelSearchResultPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelSearchPageTest extends Basepage {
	
	
	@BeforeMethod
	 public void LaunchBrowser() {
		super.initializeBrowser();
		
		}
	
	@Test(dataProvider="getData", dataProviderClass=DataUtilities.class)
	
	public void SearchHotel(String Location, String CheckInDate, String CheckOutDate) {
		
		HomePage hp= new HomePage();
		HotelSearchPage hsp= hp.GoToHotelPage();
		HotelSearchResultPage hsrp = hsp.HotelSearch(Location, CheckInDate, CheckOutDate);
		
		}
		
		@AfterMethod
		public void Close() {
			
			super.closebrowser();
		}
	}
	
	
	
	
	


