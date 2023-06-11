package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector_learn {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		//Using Xpath functions contains
		driver.findElement(By.xpath("//input[contains(@name,'user-name')]")).sendKeys("standard_user");
		//Using Xpath functions starts-with
		WebElement ele= driver.findElement(By.xpath("//input[starts-with(@name,'password')]"));
		ele.sendKeys("secret_sauce");

	}

}
