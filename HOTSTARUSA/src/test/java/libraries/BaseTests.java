package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class BaseTests implements IAutoConstants {
    public WebDriver driver;
    public webToolsUtils wTUtils;
    @BeforeClass
	public void OpenApp() throws InterruptedException {
    	if(browserName.equalsIgnoreCase("Opera")) {
    		System.setProperty("", driverPath);
    		driver = new OperaDriver();
    		
    		}
    	else {
    		 WebDriverManager.chromedriver().setup();
    		 driver = new ChromeDriver();
    	}
    	driver.get(url);
		driver.manage().timeouts().implicitlyWait(wTime, TimeUnit.SECONDS);
		System.out.println("Open the browser");
		wTUtils = new webToolsUtils(driver);
		LoginPage l = new LoginPage(driver, wTUtils);
		Thread.sleep(1000);
		l.clickLogIn();
		l.setEmail(email);
		l.setPassword(passWord);
		l.clickSignIn();
		driver.manage().window().maximize();
    
    }

    	
    @AfterClass
    public void closeApp() {
    	HomePage h = new HomePage(driver,wTUtils);
    	h.clickLogOut();
    	driver.quit();
    }
}
