package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Naveen automation labs");
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Dress");
		Thread.sleep(4000);
		
		//ul[@class ='erkvQe']//div[@class='sbl1']//span
		//ul.erkvQe div.sbl1 span - CSS Selector
		
		//By suggest_option = By.cssSelector("ul.erkvQe div.sbl1 span");
		By suggest_option = By.cssSelector("div.ac_results li ");
//		List<WebElement> suggestList = driver.findElements(suggest_option);
//		
//		System.out.println(suggestList.size());
//		
//		for(WebElement e: suggestList) {
//			if(e.getText().equals("naveen automation labs api testing")) {
//				e.click();
//				break;
//			}
//		}
//		
		
		doSelectOptionFromSuggestion(suggest_option, "T-shirts > Faded Short Sleeve T-shirts");
		
		String heading = driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1")).getText();
		
		if(heading.contains("Faded Short Sleeve")) {
			System.out.println("Faded short sleeve is displayed");
		}
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doSelectOptionFromSuggestion(By locator, String value) {
		
	
		
		List<WebElement> suggestList = getElements(locator);
		
		System.out.println(suggestList.size());
		
		for(WebElement e: suggestList) {
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
		
		
		
	}

}
