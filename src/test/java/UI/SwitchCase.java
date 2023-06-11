package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchCase {
	public static String browser = "chome";
	public static WebDriver driver;

	public static void main(String[] args) {
	
		if (browser.equals("chome")) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver= new ChromeDriver();
			ChromeOptions option= new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
		}
		
		else if (browser.equals("chome")) {
			
		}
	}

}
