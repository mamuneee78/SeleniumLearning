package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnable_IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(4000);
		//run the java script code
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,3500)");
		
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-200)");
		
		WebElement com1 = driver.findElement(By.id("but1"));
		Boolean c1 = com1.isEnabled();
		System.out.println(c1);
		Boolean c2 = com1.isDisplayed();
		System.out.println(c2);
		
//		WebElement com2 = driver.findElement(By.id("but2"));
//		Boolean c3 = com1.isEnabled();
//		System.out.println(c3);
//		Boolean c4 = com1.isDisplayed();
//		System.out.println(c4);
//		
		WebElement ele1 = driver.findElement(By.name("vehicle"));
		Boolean e1 = ele1.isSelected();
		System.out.println(e1);
		
//		WebElement ele2 = driver.findElement(By.name("vehicle"));
//		ele2.click();
//		Boolean e2 = ele2.isSelected();
//		System.out.println(e2);
//		
		driver.findElement(By.id("uploadfile")).sendKeys("E:\\Me\\Photo ID\\Screenshot_2.png");
		
//		if(com1.isDisplayed() && com1.isEnabled())
//		{
//			System.out.println("This Field can perform action");
//		}
//		else 
//		{
//			System.out.println("This Field can perform action");
//		}
		
	}
}
