package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class freshOntheGoLandingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		ElementsUtil ele = new ElementsUtil(driver);
		
		driver.get("https://freshonthegogrocery.ca");
		
		By deliveryAreadropdown = By.id("select-area");
		By logolandingPage = By.cssSelector("div.logo > a >img");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("delivery")).click();
		
		Thread.sleep(3000);
		
		ele.doSelectByVisibleText(deliveryAreadropdown, "Oshawa");
		
		
		System.out.println(ele.doIsDisplayed(logolandingPage));
		
		//div[@class='form-check form-check-inline']/label[@for='delivery' and @class='form-check-label' and text()='Delivery Services']

	}

}
