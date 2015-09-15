package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		// Storing the Application Url in the String variable
		String homepageurl = "http://www.bbc.co.uk/";
		
		// Launch the BBC Homepage
		driver.get(homepageurl);
		
		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.bbc.co.uk");
		
		// Retrieve the page title
		String Title = driver.getTitle();
		System.out.println("Page title = " + Title);
		
		// Retrieve the page title length
		int titleLength = driver.getTitle().length();
		System.out.println("Length of the title = " + titleLength);
		
		// Retrieve the page URL
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		// Storing URL in String variable
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(homepageurl)){
			System.out.println("Verification Successful - The correct url is opened");
		}else{
			System.out.println("Verification Failed - An incorrect url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual url = " + actualURL);
			System.out.println("Expected url = " + homepageurl);
		}
		
		// Retrieve the page source length
		String PageSource = driver.getPageSource();
		int pageSourceLength = PageSource.length();
		System.out.println("Length of the page source = " + pageSourceLength);
		
		// Wait for 5 secs
		Thread.sleep(5);
		
		// Close the driver
		driver.quit();

	}

}
