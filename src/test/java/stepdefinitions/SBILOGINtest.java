package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SBILOGINtest 
{
	 WebDriver driver;
		
		@Given("^:User is on sbi login$")
		public void user_is_on_sbi_login() throws Throwable
		{
			
	    	System.setProperty("webdriver.chrome.driver","S:\\ATJAN22SELENIUMTESTNGSETUP\\chromedriver\\chromedriver101\\chromedriver.exe");
				
				//Initiate WebDriver Instance
				 driver = new ChromeDriver();

				//Maximize the browser
				driver.manage().window().maximize();
					
					
				driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");   
		}

		@When("^:user click on proceed to login$")
		public void user_click_on_proceed_to_login() throws Throwable
		{
		   driver.findElement(By.xpath("//div[@class='continue_btn']/child::a")).click();
		}

		@Then("^:All controls on login page should be visible$")
		public void all_controls_on_login_page_should_be_visible() throws Throwable 
		{
			System.out.println("USer validated all controls are visible");
		    
		}

		@Then("^:User enters username and password$")
		public void user_enters_username_and_password() throws Throwable
		{
			driver.findElement(By.id("username")).sendKeys("abc");
			driver.findElement(By.id("label2")).sendKeys("123");
			
			
		}

		@And("^: User clicks on login button$")
		public void user_clicks_on_login_button() throws Throwable 
		{
			driver.findElement(By.id("Button2")).click(); 
		}

		/*@Then("^:Validate user is logged in$")
		public void validate_user_is_logged_in() throws Throwable 
		{
		    System.out.println("User logged in successfully");
		}*/
	
	

}
