package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.webToolsUtils;

public class HomePage extends BasePage {
	@FindBy(xpath="(//a[@class='nav-link'])[2]")
	private WebElement clkMovies;
	
	@FindBy(xpath="(//a[@class='nav-link'])[3]")
	private WebElement clkSports;
	
	@FindBy(xpath="//a[text()='Hindi']")
	private WebElement clkHindi;
	
	@FindBy(xpath="//a[text()='Telugu']")
	private WebElement clkTelugu;
	
	@FindBy(xpath="//a[text()='Bengali']")
	private WebElement clkBengali;
	
	@FindBy(xpath="//a[text()='Cricket']")
	private WebElement clkCricket;
	
	@FindBy(xpath="//a[text()='Kabaddi']")
	private WebElement clkKabaddi;
	
	@FindBy(xpath="//a[text()='eSports']")
	private WebElement clkeSports;
	
	@FindBy(xpath="//a[text()='Water Sports']")
	private WebElement clkWaterSports;
	
	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement clklogOut;
	
	@FindBy(xpath="//img[@src='/assets/c724e71754181298e3f835e46ade0517.svg']")
	private WebElement clkpersonIcon;
	
	public HomePage(WebDriver driver, webToolsUtils wToolsUtils) {
		super(driver, wToolsUtils);
	}
	
	
	
	public void clickMovies() {
		wToolsUtils.elementClickable(clkMovies, "Clicking Movies");
	}
	
	public void clickSports() {
		clkSports.click();
	}
	
	public void clickHindi() {
		wToolsUtils.elementClickable(clkHindi, "Clicking Hindi");
	}
	
	public void clickTelugu() {
		wToolsUtils.elementClickable(clkTelugu, "Clicking Telugu");
	}
	
	public void clickBengali() {
		wToolsUtils.elementClickable(clkBengali, "Clicking Bengali");
	}
	
	public void clickCricket() {
		wToolsUtils.elementClickable(clkCricket, "Clicking Cricket");
	}
	
	public void clickKabaddi() {
		wToolsUtils.elementClickable(clkKabaddi, "Clicking Kabaddi");
	}
	
	public void clickWaterSports() {
		wToolsUtils.elementClickable(clkWaterSports, "Clicking Water Sports");
		
	}
	
	public void clickESports() {
		wToolsUtils.elementClickable(clkeSports, "Clicking E-Sports");
		
	}
	
	public void clickLogOut() {
		wToolsUtils.elementClickable(clkpersonIcon, "Clicking Person Icon");
		wToolsUtils.elementClickable(clklogOut, "Clicking LogOut");
	}
}
