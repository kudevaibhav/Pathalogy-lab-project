package test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_classes.Browser_class;
import pom_classes.Add_patient_page;
import pom_classes.Login_page;



public class Verify_that_user_can_login_using_valid_credential {

	static WebDriver driver;
	Login_page lp;  
	Add_patient_page ap;
	
	
	
	@BeforeClass
	public void beforeclass() {
		driver=Browser_class.getBrowser(driver);
	}
	
	@BeforeMethod
	public void beforemethod() {
		lp=new Login_page(driver);
		ap=new Add_patient_page(driver);
	}
	
	@Test(priority=1)
	public void verifyLogin() throws IOException {
		lp.loginToPathlab();
	}
	
	 @Test(priority=2)
	 public void logout() {
		 
		 lp.logout();
	 }
	 
	 @AfterClass
	 public void afterclass() {
				
				driver.close();
				
	}
		 
	
	
	
}
