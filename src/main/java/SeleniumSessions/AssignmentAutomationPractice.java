package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentAutomationPractice {
		
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");		
				
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Dress");
		Thread.sleep(4000);
				
				
		By suggest_option = By.cssSelector("div.ac_results li ");
			
		doSelectOptionFromSuggestion(suggest_option, "T-shirts > Faded Short Sleeve T-shirts");
				
		String heading = driver.findElement(By
								.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1"))
								.getText();
				
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


