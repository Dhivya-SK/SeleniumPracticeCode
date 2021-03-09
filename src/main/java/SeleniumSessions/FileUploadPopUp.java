package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {

		//To upload a file using Selenium script, .sendKeys should be used and the path of the file should be passed.
		//This will only work if the WebElement has a type attribute.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//https://cgi-lib.berkeley.edu/ex/fup.html
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\kdhiv\\Documents\\Dhivya_Resume\\Traction on demand.txt");
		

	}

}
