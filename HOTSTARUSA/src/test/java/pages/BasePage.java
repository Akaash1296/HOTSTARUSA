package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import libraries.webToolsUtils;

public class BasePage {
  public WebDriver driver;
  public webToolsUtils wToolsUtils;
  
  public BasePage(WebDriver driver, webToolsUtils webActionTools) {
	  this.driver = driver;
	  this.wToolsUtils = webActionTools;
	  PageFactory.initElements(driver, this);
  }
}
