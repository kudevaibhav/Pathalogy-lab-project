package base_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_class {

	
static WebDriver driver;
	
	
	
	public static WebDriver getBrowser(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gor-pathology.web.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
			
	}
	
}
