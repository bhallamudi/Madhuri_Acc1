package TestRunDLPFlow;

import org.testng.annotations.Test;

import TestCaseDLPFlow.*;

public class RunTestCase2 {
	
	@Test
	public static void RunTest2() throws Throwable {
		Setup su= new Setup();
		TestCase2 TC2= new TestCase2();
		su.InvokeBrowser();
		su.InvokeURL();
		TC2.method1();
		TC2.method2();
		su.QuitBrowser();
	}

}
