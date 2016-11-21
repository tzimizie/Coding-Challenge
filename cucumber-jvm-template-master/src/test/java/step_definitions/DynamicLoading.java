package step_definitions;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DynamicLoading{
    public WebDriver driver;
    
    public DynamicLoading()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open the Dynamic Website$")
    public void iOpenTheDynamicWebsite() throws Throwable {
        
    	
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Thread.sleep(10000);
    }

    @And("^I click the start button$")
    public void iClickTheStartButton() throws InterruptedException {
    	
    WebElement startButton = driver.findElement(By.xpath("//*[@id='start']/button"));
    startButton.click();
    Thread.sleep(2000);
    
    	
    }
    @And("^I verify the loading bar$")
    public void iVerifyTheLoadingBar() throws InterruptedException {
    	
    WebElement loadingBar = driver.findElement(By.xpath("//*[@id='loading']/img"));
    assertEquals(true, loadingBar.isDisplayed());
    Thread.sleep(8000);
    
    	
    }
    @Then("^I check for Hello World$")
    public void iVerifyHelloWorld() throws InterruptedException {
    	
    WebElement helloWorld = driver.findElement(By.xpath("//*[@id='finish']/h4"));
    assertEquals(true, helloWorld.isDisplayed());
    
    	
    }
  
}