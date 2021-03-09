package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailScript {

	public static void main(String[] args) {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//String browserName =  "chrome";
		
		String url ="https://mail.google.com";

		
		driver.get(url);
		
		driver.findElement(By.id("identifierId")).sendKeys("kdhivya.sowndari@gmail.com");
		driver.findElement(By.cssSelector("div.VfPpkd-RLmnJb")).click();
	
	

		
		
	

	}

}
