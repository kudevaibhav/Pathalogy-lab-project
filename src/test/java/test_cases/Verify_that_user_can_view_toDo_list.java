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
import pom_classes.Dashboard_page;
import pom_classes.Login_page;

public class Verify_that_user_can_view_toDo_list {

	static WebDriver driver;
	Login_page lp;
	Dashboard_page dp;
	
	
	
	
	@BeforeClass
	public void beforeclass() {
		driver=Browser_class.getBrowser(driver);
	}
	
	@BeforeMethod
	public void beforemethod() {
		lp=new Login_page(driver);
		dp =new Dashboard_page(driver);
	}
	
	@Test(priority=1)
	public void verifyLogin() throws IOException {
		lp.loginToPathlab();
	}
	
	 @Test(priority=2)
	 public void viewList() throws InterruptedException {
		 dp.todolist();
		 
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
