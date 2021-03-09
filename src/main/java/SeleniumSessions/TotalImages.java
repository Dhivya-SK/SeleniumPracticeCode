package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.ca";
		
		driver.get(url);
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		
		System.out.println("Total images : " +imgList.size());
		
		for(WebElement e: imgList) {
			System.out.println(e.getAttribute("alt")+ "-->" +e.getAttribute("src"));
			
		}
		 
		
		

	}

}
