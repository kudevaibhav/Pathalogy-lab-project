package utility_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_class {

	
	public static CharSequence getConfigData(String key) throws IOException {
		FileInputStream file = new FileInputStream("Configuration\\Config.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
	
	
	 public static void waitTillElementAppear(WebDriver driver, List<WebElement> listOfElements) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfElements));
	}
	
	
	public static void waitTillElementAppear(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
public static void waitTillElementAppear(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	
	
}
