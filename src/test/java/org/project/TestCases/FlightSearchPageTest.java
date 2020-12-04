package org.project.TestCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.project.Utilities.DataUtilities;
import org.project.base.Basepage;
import org.project.pages.FlightSearchPage;
import org.project.pages.FlightSearchResultPage;
import org.project.pages.HomePage;
import org.testng.annotations.BeforeMethod;


public class FlightSearchPageTest extends Basepage{
	
	
	
	@BeforeMethod
	 public void LaunchBrowser() {
		super.initializeBrowser();
		
		}
	
	@Test(dataProvider = "getData", dataProviderClass = DataUtilities.class)
	public void SearchFlight(String Origin, String Destination, String DepartDate, String ReturnDate) {
		
		HomePage hp = new HomePage();
		FlightSearchPage fsp = hp.GoToFlightPage();
		FlightSearchResultPage fsrp = fsp.SearchResult(Origin, Destination, DepartDate, ReturnDate);
		
	}
	
	@AfterMethod
	public void Close() {
		super.closebrowser();
	}
}
