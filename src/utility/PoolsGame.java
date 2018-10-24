package utility;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import actionObjects.ActionObjects;

public class PoolsGame extends ActionObjects{

	public static void poolsGame_4D_3D_2D() throws Exception {
		System.out.println("I am in 4D/3D/2D method");
		logger.log(LogStatus.INFO, "Player is reday to betting");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tbody/tr[1]/td[2]/div/input[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tbody/tr[1]/td[2]/div/input[2]")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tbody/tr[1]/td[2]/div/input[3]")).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tbody/tr[1]/td[2]/div/input[4]")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tbody/tr[1]/td[3]/div/ins")).click();
		
		driver.findElement(By.xpath("//*[@id=\"txtbetamount\"]")).sendKeys("1000");
		
		String bet_Amount = driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tfoot/tr[2]/td/button[2]")).getText();
		System.out.println("Bet amount after discount is - " + bet_Amount);
		
		driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[2]/div/div/table/tfoot/tr[2]/td/button[2]")).click();
		System.out.println("Kirim button is Clicked and Pop up is open");
		
		
		
	}
	
}
