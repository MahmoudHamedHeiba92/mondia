package tests;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.SearchPage;

public class placesearchtest extends TestBase
{

	SearchPage searchobject;
@Test
	public void UserSearch() throws InterruptedException {
		
	searchobject = new SearchPage(driver);
	
//	TestData :
	String SearchPlace = "Ain Sokhna, Suez Governorate, Egypt";

	
	
//	Steps:
		searchobject.SearchPage(SearchPlace);
		
		
		Thread.sleep(5000);
	}
}
 