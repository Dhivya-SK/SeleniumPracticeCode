package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	
	static WebDriver driver;
	static Set<String> handles;
	static Iterator<String> it;
	static String windowHandleid;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//By locators
		By linkedInLink = By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By faceBookLink = By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitterLink = By.xpath("//img[@alt='OrangeHRM on twitter']");
		By youtubeLink = By.xpath("//img[@alt='OrangeHRM on youtube']");
	
		doClick(youtubeLink);
		doClick(twitterLink);
		doClick(faceBookLink);
		doClick(linkedInLink);
		Thread.sleep(3000);
		
		handles = driver.getWindowHandles();
		it = handles.iterator();
		
		String youtubeLinkid = nextWindowHandle();
		String twitterLinkid = nextWindowHandle();
		String faceBookLinkid = nextWindowHandle();
		String linkedInLinkid = nextWindowHandle();
		String parenPageId = nextWindowHandle();
		switchToWindow(youtubeLinkid);
		
		switchToWindow(linkedInLinkid);
		switchToWindow(faceBookLinkid);
		switchToWindow(twitterLinkid);
		switchToWindow(parenPageId);

	}
	
	public static void doClick (By locator) {
		driver.findElement(locator).click();
	}
	
	public static String nextWindowHandle() {
		
		windowHandleid = it.next();
		System.out.println(" is "+windowHandleid);
		return windowHandleid;
		
	}
	
	public static void switchToWindow(String windowHandleid) {
		driver.switchTo().window(windowHandleid);
		System.out.println(driver.getTitle());
		
		
	}
	

}
