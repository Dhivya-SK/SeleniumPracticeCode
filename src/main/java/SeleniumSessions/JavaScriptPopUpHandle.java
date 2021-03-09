package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//Javascript pop up or alert or modal dialog pop ups
		// alert method in Java script
		//alert('this is an alert')
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		
		alert.accept(); // Click on ok or submit or Yes button on alert
		
		alert.dismiss();//dismiss the alert
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}
