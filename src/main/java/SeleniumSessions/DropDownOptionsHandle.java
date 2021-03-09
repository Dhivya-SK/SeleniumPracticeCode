package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionsHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			By industry = By.id("Form_submitForm_Industry");
			By country = By.id("Form_submitForm_Country");
			
//			Select select = new Select(driver.findElement(industry));
//			
//			List<WebElement> indus_options = select.getOptions();
//			
//			System.out.println("The number of options on Industry drop down are "+indus_options.size());
//			
//			for(WebElement e: indus_options) {
//				String text = e.getText();
//				System.out.println("Options are "+text);
//			}
//			
			
			List<String> indus_List = getDropDownOptionsList(industry);
			if(indus_List.contains("Electronics")) {
				System.out.println("Yes, this drop down contains Electronics");
			}
			
			

	}
	
	// Write a Function to get the list of drop down values (text)
	//Pass the By locator
	//Returns List<String>
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropDownOptionsList(By locator) {
		
		Select select = new Select(getElement(locator));
		
		List<String> optionsTextList = new ArrayList<String>();
		
		List<WebElement> optionsList = select.getOptions();
		
		for (WebElement e: optionsList) {
			
			optionsTextList.add(e.getText());
			
		}
		return optionsTextList;
		
	}


}
