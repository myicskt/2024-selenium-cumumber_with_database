package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage{
	WebDriver driver;
	
	
	public DashboardPage(WebDriver webDriver) {
		this.driver=webDriver;
	}
	
	
	
	@FindBy(how=How.XPATH, using="//header/div/strong[text()='Dashboard']") 
	WebElement DASHBOARD_TEXT_ELEMENT ;
	
	@FindBy(how=How.XPATH, using="//nav/ul/li/a/span[text()='List Accounts']")
	WebElement LIST_ACCOUNT_ELEMENT;
	
	public void validDashBordPageTitle() {
		validatePageTitleOrElement(driver.getTitle(), "Codefios");
		
	}
	public void validDashBordElementText() {
		validatePageTitleOrElement(DASHBOARD_TEXT_ELEMENT.getText(), "Dashboard");
		
	}
	
	public void clickOnListAccountButton() {
		LIST_ACCOUNT_ELEMENT.click();
	}
	
	
	
	

}
