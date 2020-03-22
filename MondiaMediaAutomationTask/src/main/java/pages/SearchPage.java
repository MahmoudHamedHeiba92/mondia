package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	public WebDriver driver;

	public SearchPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy (xpath = "//form//input[@id=\"ss\"]")
	WebElement placesearch;
	
	@FindBy (xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")
	WebElement checkincal;
	
	@FindBy (xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[3]/span/span")
	WebElement checkinday;

	@FindBy (xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[4]/span/span")
	WebElement checkoutday;
	
	@FindBy (xpath = "//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")
	WebElement Checkinoutdate;

	@FindBy (xpath = "//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")
	WebElement searchBtn;
	
	@FindBy (xpath="//*[@id=\"right\"]/div[5]")
	WebElement pageresult;
	
	@FindBy (xpath = "/html/body/div[4]/div/div[3]/div[1]/div[1]/div[7]/div[3]/div[1]/div/div[5]/div[2]/div[1]/div[2]/div/div/a/div/div[2]/div[1]")
	WebElement hotelrate;
	
	@FindBy (xpath = "/html/body/div[4]/div/div[3]/div[1]/div[1]/div[7]/div[3]/div[1]/div/div[5]/div[2]/div[1]/div[1]/div[1]/h3/a/span[1]")
	WebElement hotelname;
	
	
	@FindBy (xpath = "/html/body/div[4]/div/div[3]/div[1]/div[1]/div[7]/div[3]/div[1]/div/div[5]/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[2]/div\r\n")
	WebElement hotelprice;
	
	@FindBy (xpath = "//*[@id=\"hotel_247344\"]/a/img")
	WebElement hotelpic;
	
	@FindBy (xpath = "//*[@id=\"hp_hotel_name\"]")
	WebElement hotelchoosen;
	
	public void SearchPage(String placename) 
	{	
		
		placesearch.click();
		placesearch.sendKeys(placename);
		checkincal.click();
		checkinday.click();
		checkoutday.click();
		searchBtn.click();
		assertTrue(pageresult.isDisplayed());
		String rate = hotelrate.getText();
		assertEquals(rate, "Very Good","Wonderful");
		String name = hotelname.getText();
		String price = hotelprice.getText();
		assertTrue(hotelpic.isDisplayed());
		hotelname.click();
		assertEquals(hotelchoosen, hotelname);
	}
	
	
}