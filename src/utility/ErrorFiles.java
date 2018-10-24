package utility;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import actionObjects.ActionObjects;

public class ErrorFiles extends ActionObjects {
	
	
	public static void loginErrorMessage() {
		
		String actualURL = driver.getCurrentUrl();
		//Assert.assertEquals("User unable to login", agreementURL, actualURL);
		WebElement captchaErrorMsg = driver.findElement(By.xpath("//*[@id=\"login\"]/div"));
		System.out.println("Else block - User unable to login, error message display as"+""+captchaErrorMsg);
		logger.log(LogStatus.FAIL, "Captcha error message, User unable to login ");
		
		Utility.getReport();
		
	}
	
}
