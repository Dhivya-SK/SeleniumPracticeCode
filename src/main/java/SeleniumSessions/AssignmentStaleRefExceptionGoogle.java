package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentStaleRefExceptionGoogle {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		ElementsUtil ele = new ElementsUtil(driver);
		
		
	driver.get("https://www.google.ca");
	
	By leftsidefooter = By.cssSelector("div.KxwPGc.AghGtd a");
	By rightSidefooter = By.cssSelector("div.KxwPGc.iTjxkf a");
	
//	List<WebElement> footergrid = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd a"));
//	
//	for(int i=0;i<footergrid.size();i++) {
//		footergrid.get(i).click();
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
//		driver.navigate().back();
//		footergrid = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd a"));
	
	
//	}
	
//	staleElementRefList(rightSidefooter);
    staleElementRefList(leftsidefooter);
	}
	
	public static void staleElementRefList(By locator) {
		
		List<WebElement> linkList = driver.findElements(locator);
		
		for(int i=0;i<linkList.size();i++) {
			linkList.get(i).click();
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			driver.navigate().back();
			linkList = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd a"));
		}
		
		
		
	}
	

}
