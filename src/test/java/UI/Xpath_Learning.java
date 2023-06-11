package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Learning {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		//Using Xpath functions contains
		driver.findElement(By.xpath("//input[contains(@name,'user-name')]")).sendKeys("standard_user");
		//Using Xpath functions starts-with
		WebElement ele= driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
		ele.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ele)).click();
		Thread.sleep(2000);
		//Using Xpath functions text()
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		//Using Xpath functions AND
		driver.findElement(By.xpath("///input[@id='user-name' and @name='user-name']")).sendKeys(args);
		
		//Using Xpath functions OR
		driver.findElement(By.xpath("///input[@id='user-name' or @name='user-name']")).sendKeys(args);
		

		//Xpath Axes Parent  
		//input[@id='user-name']//parent::div
		
		//Xpath Axes self
		//input[@id='user-name']//self::input
		
		//Xpath Axes child
		//div[@id='inventory_container']//child::img
		
		
		
		

	}

}
