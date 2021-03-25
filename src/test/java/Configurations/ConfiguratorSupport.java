package Configurations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.File;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.tools.ant.property.GetProperty;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class ConfiguratorSupport {
	
	static Properties prop = new Properties();
	String strFileName;
	String strValue;
	static String ProjectPath = System.getProperty("user.dir");
	
	
	 @SuppressWarnings("unused")
	public String getproperty(String strKey) {

	        try (FileInputStream input = new FileInputStream(ProjectPath+"\\src\\main\\resources\\Environment.properties")) {


	            if (input == null) 
	            {
	                System.out.println("Environment.properties file not found");
	            }
	            else {
	            prop.load(input);
	            strValue = prop.getProperty(strKey);
	            }

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        return strValue;

	    }
	
	public static void setproperty(String strKey, String strValue) throws Throwable
	{
		PropertiesConfiguration con= new PropertiesConfiguration();
		con.setProperty(strKey, strValue);
		con.save();
	}
	public ConfiguratorSupport(String strFileName) {
		this.strFileName = strFileName;
	} 
	
	public static String getHostName() throws UnknownHostException{
		InetAddress addr=Inet4Address.getLocalHost();
		String hostname=addr.getHostName();
		return hostname;
		
	}
	
	

}
