package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FormAuth{
    public WebDriver driver;
    
    public FormAuth()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open the login page$")
    public void iOpenTheLoginPage() throws Throwable {
        
    	
        driver.get("https://the-internet.herokuapp.com/login");
        Thread.sleep(10000);
    }

    @And("^I enter an invalid user$")
    public void iEnterInvalidUser() throws InterruptedException {
    	
    WebElement userName = driver.findElement(By.id("username"));
    userName.sendKeys("test");
    Thread.sleep(2000);
    
    	
    }
    @And("^I enter an invalid password$")
    public void iEnterInvalidPassword() throws InterruptedException {
    	
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("test");
    Thread.sleep(5000);
    
    	
    }
    @And("^I click the login button$")
    public void iClickLogin() throws InterruptedException {
    	
    WebElement submitButton = driver.findElement(By.xpath("//*[@id='login']/button/i"));
    submitButton.click();
    
    	
    }
    @Then("^I should see the error message$")
    public void iVerifyErrorMessage() throws InterruptedException {
    	
    WebElement errorMessage = driver.findElement(By.id("flash"));
    assertEquals(true, errorMessage.isDisplayed());
    
    	
    }
    
}