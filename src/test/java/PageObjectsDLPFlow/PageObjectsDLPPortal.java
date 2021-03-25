package PageObjectsDLPFlow;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsDLPPortal {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Group Web Administration']")
	WebElement title;
	
	public PageObjectsDLPPortal() {
		PageFactory.initElements(driver, this);
	}
}
