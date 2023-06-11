package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("4 years baby boy panjabi");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'])[1]")).click();
//		driver.findElement(By.id("bylineInfo")).click();
//		driver.quit();
		List<WebElement> a=driver.findElements(By.tagName("a"));
		int sizeofa=a.size();
		System.out.println(sizeofa);
		
		
		
		List <WebElement> d= driver.findElements(By.tagName("a"));
		int sizeof_d= a.size();
		 
		System.out.println(sizeof_d);
		
		

	}

}
