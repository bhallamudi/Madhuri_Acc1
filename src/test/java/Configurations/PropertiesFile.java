package Configurations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import TestCaseDLPFlow.Setup;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String ProjectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		 try (OutputStream output = new FileOutputStream(ProjectPath+"\\src\\test\\java\\Configurations\\Environment.properties")) {

	            Properties prop = new Properties();

	            // set the properties value
	            prop.setProperty("TodayExcelPath", "E:\\Accenture related works\\DLP_Automation\\ResourceRoster_AllStatus_2021 (5).xlsx");
	            prop.setProperty("YesterdayExcelPath", "E:\\Accenture related works\\DLP_Automation\\ResourceRoster_AllStatus_2021 (4).xlsx");
	            prop.setProperty("SheetName", "ResourceRoster_AllStatus_2021");

	            // save properties to project root folder
	            prop.store(output, null);

	            System.out.println(prop);
	            
	            propData1();

	        } catch (IOException io) {
	            io.printStackTrace();
	        }

	}
	public static void propData1() {
		String ProjectPath = System.getProperty("user.dir");
		try (InputStream input = new FileInputStream(ProjectPath+"\\src\\test\\java\\Configurations\\Environment.properties")) {
			
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            System.out.println(prop.getProperty("TodayExcelPath"));
            System.out.println(prop.getProperty("YesterdayExcelPath"));
            System.out.println(prop.getProperty("SheetName"));
		}
		catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	public static void getproperties()
	{
		try 
		{
		InputStream input = new FileInputStream(ProjectPath+"/src/test/java/Configurations/Environment.properties");
		prop.load(input);
		String Browser = prop.getProperty("Browser");
		System.out.println("Browser used for running testcase - "+Browser);
		Setup.BrowserName=Browser;
		String URL= prop.getProperty("url");
		Setup.url=URL;
		String chromeDriverPathString = prop.getProperty("chromepath");
		Setup.chromepath=chromeDriverPathString;
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void setproperties()
	{
		try 
		{
		OutputStream output = new FileOutputStream(ProjectPath+"src/test/java/Config/config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, "setting properties file");
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	

}
