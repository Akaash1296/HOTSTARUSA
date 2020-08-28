package tests;

import org.testng.annotations.Test;

import libraries.BaseTests;
import pages.HomePage;

@Test
public class TC002 extends BaseTests {
	public void clickSports() throws InterruptedException {
		HomePage h = new HomePage(driver, wTUtils);
		driver.manage().window().maximize();
		h.clickSports();
		Thread.sleep(2000);
		h.clickCricket();
		Thread.sleep(2000);
		h.clickESports();
		Thread.sleep(2000);
		h.clickKabaddi();
		Thread.sleep(2000);
		h.clickWaterSports();
		Thread.sleep(2000);
	
	}
}
