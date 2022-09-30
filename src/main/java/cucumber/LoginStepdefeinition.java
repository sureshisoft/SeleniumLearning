package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdefeinition {
	
	WebDriver driver;
	
	@Given("Click on the Chromebrowser and Enter URL of Orange HRM")
	public void click_on_the_chromebrowser_and_enter_url_of_orange_hrm() 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	
	
	@When("Enter username and Password in OrangerHRM")
	public void enter_username_and_password_in_oranger_hrm() {
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	   
	}
	
	  @Then("Orange HRM Page should be loginned sucessfully") public void
	  orange_hrm_page_should_be_loginned_sucessfully() {
	  
	  driver.findElement(By.name("Submit")).click(); }
	 

}
