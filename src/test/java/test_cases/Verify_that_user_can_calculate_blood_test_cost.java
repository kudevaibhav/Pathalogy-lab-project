package test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;



import java.io.IOException;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.BeforeMethod;


import base_classes.Browser_class;
import pom_classes.Login_page;
import pom_classes.Test_calculator;

public class Verify_that_user_can_calculate_blood_test_cost {

	
	static WebDriver driver;
	Login_page lp;
	Test_calculator tc;  
	
	
	
	
	@BeforeClass
	public void beforeclass() {
		driver=Browser_class.getBrowser(driver);
	}
	
	@BeforeMethod
	public void beforemethod() {
		lp=new Login_page(driver);
		tc=new Test_calculator(driver);
	}
	
	@Test(priority=1)
	public void verifyLogin() throws IOException {
		lp.loginToPathlab();
	}
	
	 @Test(priority=2)
	 public void testCost() {
		 
		 tc.calculateTestCost();
	 }
	
	
	@Test (priority=3)
	public void logout() {
		lp.logout();
	}
	
	@AfterClass
	public void afterclass() {
			
			driver.close();
			
		}
}
