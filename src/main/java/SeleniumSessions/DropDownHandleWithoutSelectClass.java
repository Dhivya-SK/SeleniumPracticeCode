package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		//Drop down handle without using Select class.
		
//		List<WebElement> indusList = 
//				driver.findElements(industry);
//		
//		
//		for(WebElement e: indusList) {
//			if(e.getText().equals("Healthcare")) {
//				e.click();
//				break;
//				
//			}
//		}
		
		doHandleDropDownWithoutSelectClass(industry, "Education");
		doHandleDropDownWithoutSelectClass(country, "India");
		


	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	

	
	public static void doHandleDropDownWithoutSelectClass(By locator, String value) {
		
		List<WebElement> dropDownList = getElements(locator);
		
		
		for(WebElement e: dropDownList) {
			if(e.getText().equals(value)) {
				e.click();
				break;
				
			}
		}
		
		
		
		
	}

}
