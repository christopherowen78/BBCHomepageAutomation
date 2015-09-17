package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverCommands {
	
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		// Navigate To command
		driver.navigate().to("http://www.bbc.co.uk");
		System.out.println("Successfully opened the BBC Homepage");
		
		// Navigate to Sign In
		driver.findElement(By.id("idcta-link")).click();;
		System.out.println("Click Sign In link");
		
		// Back command
		driver.navigate().back();
		System.out.println("Navigate back to Homepage");
		
		// Refresh command
		driver.navigate().refresh();
		System.out.println("Page refresh");
		
		// Forward command
		driver.navigate().forward();
		System.out.println("Navigate forward to Sign In");
	
		// Enter username
		WebElement element = driver.findElement(By.id("bbcid_unique"));
		element.click();
		System.out.println("Clicked in Username field");
		element.sendKeys("mbbx6clo");
		
		// Wait for 5 secs
		Thread.sleep(5000);
		
		// Close the driver
		driver.quit();
		
}
}