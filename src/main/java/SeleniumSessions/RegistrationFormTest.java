package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormTest {

	public static void main(String[] args) {
		
		String browserName  = "chrome";
		String url ="https://demo.opencart.com/index.php?route=account/register";	
	
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.launchBrowser(browserName);
		
		br.launchUrl(url);
		
		System.out.println(br.getPageTitle());
		
		//By locators:
		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By eMailId = By.id("input-email");
		By tPhone = By.id("input-telephone");
		By pWord = By.id("input-password");
		By cPword = By.id("input-confirm");
		By sRadio = By.xpath("(//input[@type = 'radio' and @name='newsletter' and @value ='0'])[1]");
		By aCheckBox = By.xpath("//input[@name='agree']");
		By continueBtn = By.xpath("//input[@type = 'submit' and @value ='Continue']");
		
		ElementsUtil eleUtil = new ElementsUtil(driver);
		
		eleUtil.doSendKeys(fName, "Dhivya");
		eleUtil.doSendKeys(lName,"Test");
		eleUtil.doSendKeys(eMailId,"test3101@gmail.com");
		eleUtil.doSendKeys(tPhone,"Test");
		eleUtil.doSendKeys(pWord,"Test123");
		eleUtil.doSendKeys(cPword,"Test123");
		eleUtil.doClick(sRadio);
		eleUtil.doClick(aCheckBox);
		eleUtil.doClick(continueBtn);
		
		String accountTitle = br.getPageTitle();
		if(accountTitle.equals("Your store")) {
			System.out.println("The account is registered succesfully");
		}
		
		br.closeBrowser();
		
		
	}

}
