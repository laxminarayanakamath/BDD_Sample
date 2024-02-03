package cucumber;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Verify;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;	

public class stepdefinition {				
 
    WebDriver driver;			
    		
    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.firefoxdriver().setup();
        // Create the driver object
       // driver = new ChromeDriver();
         driver= new FirefoxDriver();					
         driver.manage().window().maximize();			
         driver.get("http://demo.guru99.com/v4");
    }
    @When("user enters <username> and <password>")
    public void user_enters_username_and_password() {
    	driver.findElement(By.name("uid")).sendKeys("mngr551512");							
        driver.findElement(By.name("password")).sendKeys("tYqupYd");
    }
    @And("Clicks on login button")
    public void clicks_on_login_nutton() {
    	driver.findElement(By.name("btnLogin")).click();	
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
    	WebElement menu = driver.findElement(By.xpath("//div/ul[@class='menusubnav']"));
    	Verify.verify(menu.isDisplayed());
    	
    }
    @Then("logout from the application")
    public void user_logout_from_the_application() {
    	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
    }
    
    @Then("close browser")
    public void quit_browser()
    {
    	driver.quit();
    }
}		