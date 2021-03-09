package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Headless mode is nothing but execution running behind the scene with no browser visibly running
		
		//Advantage is it is slightly faster compared to the normal mode.


		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://freshonthegogrocery.ca/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

	}

}
