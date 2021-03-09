package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomeXpath {

	public static void main(String[] args) {

		// Xpath is a locator, it is not an attribute
		// Xpath is like an address of the element inside the html dom
		
		//2 types of Xpath
		
		// absolute Xpath
		// absolute address of the element
		
		//html/body/div[2]/div/div[3]/form/div/input[2]
		
		
		
		// Relative or Custom Xpath
		
		//htmltag[@attribute = 'value']
		//input[@name='username']
		
		//htmltag[@attr1='value' and @attr2='value']
		////input[@class='form-control' and @name = 'username']
		
		
		//contains() function
		
		//id = 'test@123'
		//id = 'test@345'
		
		//htmltag[contains(@attr,'partialvalue']
		//input[contains(@id,'email')]
		
		//htmltag[contains(@attr,'value') and @attr2 ='value']
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		
		
		//*[@attr='value']
		//*[@name='username']
		
		By tshirt = By.className("sf-menu clearfix menu-content sf-js-enabled sf-arrows"); // not correct because it contains more than one class name.
		
		By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']"); 
		By.className("clearfix"); // correct className usage is by giving only one class name 
		
		//text() function in xpath
		
		//htmltag[text() ='value']
		//h1[text()='Power up your sales, customer service, and marketing']
		//a[text()='Sign Up']
		
		//htmltag[text() = 'value' and @attr = 'value']
		//a[text()='Sign Up' and @href='https://register.freecrm.com/register/']
		
		// text() function with contains
		//htmltag[contains(text(),'value')]
		//a[contains(text(),'About Us')]
		
		// indexing in xpath
		
		//  ((//div[@class='navFooterLinkCol navAccessibility'])//li)[position()=20]
		//  ((//div[@class='navFooterLinkCol navAccessibility'])//li)[10]
		
		
		//starts with function in xpath
		
		
		
		
		
		
		
		
		
		
		

	}

}
