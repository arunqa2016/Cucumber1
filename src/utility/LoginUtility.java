package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import actionObjects.ActionObjects;

public class LoginUtility extends ActionObjects{

	
	public static void agreementButtonsClicked() throws Exception {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"agreement\"]/div/div/form/b/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"agreement\"]/div/div/form/div[3]/button")).click();
		
		String username = "inf001";
		String getUsername = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/a/span[1]")).getText();
		System.out.println("Current Username is - " + getUsername);
		if (username.equals(getUsername)) {
			logger.log(LogStatus.PASS, "Agreement buttons Clicked and user Login Successfully and current user is - " + getUsername);
		} else {
			logger.log(LogStatus.FAIL, "Agreement buttons Clicked but user is not Login");
		}	
		
		
	}
}
