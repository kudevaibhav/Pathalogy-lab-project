package pom_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page {

	
    WebDriver driver;
	
	@FindBy(xpath="(//span[@class='MuiButton-label'])[1]") private WebElement todolist;
	
	@FindBy(xpath="//h6[text()='Doctor']") private WebElement scroll;
	
	
	
	
	
	public Dashboard_page(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 this.driver=driver;
    }
	
	
	
	public void todolist() throws InterruptedException {
		
		todolist.click();
	    Thread.sleep(2000);
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("argument[0].scrollintoView(true);",scroll );
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


