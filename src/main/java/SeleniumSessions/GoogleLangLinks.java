package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLangLinks {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.ca");
		
		By linkList = By.xpath("//div[@id='SIvCob']/a");
		
		doLinkClick(linkList, "Français");
		}

	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doLinkClick(By locator, String value) {
		
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

}
