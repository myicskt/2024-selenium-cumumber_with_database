package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	WebDriver driver;

	public LoginPage(WebDriver webDriver) {
		this.driver = webDriver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement USER_NAME_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement USER_PASSWORD_ELEMENT;

	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement LOGIN_BUTTON_ELEMENT;

	public void validLoginPageTitle(String title) {
		validatePageTitleOrElement(driver.getTitle(), title);

	}

	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertUserPassword(String password) {
		USER_PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickOnSinginButton() {
		LOGIN_BUTTON_ELEMENT.click();
		
	}

}
