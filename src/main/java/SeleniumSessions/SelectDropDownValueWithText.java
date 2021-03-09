package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithText {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		Select select_indus = new Select(driver.findElement(industry));
//		
//		List<WebElement> indus_list = select_indus.getOptions();
//		
//		for (WebElement e: indus_list) {
//			if(e.getText().equals("Healthcare")) {
//				e.click();
//				break;
		doSelectDropDownValueWithText(country, "India");
		doSelectDropDownValueWithText(industry, "Education");
		
		}
	

	
	
	public static void doSelectDropDownValueWithText(By locator, String text) {
		
		
		Select select_option= new Select(driver.findElement(locator));
		
		List<WebElement> options_list = select_option.getOptions();
		
		for (WebElement e: options_list) {
			if(e.getText().equals(text)) {
				e.click();
				break;
			}
		
	}
		
	}
	
}






	
