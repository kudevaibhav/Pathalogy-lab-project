package pom_classes;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_classes.Utility_class;

public class Add_patient_page extends Utility_class{


	WebDriver driver;
	 
    @FindBy(xpath="(//div[@role='button'])[2]") private WebElement test;
    
    @FindBy(xpath="//button[@type='submit']") private WebElement AddPT;
    
    @FindBy(xpath="//input[@name='name']") private WebElement name;
    
    @FindBy(xpath="//input[@name='email']") private WebElement email;
	
    @FindBy(xpath="//input[@name='phone']") private WebElement phone;
	
    @FindBy(xpath="//span[@class='MuiButton-label jss100']") private WebElement generate;
    
    @FindBy(xpath="//input[@name='height']") private WebElement Height;
    
    @FindBy(xpath="//input[@name='weight']") private WebElement weight;
    
    @FindBy(xpath="//div[@aria-haspopup='listbox']") private WebElement gender;
    
    @FindBy(xpath="(//li[@tabindex='-1'])[1]") private WebElement male;
   
    
    @FindBy(xpath="//input[@name='age']") private WebElement age;
    
    @FindBy(xpath="//input[@name='systolic']") private WebElement bloodp;
    
    @FindBy(xpath="//input[@name='diastolic']") private WebElement bloodp2;
    
    @FindBy(xpath="(//button[@type='button'])[4]") private WebElement addtest;
    
    @FindBy(xpath="/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/div/div/input") private WebElement testname;
    
    @FindBy(xpath="(//div[@role='button'])[9]") private WebElement disc;
    
    @FindBy(xpath="//li[@data-value='5']") private WebElement perce;
    
    @FindBy(xpath="//*[@id=\"patient-tests-labs\"]") private WebElement lab;
  
    @FindBy(xpath="(//input[@type='text'])[3]") private WebElement doct;
    
    @FindBy(xpath="(//div[@role='button'])[11]") private WebElement equip1; 
    
    @FindBy(xpath="//li[@data-value='10']") private WebElement comission;
    
    @FindBy(xpath="//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[3]/div/div[1]/div/div[3]/div/div/span/button/span[1]/span") private WebElement addequip;
    
    @FindBy(xpath="(//div[@aria-haspopup='listbox'])[3]") private WebElement sel;
    
    @FindBy(xpath="//li[@role='option']") private WebElement eqp2;
    
    @FindBy(xpath="(//span[@aria-hidden='true'])[5]") private WebElement sel2;
    
    @FindBy(xpath="(//button[@type='button'])[11]") private WebElement Addnew;
    
    
    public Add_patient_page(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 this.driver=driver;
     }
	   
 
 
    
    public void patientContact() throws InterruptedException  {
	//  Utility_class.waitTillElementAppear(driver, test);
	  Thread.sleep(2000);
	  test.click();
	 
	 // Utility_class.waitTillElementAppear(driver, AddPT);
	   AddPT.click(); 
	   
	   name.sendKeys("Vaibhav kude");
	   
	   email.sendKeys("Test@gmail.com");
	   
	   phone.sendKeys("8390272077");
	   
	   generate.click();
	   
	   
	   
  }
 
  public void generalDetails() throws  InterruptedException {
	 
	  Height.sendKeys("152");
	 
	 weight.sendKeys("65");
	 
	 Thread.sleep(2000);
	 gender.click();
	 
	 
	 
	 male.click();
	 age.sendKeys("25");
	 
	 bloodp.sendKeys("78");
	 
	 bloodp2.sendKeys("87");
	 Thread.sleep(2000);
	 addtest.click();
	 
	 
 }
 
  public void testCalculator() throws InterruptedException {
	  Thread.sleep(3000);
	  testname.sendKeys("vitamin b12, serum");
	  testname.sendKeys(Keys.ARROW_DOWN);
	  testname.sendKeys(Keys.ENTER );
	  
	  disc.click();
	 
	  perce.click();
	  
	  lab.sendKeys("hea");
	  lab.sendKeys(Keys.ARROW_DOWN);
	  lab.sendKeys(Keys.ENTER );
	  
	  doct.sendKeys("d");
	  doct.sendKeys(Keys.ENTER );

	  
	  equip1.click();
	  comission.click();
	 
	  
	  addequip.click();
	  addequip.click();
	  
	  
	  sel.click();
	  
	  
	  eqp2.click();
	  sel2.click();
	  
	  Utility_class.waitTillElementAppear(driver, Addnew);
	  Addnew.click();
	  Thread.sleep(3000);
	  
  }
}
