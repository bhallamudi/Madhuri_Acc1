package TestRunDLPFlow;

import org.testng.annotations.Test;

import TestCaseDLPFlow.*;


public class RunAddUserInPortal {
	
	@Test
	public void RunAddUserInDLPPortal() throws Throwable {
		Setup su= new Setup();
		addUserInPortal addUser= new addUserInPortal();
		su.InvokeBrowser();
		su.InvokeURL();
		addUser.addUser();
		su.QuitBrowser();
	}

}
