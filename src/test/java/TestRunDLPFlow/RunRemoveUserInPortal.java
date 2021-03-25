package TestRunDLPFlow;

import org.testng.annotations.Test;

import TestCaseDLPFlow.*;

public class RunRemoveUserInPortal {
	
	@Test
	public static void RunRemoveUserInDLPPortal() throws Throwable {
		Setup su= new Setup();
		removeUserInPortal removeUser= new removeUserInPortal();
		//su.InvokeBrowser();
		su.InvokeURL();
		removeUser.removeUser();
	}

}
