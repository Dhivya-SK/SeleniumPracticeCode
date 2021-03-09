package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFrameHandleClassicCRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		Thread.sleep(3000);
		
		By un = By.xpath("//div[@class='input-group']/input[@name='username']");
		By pwd = By.xpath("//div[@class='input-group']/input[@name='password']");
		By loginBtn = By.xpath("//div[@class='input-group-btn']/input[@value='Login']");
		By contactsMenu = By.xpath("//div[@id='navmenu']//a[text()='Contacts']");
		By logoutLink = By.xpath("//a[@class='topnavlink']/i[@class='fa fa-sign-out icon-2x']");
		
		ElementsUtil ele = new ElementsUtil(driver);
		
		ele.doSendKeys(un,"batchautomation");
		ele.doSendKeys(pwd,"Test@12345");
		ele.doClick(loginBtn);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		
		ele.doClick(contactsMenu);
		
		Thread.sleep(3000);
		
		ele.doClick(logoutLink);
		
		
		System.out.println(driver.getTitle());
		
		
		
		
		


	}

}
