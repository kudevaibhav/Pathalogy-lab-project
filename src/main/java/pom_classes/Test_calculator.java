package pom_classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_calculator {

	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']") private WebElement test;
	
	@FindBy(xpath="(//div[@ role='button'])[51]") private WebElement disc;
	
	@FindBy(xpath="(//li[@role='option'])[2]") private WebElement disc1;
	
	
	
	public Test_calculator(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 this.driver=driver;
    }
	
	
	
	public void calculateTestCost() {
		
		test.sendKeys("vita");
		test.sendKeys(Keys.ARROW_DOWN);
		test.sendKeys(Keys.ENTER);
		
		disc.click();
		disc1.click();
		
		
		
		
	}
	
}
