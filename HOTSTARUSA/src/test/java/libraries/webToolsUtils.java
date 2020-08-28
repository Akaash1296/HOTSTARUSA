package libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webToolsUtils {
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;

	webToolsUtils(WebDriver driver){
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 10);
	}
	public void elementClickable(WebElement element, String elementName) {
		if(wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed()) 
		{
			element.click();
		}
		else {
			System.out.println(elementName + " is not clickable");
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element))==null);
		}
	}

	public void waitUntilElementClick(WebElement element, String text) {
		if(wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed()) {
			element.click();
		}
		else {
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element))==null);
			System.out.println(element + " is unable to click the element");
		}
	}


	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void backPage() {
		driver.navigate().back();
	}

	public void typeText(WebElement element,String elementName,String value)
	{
		if(wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed())
		{
			System.out.println("Enter the value into "+elementName);
			element.sendKeys(value);
			System.out.println("User is able to type "+value+" into "+elementName);
		}
		else
		{
			Assert.fail("Unable to Type on "+elementName);
		}
	}

	public String getTheText(WebElement element,String elementName)
	{
		System.out.println("Get the text :"+elementName);
		String elementText=null;
		if(element.isDisplayed())
		{
			elementText=element.getText();
		}
		else {
			System.out.println("Text is not displayed or loaded");
			Assert.fail("Unable to get the Text");
		}
		return elementText;
	}

	public void handleFrameIndex(int index,String frameDetails)
	{
		System.out.println("Switching to the Frame using Frame Index :"+frameDetails);
		driver.switchTo().frame(index);
	}

	public void handleFrameByAddress(WebElement frameAddress,String frameDetails)
	{
		System.out.println("Switching to the Frame using Address of the Frame:"+frameDetails);
		driver.switchTo().frame(frameAddress);
	}

	public void handleFrameByName(String frameNameOrId,String frameDetails)
	{
		System.out.println("Switching to the Frame using ID or Name of the Frame:"+frameDetails);
		driver.switchTo().frame(frameNameOrId);
	}
	public void selectDropDown(WebElement element,String visibleValueFromDropDown)
	{
		try {
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(visibleValueFromDropDown);
			System.out.println("Selected the value from the drop down");
		}
		catch(Exception e)
		{
			System.out.println("Unable to Select the Value from the Drop Down");
			Assert.fail("Unable to Select the Value from the Drop Down");
		}	  
	}


	public void scrollTillEndOfThePage() {

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try{
			System.out.println("Scroll till End of the Page");
		}
		catch(Exception e)
		{
			System.out.println("Unable to scroll till end of the page");
			Assert.fail("Unable to scroll till end of the page");
		}
	}

	public void scrollTillUpOfThePage() {

		try{
			System.out.println("Scroll till up of the Page");
			js.executeScript("window.scroll(0,-400)");
		}
		catch(Exception e)
		{
			System.out.println("Unable to scroll till up of the page");
			Assert.fail("Unable to scroll till up of the page");
		}
	}

	public void scrollTillElementOfThePage(WebElement element) {

		try{
			System.out.println("Scroll till element of the Page");
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		catch(Exception e)
		{
			System.out.println("Unable to scroll till element of the page");
			Assert.fail("Unable to scroll till element of the page");
		}
	}

	public void getTitleAndVerifyTitle(String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title   :"+actualTitle);
		System.out.println("Expected Title :"+expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle+" is matching with "+expectedTitle);
	}
}
