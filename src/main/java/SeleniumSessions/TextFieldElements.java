package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By regForm = By.xpath("//input[ @class ='form-control']");
		
		ElementsUtil eleUtil = new ElementsUtil(driver);
		
		
		List<WebElement> formList = eleUtil.getElements(regForm);
		
		if (formList.size() == 6) {
			System.out.println("All the fields from registration form are present.");
		}
		
	}

}
