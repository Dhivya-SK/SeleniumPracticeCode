package SeleniumSessions;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		String browserName =  "chrome";
		String url = "https://www.Amazon.ca";
		
		BrowserUtil br = new BrowserUtil();
		
		
		br.launchBrowser(browserName);
		br.launchUrl(url);
		
		System.out.println(br.getPageTitle());
		System.out.println(br.getPageUrl());
		br.closeBrowser();

	}

}
