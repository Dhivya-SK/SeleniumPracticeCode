package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentFooterListFreshWorks {

	public static void main(String[] args) {
		
		
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.launchBrowser("chrome");
		
		br.launchUrl("https://www.freshworks.com");
		
		ElementsUtil ele = new ElementsUtil(driver);
		
		//By footer = By.xpath("//ul[@class='footer-nav']//a");
		By footer = By.cssSelector("ul.footer-nav li a");
		
		List<WebElement> footList = ele.getElements(footer);
		
		System.out.println("Total footer links are :"+footList.size());
		
		for(WebElement e: footList) {
			String text = e.getText();
			if (!text.isBlank()) {
				System.out.println("Link name is "+text);	
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
