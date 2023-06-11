package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseKeyboard_Keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://translate.google.com/?sl=en&tl=bn&op=translate");
		WebElement a = driver.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"));
		a.sendKeys("My nick Name is Reza, I born and brought up in Dhaka, I have complete my graduation on Engineeringg");
		a.sendKeys(Keys.BACK_SPACE);
		a.sendKeys(Keys.CONTROL+"a");
		a.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[5]/button/div[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[3]/div/div[2]/div[5]/div[2]")).click();
		Thread.sleep(3000);
		a.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/div[4]/div[2]/div/div[2]/span/button/div[3]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[2]/div/div[9]/div/div[4]/div[1]/div[2]/span/button/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[3]/div[1]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("testrezaeee");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("Passwd")).sendKeys("qctesting");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]")).click();
		
		
	}

}
