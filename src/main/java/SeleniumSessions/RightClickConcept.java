package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.cssSelector("span.context-menu-one.btn.btn-neutral"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(rightClick).perform();
		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
		
		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
		
	}

}
