package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAutomation {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions Option=new ChromeOptions();
//		Option.addArguments("--remote-allow-origins=*");
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions Option=new EdgeOptions();
//		Option.addArguments("--remote-allow-origins=*");
//		ChromeOptions Option2=new ChromeOptions();
//		Option2.addArguments("--desable-notifications");
//		EdgeDriver driver= new EdgeDriver(Option);
		
		
		driver.get("https://www.facebook.com/");
		String a = driver.getCurrentUrl();
		System.out.println(a);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("01558225994");
		
		driver.findElement(By.name("pass")).sendKeys("qctesting");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//svg[@viewBox='0 0 28 28']")).click();
		
    	WebElement body = driver.findElement(By.xpath("//svg[@viewBox='0 0 28 28']"));
		body.click();
//		body.sendKeys("Facebook Automation Test");
		
		
		
		
		
		
	}

}
