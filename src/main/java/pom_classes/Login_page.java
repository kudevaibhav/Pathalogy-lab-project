package pom_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_classes.Utility_class;

public class Login_page {

WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']") private WebElement email;
	
	@FindBy(xpath="//input[@name='password']") private WebElement pass;
	
	@FindBy(xpath="(//span[@class='MuiButton-label'])[1]") private WebElement login;
	
	@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circle jss33 MuiAvatar-colorDefault']") private WebElement logout;
	
	@FindBy(xpath="	 //span[text()='Sign out of Lab']") private WebElement signout;
	
   public Login_page(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 this.driver=driver;
    }
	
	
   public void loginToPathlab() throws IOException {
	 email.sendKeys(Utility_class.getConfigData("email"));
	 
	 pass.sendKeys(Utility_class.getConfigData("pass"));
		
	 login.click();	
		
	}
	
	
   public void logout() {
	  
	  logout.click();
	  signout.click();
	  
   }
}
