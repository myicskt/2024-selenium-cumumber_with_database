package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.google.common.primitives.Booleans;

import util.DatabasePage;

public class ListAccountPage extends BasePage{

	WebDriver driver;

	public ListAccountPage(WebDriver webDriver) {
		this.driver = webDriver;
	}

	@FindBy(how = How.XPATH, using = "//header/div/strong[text()='Account List']") WebElement ACCOUNT_LIST_ELEMENT;

	@FindBy(how=How.XPATH, using="//header/button[text()='Add Account']") WebElement ADD_ACCOUNT_ELEMENT;
	
	@FindBy(how=How.XPATH, using="//h5[@id='accountModalLabel']") WebElement NEW_ACCOUNT_ELEMENT;
	
	@FindBy(how=How.XPATH, using ="//input[@id='account_name']") WebElement 	ACCOUNT_NAME_ELEMENT;
	
	@FindBy(how=How.XPATH, using= "//textarea[@id='description']") WebElement DESCRIPTION_ELEMENT;
	
	@FindBy(how=How.XPATH, using ="//input[@id='balance']") WebElement INITIAL_BALANCE_ELEMENT;
	
	@FindBy(how=How.XPATH, using = "//input[@id='account_number']") WebElement ACCOUNT_NUMBEER_ELEMENT;
	
	@FindBy(how=How.XPATH, using="//input[@id='contact_person']") WebElement CONTACT_PERSON_ELEMENT;
	
	@FindBy(how=How.XPATH, using ="//button[@id='accountSave']") WebElement SAVE_BUTTON_ELEMENT;
	
	
	// TABLE ELEMENT
	/*
	@FindBy(how=How.XPATH, using ="//*[@id=\"tBody\"]") WebElement TABLE_ELEMENT;
	
	
	
	@FindBy(how=How.XPATH, using ="//table/tbody[@id='tBody']/tr[1]") WebElement TABLE_ROW_N_ELEMENT;
	
	@FindBy(how=How.XPATH, using ="//table/tbody[@id='tBody']/tr[1]/td[3]") WebElement TEBEL_CELL_N_ELEMENT;
	
	*/
	@FindBy(how=How.XPATH, using ="//table/tbody[@id='tBody']/tr") List<WebElement> TABLE_ROWS_ELEMENT;
	@FindBy(how=How.XPATH, using ="//a[@id='yesBtn']") WebElement YES_FOR_DELETE;
	
	
	
	
	
	
	
	
	

	
	
	public void validAccountListPageTitle() {
		validatePageTitleOrElement(driver.getTitle(), "Manage Account");
	}
	
	public void validAccountListElement() {
		validatePageTitleOrElement(ACCOUNT_LIST_ELEMENT.getText(), "Account List");
	}
	
	public void clickOnAddAccountButton() {
		ADD_ACCOUNT_ELEMENT.click();
		
	}
	
	public void validateNewAccountElement() {
		validatePageTitleOrElement(NEW_ACCOUNT_ELEMENT.getText(), "New Account");
		
	}
	
	public void insertAccountName(String accountname) {
		
		ACCOUNT_NAME_ELEMENT.sendKeys(accountname);
		
	}
	public void insertDescription(String desp) {
		DESCRIPTION_ELEMENT.sendKeys(desp);
		
	}
	
	public void insertInitialBalaance(String blance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(blance);
		
	}
	
	public void insertAccountNumber(String accountNum) {
		ACCOUNT_NUMBEER_ELEMENT.sendKeys(accountNum);
		
	}
	
	public void insertContactPersonName(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
		
	}
	
	public void clickOnSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
		
		
		
		
	
	}
	
	
	public void validateDataFromAccountList(String accountNumber) {
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		driver.navigate().refresh();
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		int sizeOfList=TABLE_ROWS_ELEMENT.size();
		
		
		
		
		for(int i=1;i<=sizeOfList;i++) {
			
			
			WebElement element =driver.findElement(By.xpath("//table/tbody[@id='tBody']/tr["+i+"]/td[3]"));
			
			
			
			
			
			if(element.getText().equals(accountNumber)){
				
				System.out.println(i+ ": account is  match in list "+element.getText() +" = "+ accountNumber );

		
				driver.findElement(By.xpath("//table/tbody[@id='tBody']/tr["+i+"]/td[7]/button/i")).click();
				
				YES_FOR_DELETE.click();
				break;
			}else {
				
				System.out.println(i+ ": account is not match in list " + element.getText() +" = "+ accountNumber );
				
			}
			
		}
	
	
	}
}
