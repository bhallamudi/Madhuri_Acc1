package TestRunDLPFlow;
import TestCaseDLPFlow.*;


import org.testng.annotations.Test;


public class RunTestCase1 {
	
	@Test
	public static void RunTest1() throws Throwable {
		Setup su= new Setup();
		TestCase1 TC1= new TestCase1();
		su.InvokeBrowser();
		su.InvokeURL();
		TC1.method1();
		TC1.method2();
		su.QuitBrowser();
	}
	
	

}
