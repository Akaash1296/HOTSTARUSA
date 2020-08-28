package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.webToolsUtils;

public class LoginPage extends BasePage {
   
	@FindBy(xpath="//div[@class='signIn']")
	private WebElement clkLogin;
	
	@FindBy(id="email")
	private WebElement loginId;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(className="btn-sign")
	private WebElement clkSignIn;
   
	public LoginPage(WebDriver driver, webToolsUtils wToolsUtils) {
		super(driver, wToolsUtils);
	}
	
	public void clickLogIn() {
		wToolsUtils.elementClickable(clkLogin, "Clicking Login icon");
	}
	public void setEmail(String emailId) {
		wToolsUtils.typeText(loginId, "Email", emailId);
	}
	
	public void setPassword(String pwrd) {
		wToolsUtils.typeText(pwd, "Password", pwrd);
	}
	
	public void clickSignIn() {
		wToolsUtils.elementClickable(clkSignIn, "Clicking Sign In Button");
	}
}
