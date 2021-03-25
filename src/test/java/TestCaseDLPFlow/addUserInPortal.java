package TestCaseDLPFlow;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addUserInPortal extends Setup{
	
	//Home Page
	By title2 = By.xpath("//span[text()='Group Web Administration']");
	
	//Group Management Page
	By myEditableGroupOption= By.xpath("//span[text()='My Editable Groups']");
	By searchTextIcon= By.xpath("//input[@name='_searchCriteria']");
	By searchIcon= By.xpath("//input[@name='_executeSearch']");
	By groupNameColumnHead= By.xpath("//td[text()='Group Name']"); 
	By groupDescriptionColumnHead=By.xpath("//td[text()='Group Description']"); 
	By groupName1=By.xpath("//a[text()='DLP_Automation']");
	By groupName2=By.xpath("//a[text()='DLP_Automation']");
	By groupName3=By.xpath("//a[text()='DLP_Automation']");
	
	//Respective Group page - Group 1
	By groupName1Lable=By.xpath("//span[text()='DLP_Automation']");
	By editGroupBtn= By.xpath("//input[@name='_editgroup']");
	
	//Edit Group Page
	By InformatioStatusBox=By.xpath("//td[text()='Information Status Box']");
	By groupMemberShipLbl=By.xpath("//span[@id='_groupMembershipLabel']");
	By groupMemberCount=By.xpath("//span[@id='_memberCount']");
	By searchBtnForAddPopup=By.xpath("//td[@class='TopBorder']//img[@class='SearchButton ImageButton']");
	By gropMemeberResultInTable=By.xpath("//tr[@class='MembersResultTableItem']//input");
	By DeleteSelectedItemsBtn=By.xpath("//input[@value='Delete Selected Members']");
	By SearchedResultStatus=By.xpath("//span[@id='_memberCountFiltered']");
	By SaveBtnInGroup=By.xpath("//input[@name='_save']");
	By SaveSatusInGroup=By.xpath("//span[text()='All group changes have been saved successfully']");
	
	//Add/Remove page
	By SearchTxtBoxInAddPopup=By.xpath("//input[@class='popup_searchInput']");
	By SearchBtnInAddPopup=By.xpath("//button[@class='popup_search_button popup_button']");
	By plusIconInAddPopup=By.xpath("//td[text()='+']");
	By SaveIconInAddPopup=By.xpath("//img[@alt='Save Changes']");
	By CancelIconInAddPopup=By.xpath("//img[@alt='Cancel Changes']");
	
	
	
	public void addUser() throws InterruptedException {
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.findElement(title2).isDisplayed();
		String pageTitle= driver.findElement(title2).getText();
		System.out.println("Portal Title is -->"+pageTitle);
		
	
	}

}
