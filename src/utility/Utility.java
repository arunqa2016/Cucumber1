package utility;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import actionObjects.ActionObjects;

public class Utility extends ActionObjects{
	
	//Extends ActionObjects class to user driver and extents objects
	
	public static void reportInvoke() {
		report = new ExtentReports("E:\\Automation_Reports\\LoginTest.html");
	}
	
	public static void driverInvoke() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
		driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
	}
	
	public static void getUrl() {
		driver.get("https://infratest.togelmatrix.net/");
		//driver.manage().window().maximize();
		String currentTitle = driver.getTitle();
		System.out.println("Login page title is - " + currentTitle);
	}

	public static void loggerInfoForLoginPage() {
		logger=report.startTest("User is on Login Page");
		logger.log(LogStatus.INFO, "Browser is open successfully");
		logger.log(LogStatus.PASS, "Togel URL launched");
	}

	public static void loggerInfoforUsernameAndPassword() {
		logger=report.startTest("User enters UserName and Password");
		logger.log(LogStatus.INFO, "Enter Username and Password");
		logger.log(LogStatus.INFO, "Entered captcha text manually");	
	}
	
	public static void getReport() {
		report.endTest(logger);
		report.flush();
		
		driver.get("E:\\Automation_Reports\\LoginTest.html");
	}

	public static void waitForSeconds() throws Exception {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	public static void enterUsername(String username) {
		driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
	}

	public static void enterPassword(String password) throws InterruptedException {
		System.out.println("Password is - "+password);
		//driver.navigate().refresh();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//String text = driver.findElement(By.xpath("//*[@id=\"password-form\"]/div[1]/label")).getText();
		//System.out.println(text);
		//driver.manage().window().maximize();
		//WebDriverWait wait = null;
		try {
			//driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
			//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("password"))));
			//System.out.println("Is Display "+driver.findElement(By.id("password")).isDisplayed());
			//System.out.println("Is Enable "+driver.findElement(By.id("password")).isEnabled());
			
			WebElement element = driver.findElement(By.name("password"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.click();
			actions.sendKeys(password);
			actions.build().perform();
			
			
			driver.findElement(By.name("//*[@id=\"password-form\"]/div[6]/div[2]/button")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error is -" + e);
		}
		
		System.out.println("Login button clicked");
		Thread.sleep(5000);
		driver.close();
	}

	public static void loginButtonClicked() throws Exception {
		
		//waitFor30Seconds();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button")).click();
		Thread.sleep(1000);
		
		String agreementURL = "https://www-dev.aqtogel.com/agreement";
		String getURL = driver.getCurrentUrl();
		System.out.println("Current URL is - " + getURL);
		
		if(agreementURL.equals(getURL)) {
			
			System.out.println("Inside If block");
			LoginUtility.agreementButtonsClicked();
			
		}else{
			
			System.out.println("Inside Else block and going to checking Errors");
			ErrorFiles.loginErrorMessage();
			
		}
	}

	public static String getCurrentURL() {
		String getCurrentURL = driver.getCurrentUrl();
		return getCurrentURL;
	}
	
}
