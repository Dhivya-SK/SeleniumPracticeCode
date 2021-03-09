package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IkeaFooterList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ikea.com/ca/en/");
		
		List<WebElement> footerList = driver.findElements(By.xpath("//div[@class='hnf-footer__linkGroups']//a"));
		
		for(WebElement e: footerList) {
			String url = e.getAttribute("href");
			String text = e.getText();
			System.out.println(text +"----"+url);
			
		}

	}

}
