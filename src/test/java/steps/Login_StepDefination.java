package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.DashboardPage;
import pages.ListAccountPage;
import pages.LoginPage;
import util.BrowserFactory;
import util.DatabasePage;



public class Login_StepDefination {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	ListAccountPage listAccountPage;
	
	
	
	//Data from database
	private String accountName = DatabasePage.getStringDataFromDatabase		("list_accounts_data",	 "account_name");
	private String accountDescriptio = DatabasePage.getStringDataFromDatabase("list_accounts_data",	"account_description");
	private String initialBalaance = DatabasePage.getLongDataFromDatabase	("list_accounts_data",	"account_balance").toString();
	private String accountNumber = DatabasePage.getLongDataFromDatabase		("list_accounts_data",	"account_number").toString();
	private String contactPersonName = DatabasePage.getStringDataFromDatabase("list_accounts_data",	"account_contact");
	


	 /*
	//Adding random num in static data to make dynamic 
	BasePage basePage =new BasePage();
	private String accountName = "Mr. Test Data" +basePage.randomNumber(3);
	private String accountDescriptio = "This is the account  created by Mr_ Ramndom who  generates ramdom num like : " +basePage.randomNumber(3);
	private String initialBalaance =basePage.randomNumber(4);
	private String accountNumber = basePage.randomNumber(12);
	private String contactPersonName = basePage.randomNumber(10);
	
	
		 */

	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.validLoginPageTitle("Welcome To Codefios");
	}

	@When("user enter user name as {string} from database")
	public void user_enter_user_name_as_from_database(String username) {
		loginPage.insertUserName(BrowserFactory.getLoginData(username));

	}

	@When("user enter user passsword as {string} from database")
	public void user_enter_user_passsword_as_from_database(String password) {
		loginPage.insertUserPassword(BrowserFactory.getLoginData(password));

	}

	@When("en user is able to click login button")
	public void en_user_is_able_to_click_login_button() {
		loginPage.clickOnSinginButton();

	}

	@When("user is able to landed on dash bord and able to click on list account")
	public void user_is_able_to_landed_on_dash_bord_and_able_to_click_on_list_account() {

		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validDashBordPageTitle();
		dashboardPage.validDashBordElementText();
		dashboardPage.clickOnListAccountButton();
		

	}

	@When("user is able to land on add account page and able to click on add button")
	public void user_is_able_to_land_on_add_account_page_and_able_to_click_on_add_button() {

		listAccountPage = PageFactory.initElements(driver, ListAccountPage.class);
		listAccountPage.validAccountListPageTitle();
		listAccountPage.validAccountListElement();
		listAccountPage.clickOnAddAccountButton();

	}

	@When("user is able to enter the account information")
	public void user_is_able_to_enter_the_account_information() {
		listAccountPage.insertAccountName(accountName);
		listAccountPage.insertDescription(accountDescriptio);
		listAccountPage.insertInitialBalaance(initialBalaance);
		listAccountPage.insertAccountNumber(accountNumber);
		listAccountPage.insertContactPersonName(contactPersonName);
		
	}

	@When("user is able to save information")
	public void user_is_able_to_save_information() {
		listAccountPage.clickOnSaveButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	@Then("user is able to valid account in list account")
	public void user_is_able_to_valid_account_in_list_account() {
		
		BrowserFactory.takeScreenshot();
		listAccountPage.validateDataFromAccountList(accountNumber);
		
		BrowserFactory.tearDown();

	}
	

}
