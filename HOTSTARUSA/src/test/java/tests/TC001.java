package tests;

import org.testng.annotations.Test;

import libraries.BaseTests;
import pages.HomePage;

@Test
public class TC001 extends BaseTests {
	public void clickAllMovies() throws InterruptedException {
		HomePage h = new HomePage(driver, wTUtils);
		driver.manage().window().maximize();
		h.clickMovies();
		Thread.sleep(2000);
		h.clickHindi();
		Thread.sleep(2000);
		h.clickBengali();
		Thread.sleep(2000);
		h.clickTelugu();
		Thread.sleep(2000);

	}
	
	
}
