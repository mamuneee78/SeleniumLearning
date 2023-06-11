package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMVNclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.firefoxdriver().setup();
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(Option);
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Oppo mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a/div/span")).click();
		
		WebElement buy=driver.findElement(By.xpath("//a[contains(.,'Buy It Now')]"));
		buy.click();
		
        String a = driver.getCurrentUrl();
		
		System.out.println(a);
		
		String b = driver.getTitle();
		System.out.println(b);
		
		//driver.close();

		
		
		
	}

}
