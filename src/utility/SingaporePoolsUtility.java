package utility;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import actionObjects.ActionObjects;

public class SingaporePoolsUtility extends ActionObjects {

	public static void CheckCurrentURL() {
		// TODO Auto-generated method stub
		String current_url = Utility.getCurrentURL();
		String URL = "https://www-dev.aqtogel.com/home";

		String actualMarket = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/div/span"))
				.getText();
		String expectedMarket = "SINGAPORE";

		if (URL.equals(current_url) && actualMarket.equals(expectedMarket)) {
			// Which market is selected
			logger = report.startTest("User is on Singapore Pools game");
			logger.log(LogStatus.PASS, "Current Market selected as SINGAPORE");
		} else {
			System.out.println("Current market is not a singapore");
		}
	}

	public static void singapore4dgame() throws Exception { 
			
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/li/ul/li[1]/a/span[2]/i")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/li/ul/li[1]/ul/li[1]/a")).click();
			
			String singapore4d_url = "https://www-dev.aqtogel.com/super-4d";
			String current_url = Utility.getCurrentURL();
			
			String singaporeMarketON_text = "Periode";
			String singaporeMarket_statusON = driver.findElement(By.xpath("//*[@id=\"fourdgame\"]/div[1]/h4/span")).getText();
			System.out.println("Singapore market is On - " + singaporeMarket_statusON);
			//If URL is correct and market is open then user can apply the bet
			
			if (singapore4d_url.equals(current_url) && singaporeMarket_statusON.contains(singaporeMarketON_text)) {
				System.out.println("User is on 4D/3D/2D Game");
				logger.log(LogStatus.PASS, "SINGAPPORE 4D/3D/2D game is open");
				PoolsGame.poolsGame_4D_3D_2D();
				
			} else {
				System.out.println("Singapore market is Off");
				logger.log(LogStatus.INFO, "Singapore market is Off");
			}
			
	}
}
