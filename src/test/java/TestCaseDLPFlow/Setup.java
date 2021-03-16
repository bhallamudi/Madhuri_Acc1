package TestCaseDLPFlow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configurations.PropertiesFile;

public class Setup {
	
	static WebDriver driver = null;
	public static String BrowserName;
	public static String url;
	public static String chromepath;
	
	
	
	
	
	
	public void InvokeBrowser() throws Throwable {
		String ProjectPath = System.getProperty("user.dir");
		PropertiesFile.getproperties();
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		}
		
	}
	

	public void InvokeURL() {
		PropertiesFile.getproperties();
		driver.get(url);
	}
	

	public void QuitBrowser() {
		driver.close();
	}

}
