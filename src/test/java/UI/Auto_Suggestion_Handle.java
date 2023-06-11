package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggestion_Handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Bangladesh");
		Thread.sleep(3000);
		List<WebElement> AutoSugg = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		int count = AutoSugg.size();
		
		System.out.println(count);
		
		AutoSugg.get(count-6).click();
//		
//		JavascriptExecutor JSE = (JavascriptExecutor)driver;
//		JSE.executeScript("window.scrollBy(0,1200)");
//		driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div/div/div/div[1]/div/a/h3")).click();
		
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(1000);
//		WebElement ele = driver.findElement(By.name("search_query"));
//		ele.sendKeys("Mohammad Hobloss");
//		Thread.sleep(2000);
//		ele.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(3000);
//		List<WebElement> AutoSugg = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li"));
//		
//		int count = AutoSugg.size();
//		
//		System.out.println(count);
//		
//		AutoSugg.get(count-10).click();
		
	}

}
