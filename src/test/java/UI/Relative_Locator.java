package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(password)).click();
		
		
		
	}

	
}


