package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentBrowserWindowHandleCase2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		//By locators
		
		By linkedInLink = By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By faceBookLink = By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitterLink = By.xpath("//img[@alt='OrangeHRM on twitter']");
		By youtubeLink = By.xpath("//img[@alt='OrangeHRM on youtube']");
		browserWindowHandlewithTwoWindow(linkedInLink);
		browserWindowHandlewithTwoWindow(youtubeLink);
		Thread.sleep(3000);
		browserWindowHandlewithTwoWindow(twitterLink);
		Thread.sleep(3000);
		browserWindowHandlewithTwoWindow(faceBookLink);
		
		driver.quit();
}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	public static void browserWindowHandlewithTwoWindow(By locator) throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		getElement(locator).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowHandle = it.next();
		System.out.println("ParentWindowHandle is "+parentWindowHandle);
		String childWindowHandle = it.next();
		System.out.println("LinkedInWindowHandle is "+childWindowHandle);
		
		driver.switchTo().window(childWindowHandle);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
	}
	
}

