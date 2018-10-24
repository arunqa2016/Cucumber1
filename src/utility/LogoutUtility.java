package utility;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import actionObjects.ActionObjects;

public class LogoutUtility extends ActionObjects{

public static void ClickOnLogoutLink() throws Exception {
		
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/ul/li/ul/li[12]/a")).click();
		Thread.sleep(5000);
		logger.log(LogStatus.INFO, "Logout button clicked and user logged out");
		
	}
	
}
