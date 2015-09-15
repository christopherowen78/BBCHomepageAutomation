package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotlandPage {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Storing the Application Url in the String variable
		String homepageurl = "http://www.bbc.co.uk/";
		String scotlandurl = "http://www.bbc.co.uk/scotland";

		// Launch the BBC Homepage
		driver.get(homepageurl);

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.bbc.co.uk");

		// Open Scotland page
		driver.findElement(By
				.xpath("/html[@class='orb-js flexwrap flexbox']/body/div[@id='orb-modules']/div[@class='hp-modules']/section[@class='hp-module dismissible-nations-links-container']/div[@class='hp-dismissible-nations-links gel-layout']/nav/ul[@class='hp-dismissible-nations-links__nations']/li[@class='gel-layout__item gel-layout__item--nation-link gel-bp-m-one-fifth one-third'][1]/a[@class='hp-dismissible-nations-links__nation']/span[@class='hp-dismissible-nations-links__nation-name gel-long-primer-bold']"))
				.click();
		;

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

		if (actualURL.equals(scotlandurl)) {
			System.out.println("Verification Successful - The correct url is opened");
		} else {
			System.out.println("Verification Failed - An incorrect url is opened.");
			// In case of Fail, you like to print the actual and expected URL
			// for the record purpose
			System.out.println("Actual url = " + actualURL);
			System.out.println("Expected url = " + scotlandurl);
		}

		// Retrieve the page source length
		String PageSource = driver.getPageSource();
		int pageSourceLength = PageSource.length();
		System.out.println("Length of the page source = " + pageSourceLength);

		// Close the window
		driver.close();
	}

}
