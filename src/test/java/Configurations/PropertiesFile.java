package Configurations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import TestCaseDLPFlow.Setup;
import TestRunDLPFlow.RunTestCase1;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String ProjectPath = System.getProperty("user.dir");
	
	
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
