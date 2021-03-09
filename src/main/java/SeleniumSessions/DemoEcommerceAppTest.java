package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommerceAppTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.launchBrowser("chrome");
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String pageTitle = br.getPageTitle();
		System.out.println(pageTitle);
		
		ElementsUtil util = new ElementsUtil(driver);
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value = 'Login' and @type ='submit']");
		By yourStoreHeader = By.linkText("Your Store");
		
		
		util.doSendKeys(emailId,"test3101@gmail.com");
		util.doSendKeys(password,"Test123");
		util.doClick(loginBtn);
	
		
		pageTitle = br.getPageTitle();
		System.out.println("The account page title is " +pageTitle);
		
		if (util.doIsDisplayed(yourStoreHeader)) {
			String header = util.doGetElementText(yourStoreHeader);
			System.out.println(header);
					
		}
		
		
		
	
		br.closeBrowser();
		

	}

}
