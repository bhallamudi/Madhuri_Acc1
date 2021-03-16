package TestCaseDLPFlow;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Configurations.PropertiesFile;

public class ExcelFlow {
	static String TodayFilePathString = "E:\\Accenture related works\\DLP_Automation\\ResourceRoster_AllStatus_2021 (5).xlsx";
	static String yesterdayFilePathString = "E:\\Accenture related works\\DLP_Automation\\ResourceRoster_AllStatus_2021 (4).xlsx";
	static String sheetNameString = "ResourceRoster_AllStatus_2021";

	public static void compareTwoExcelsForNewOldUserCheck() throws IOException 
	{
		PropertiesFile.getproperties();
		List<pojo> data1 = new ArrayList<>();
		List<pojo> data2 = new ArrayList<>();
		List<pojo> data3 = new ArrayList<>();
		List<pojo> data4 = new ArrayList<>();
		
		FileInputStream file1 = new FileInputStream(TodayFilePathString);
		FileInputStream file2 = new FileInputStream(yesterdayFilePathString);

		// Get the workbook instance for XLSX file
		XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
		XSSFWorkbook workbook2 = new XSSFWorkbook(file2);

		// Get only first sheet from the workbook
		 XSSFSheet sheet1 = workbook1.getSheet(sheetNameString);
		 XSSFSheet sheet2 = workbook2.getSheet(sheetNameString);
		
		 //Get New resources
		 for(int i = 1;i<=sheet1.getLastRowNum();i++) {
				String workerid= sheet1.getRow(i).getCell(5).getStringCellValue();
				String emailid= sheet1.getRow(i).getCell(12).getStringCellValue();
				
				
				pojo p= new pojo(workerid, emailid);
				data1.add(p);
	
			}
			//Get Remove Resources
			for(int i = 1;i<=sheet2.getLastRowNum();i++) {
				String workerid= sheet2.getRow(i).getCell(5).getStringCellValue();
				String emailid= sheet2.getRow(i).getCell(12).getStringCellValue();
				
				pojo p= new pojo(workerid, emailid);
				data2.add(p);
	
			}
			System.out.println("Today's Data: "+data1.size());
			System.out.println("Yesterday's data: "+data2.size());
			
			
			List<String> workerid1=new ArrayList<>();
			for(int i=0;i<data1.size();i++) {
				workerid1.add(data1.get(i).getWorkerId());
			}
			List<String> workerid2=new ArrayList<>();
			for(int i=0;i<data2.size();i++) {
				workerid2.add(data2.get(i).getWorkerId());
			}
			int count=0;
			for (String process : workerid1) {
				if (!workerid2.contains(process)) {
					pojo p=new pojo(data1.get(count).getWorkerId(), data1.get(count).getEmailId());
					data3.add(p);
				}
				count++;
			}
			System.out.println("New Resources: "+data3.size());
			System.out.println();
			data3.forEach(System.out::println);
			int count1=0;
			for (String process : workerid2) {
				if (!workerid1.contains(process)) {
					pojo p=new pojo(data2.get(count1).getWorkerId(), data2.get(count1).getEmailId());
					data4.add(p);
				}
				count1++;
			}
			
			System.out.println("Removed Resources: "+data4.size());
			System.out.println();
			data4.forEach(System.out::println);
			
	}
	
	public static void compareDataForDuplicateCheck() throws IOException {
		
		List<pojo> data5 = new ArrayList<>();	
		FileInputStream file1 = new FileInputStream(TodayFilePathString);
		// Get the workbook instance for XLSX file
		XSSFWorkbook workbook1 = new XSSFWorkbook(file1);

		// Get only first sheet from the workbook
		 XSSFSheet sheet1 = workbook1.getSheet(sheetNameString);
			
			//Duplicates check
			for(int i = 1;i<=sheet1.getLastRowNum();i++) {
				String worker= sheet1.getRow(i).getCell(11).getStringCellValue();
				String email= sheet1.getRow(i).getCell(12).getStringCellValue();
				pojo p= new pojo(worker, email);
				data5.add(p);
			}
			
			System.out.println("Duplicat check data "+data5.size());
			List<String> email=new ArrayList<>();
			for(int i=0;i<data5.size();i++) {
				email.add(data5.get(i).getEmailId());
			}
			HashSet<String> set = new HashSet<String>();
			List<String> duplicateList1 = new ArrayList<String>();
		

		    int count = 0;
		    for (String item : email)
		    {
		        if (!set.contains(item))
		        {              
		            set.add(item);
		        } else 
		        {
		           duplicateList1.add(item);      
		        }
		        count++;
		    }
		 
		   List<pojo> data8=new ArrayList<pojo>();
		    for (int i=0 ;i<duplicateList1.size() ; i++){
		    	String tempEmailString=duplicateList1.get(i);
		    	for(int j=0;j<data5.size();j++) {
		    		if(data5.get(j).getEmailId().equals(tempEmailString)) {
		    			data8.add(new pojo(data5.get(j).getWorkerId(), data5.get(j).getEmailId()));
		    		}
		    		else {
		    			continue;
		    		}
		    	}
		         
		      }
		    
		    
		    List<String> worker=new ArrayList<>();
			for(int i=0;i<data8.size();i++) {
				worker.add(data8.get(i).getWorkerId());
			}
		    List<String> duplicateList2 = new ArrayList<String>();
		    HashSet<String> set1 = new HashSet<String>();
			 int count2 = 0;
			    for (String item : worker)
			    {
			        if (!set1.contains(item))
			        {              
			            set1.add(item);
			        } else 
			        {
			           duplicateList2.add(item);      
			        }
			        count2++;
			    }    
		    System.out.println("Duplicate Resources: "+duplicateList2.size());
			System.out.println();
			duplicateList2.forEach(System.out::println);
		 
	}
	
	public void subKAny() throws IOException {
		
		
		List<String> data1 = new ArrayList<String>();
		List<String> subK = new ArrayList<String>();
		FileInputStream file1 = new FileInputStream(TodayFilePathString);
		// Get the workbook instance for XLSX file
		XSSFWorkbook workbook1 = new XSSFWorkbook(file1);

		// Get only first sheet from the workbook
		 XSSFSheet sheet1 = workbook1.getSheet(sheetNameString);
		 String Tag1 = "@accenture.com";
		 String Tag2 = "@Accenture.Com";
			//Sub K Check
			for(int i = 1;i<=sheet1.getLastRowNum();i++) {
				String email= sheet1.getRow(i).getCell(12).getStringCellValue();
				if(email.contains(Tag1))
				{
					data1.add(email);
				}
				else {
					if(email.contains(Tag2))
					{
						continue;
					}
					else {
					subK.add(email);
					}
				}
			}
			
			System.out.println("Sub K Count Checking for "+subK.size());
			subK.forEach(System.out::println);
			
	}

}
