package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//1. way to switch to a frame
		
		//driver.switchTo().frame(2);
		
		//2. way to switch to a frame
		//driver.switchTo().frame(driver.findElement(By.name("main")));
		
		//3. way to switch to a frame
		driver.switchTo().frame("main");
		String header = driver.findElement(By.xpath("//h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
	}

}
