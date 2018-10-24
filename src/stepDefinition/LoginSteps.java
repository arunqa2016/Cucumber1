package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Utility;

public class LoginSteps {
	//Test
	@Given("^User is on Login Page$")
	public void User_is_on_Login_Page() throws Throwable {

		Utility.reportInvoke();
		Utility.driverInvoke();
		Utility.getUrl();
		Utility.loggerInfoForLoginPage();

		System.out.println("=======================User on Login Page=======================");
	}

	@Given("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_UserName_and_Password(String username, String password) throws Throwable {

		Utility.enterUsername(username);
		Utility.enterPassword(password);
		
		//Utility.loggerInfoforUsernameAndPassword();

		System.out.println("=======================User enter Username and Password=======================");
	}

	@Then("^User Login Successfully$")
	public void User_Login_Successfully() throws Throwable {
		//Utility.loginButtonClicked();
		Utility.waitForSeconds();
		System.out.println("=======================User Login Successfully=======================");
		
	}

}
