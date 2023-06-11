package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElse_Browserdriver {
	
	public static String browser= "edge"; //External configuration
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if  (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option =new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
		} else if  (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option =new EdgeOptions();
		    option.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(option);
		}
			
		driver.get("https://www.w3schools.com/default.asp");
		driver.manage().window().maximize();
		driver.findElement(By.id("search2")).sendKeys("Java");
		driver.findElement(By.id("learntocode_searchbtn")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Start learning JavaScript now »')]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Next ❯')])[1]")).click();
		driver.findElement(By.id("w3loginbtn")).click();
		WebElement login = driver.findElement(By.name("email"));
		login.click();
		login.sendKeys("testrezaeee@gmail.com");
		
//		driver.findElement(By.name("email")).click();
//		driver.findElement(By.name("modalusername")).sendKeys("testrezaeee@gmail.com");
//		driver.findElement(By.name("current-password")).click();
//		driver.findElement(By.name("current-password")).sendKeys("QcTesting@123");
//		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[2]/div[1]/span/svg")).click();
//		
//		driver.findElement(By.xpath("//button[contains(.,'Log in')]")).click();
//		
		driver.close();
		
		
		
		
		
		
	}
}
