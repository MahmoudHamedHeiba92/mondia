package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public WebDriver driver;
	
	//creating constructor
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
