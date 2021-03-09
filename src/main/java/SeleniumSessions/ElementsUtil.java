package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementsUtil {
	
	
	private WebDriver driver;
	private Actions actions;
	private Set<String> handles;
	private Iterator<String> it;
	private String windowHandleid;
	
	/***
	 * This constructor is used to pass the driver.
	 */
	
	public ElementsUtil(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(this.driver);
		handles = driver.getWindowHandles();
		it = handles.iterator();
	}
	
	/***
	 * This method receives By locator and returns a webElement
	 * @param locator
	 * @return
	 */
	
	
	public  WebElement getElement(By locator) {
		
		 return driver.findElement(locator);

	}
	
	/***
	 * This method receives By locator and returns a list of webElements.
	 * @param locator
	 * @return
	 */
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	/***
	 * This method receives By locator and value from the used and enter it on the input field
	 * @param locator
	
	 */
	
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

}
	/***
	 * This method receives a By locator and clicks on the webelement.
	 * @param locator
	 */

	
	public  void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	/***
	 * This method receives By locator and returns the text of the element.
	 * 
	 * @param locator
	 * @return
	 */

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	/***
	 * This method is used to check if the web element is displayed 
	 * @param locator
	 *@return boolean value
	*/
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	/***
	 * This method receives By locator and string value and clicks on the given link
	 * @param locator
	 * @param value
	 */
	
	public  void doLinkClick(By locator, String value) {
		
		List<WebElement> linkList = getElements(locator);
		
		for (WebElement e : linkList) {
			
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
		
		
	}
	
	
	/**********************************************************Drop down Utils**************************************************************/
	
	
	public  void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}
	
	public  void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public  void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	
	
	public  void doSelectDropDownValueWithText(By locator, String text) {
		
		Select select_option= new Select(getElement(locator));
		
		List<WebElement> options_list = select_option.getOptions();
		
		for (WebElement e: options_list) {
			if(e.getText().equals(text)) {
				e.click();
				break;
			}
		
	}


}
	/***
	 * This method is used to select drop down values without using Select class
	 * @param locator
	 * @param value
	 */
	
	public  void doHandleDropDownWithoutSelectClass(By locator, String value) {
		
		List<WebElement> dropDownList = getElements(locator);
		
		
		for(WebElement e: dropDownList) {
			if(e.getText().equals(value)) {
				e.click();
				break;
				
			}
		}
		
		
	}
	
	
	public  void doSelectOptionFromSuggestion(By locator, String value) {
			
		List<WebElement> suggestList = getElements(locator);
		System.out.println(suggestList.size());
		for(WebElement e: suggestList) {
				if(e.getText().equals(value)) {
					e.click();
					break;
				}
			}
			
			
			
		}
	
	
	/***********************************************************Action class Utils ******************************************************/
	
	//Move to main menu
	public  void doMoveToElement(By locator) {
		Actions actions = new Actions(driver);
		actions.moveToElement(getElement(locator)).perform();
		
	}
	
	//Move to main menu and then sub menu
	public  void doMoveToElement(By locator1, By locator2) {
		actions.moveToElement(getElement(locator1)).perform();
		actions.moveToElement(getElement(locator2)).perform();
		
	}
	
	//Move to main menu and then sub menu and click on 2nd sub menu
		public  void doMoveToElement(By locator1, By locator2,By locator3) {
			actions.moveToElement(getElement(locator1)).perform();
			actions.moveToElement(getElement(locator2)).perform();
			doClick(locator3);
			
		}
		
		//Click on a WebElement using Actions class
		
		public  void doActionsClick(By locator) {
			actions.click(getElement(locator)).perform();
		}
		
		//Enter a value on a input webElement using Actions class send keys method
		
		public  void doActionsSendKeys(By locator, String value) {
			actions.sendKeys(getElement(locator), value).perform();
		}
		
		
		/********************************************************* Browser handle Util *********************************************************/
		
		public  void browserWindowHandlewithTwoWindow(By locator,String url) {
			
			driver.get(url);
			getElement(locator).click();
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			String parentWindowHandle = it.next();
			System.out.println("ParentWindowHandle is "+parentWindowHandle);
			String childWindowHandle = it.next();
			System.out.println("LinkedInWindowHandle is "+childWindowHandle);
			driver.switchTo().window(childWindowHandle);
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentWindowHandle);
			System.out.println(driver.getTitle());
		}
		public String nextWindowHandle() {
			windowHandleid = it.next();
			System.out.println(" is "+windowHandleid);
			return windowHandleid;
			
		}
		
		public  void switchToWindow(String windowHandleid) {
			driver.switchTo().window(windowHandleid);
			System.out.println(driver.getTitle());
			
			
		}
	
}
