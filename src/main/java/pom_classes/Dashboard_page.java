package pom_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page {

	
    WebDriver driver;
	
	@FindBy(xpath="(//span[@class='MuiButton-label'])[1]") private WebElement todolist;
	
	
	
	
	
	
	
	public Dashboard_page(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 this.driver=driver;
    }
	
	
	
	public void todolist() throws InterruptedException {
		
		todolist.click();
		todolist.click();
	    Thread.sleep(5000);
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


