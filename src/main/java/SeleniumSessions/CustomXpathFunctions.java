package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathFunctions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://simons.ca");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[text()='Our health measures']")).click();
		//getLinkElement("FAQ").click();
		driver.findElement(By.xpath("//a[text()='FAQ']"));
		Actions actions = new Actions(driver);
		
		actions.click(driver.findElement(By.xpath("//a[text()='FAQ']"))).perform();
	}
	
	public static WebElement getLinkElement(String text) {
		//String xpath = "//a[text()='Our health measures']";
		String xpath = "//a[text()='"+text+"']";
		System.out.println(xpath);
		return driver.findElement(By.xpath(text));
		
	}
	public static WebElement getLinkElement(String text,String tagName) {
		String xpath = "//"+tagName+"[text()='"+text+"']";
		System.out.println(xpath);
		return driver.findElement(By.xpath(text));
		
	}
	

}
