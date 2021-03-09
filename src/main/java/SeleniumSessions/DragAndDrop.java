package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		// Always when there is more than one action class action is performed, build and perform method is mandatory.
		
		
		//actions
		//.clickAndHold(sourceEle)
		//.moveToElement(targetEle)
		//.release()
		//.build()
		//.perform();
		
		
		//When there is only one action is performed, then perform method is enough.
		actions.dragAndDrop(sourceEle, targetEle).perform();
		

		
	}

}
