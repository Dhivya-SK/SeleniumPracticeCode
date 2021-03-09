package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.opencart.com/index.php?route=account/login";
		driver.get("https:amazon.ca");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links in the page : "+linkList.size());
		
		for(WebElement e:linkList) {
			
			
			String linkName = e.getText();
		
			
			if(!linkName.isEmpty()) {
				System.out.println(linkName);
			}
		}
		

	}

}
