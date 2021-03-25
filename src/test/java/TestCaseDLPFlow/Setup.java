package TestCaseDLPFlow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configurations.ConfiguratorSupport;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	
	static WebDriver driver;
	public static ConfiguratorSupport cs= new ConfiguratorSupport("Environment.properties");
	
	public void  InvokeBrowser() throws Throwable {
		String browser;
		browser=cs.getproperty("BrowserName");
				if(browser.equalsIgnoreCase("chrome")) {
					String chromePath= cs.getproperty("chromepath");
					System.setProperty("webdriver.chrome.driver", chromePath);
					driver = new ChromeDriver();
				}
	}
	

	public void InvokeURL() {
		
		driver.get(cs.getproperty("ProjectURL"));
	}
	

	public void QuitBrowser() {
		driver.close();
	}

}
