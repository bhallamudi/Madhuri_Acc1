package TestRunDLPFlow;
import org.testng.annotations.Test;
import TestCaseDLPFlow.*;

public class RunExcelCompareForNewOldCheck {
	
	@Test
	public static void RunExcelCompareForNewOldCheck1() throws Throwable {
		//System.out.println("Total Memory (in bytes): " + Runtime.getRuntime().totalMemory());
      //  System.out.println("Free Memory (in bytes): " + Runtime.getRuntime().freeMemory());
      //  System.out.println("Max Memory (in bytes): " + Runtime.getRuntime().maxMemory());
		ExcelCompareForNewOldCheck EC= new ExcelCompareForNewOldCheck();
		EC.ExcelCompareForNewOldCheck();	
	}
}
