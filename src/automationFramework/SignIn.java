package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn {
	
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		// Storing the Application Url in the String variable
		String homepageurl = "http://www.bbc.co.uk/";
		
		// Navigate To command
		driver.navigate().to(homepageurl);
		System.out.println("Successfully opened the BBC Homepage");
		
		// Navigate to Sign In
		Thread.sleep(1000);
		driver.findElement(By.id("idcta-link")).click();
		System.out.println("Clicked Sign In link");
		
		// Enter username
		WebElement userName = driver.findElement(By.id("bbcid_unique"));
		userName.click();
		userName.sendKeys("mbbx6clo");
		System.out.println("Entered Username");
		
		// Enter password
		WebElement password = driver.findElement(By.id("bbcid_password"));
		password.click();
		password.sendKeys("renegade");
		System.out.println("Entered Password");
		
		// Click Sign In link
		driver.findElement(By.id("bbcid_submit_button")).click();
		System.out.println("Signed in");
		
		// Wait for 5 secs
		Thread.sleep(5000);
		
		// Close the driver
		driver.quit();
		
}
}