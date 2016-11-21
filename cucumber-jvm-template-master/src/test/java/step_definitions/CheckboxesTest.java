package step_definitions;

import static org.testng.AssertJUnit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CheckboxesTest{
    public WebDriver driver;
    
    public CheckboxesTest()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open the checkboxes website$")
    public void iOpenTheCheckboxesWebsite() throws Exception {
        
    	
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(10000);
    }
    WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")); 
    WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")); 
    
    @And("^I verify checkbox 2 is checked$")
    public void iCheckForCheckbox2Check() throws Throwable {
    
    assertTrue(checkbox2.isSelected());
    
    	
    }
    @And("^I click checkbox 1$")
    public void iClickCheckbox1() throws Throwable {
    	
         
    checkbox1.click();
    
    	
    }
    @Then("^I verify checkbox 1 is checked$")
    public void iCheckForCheckbox1Check() throws Throwable {
    
    assertTrue(checkbox2.isSelected());
    
    	
    }
    @And("^I click checkbox 2$")
    public void iClickCheckbox2() throws Throwable {
    	
         
    checkbox2.click();
    
    	
    }
    @Then("^I verify checkbox 2 is unchecked$")
    public void iCheckForCheckbox2NotChecked() throws Throwable {
    
    
    assertEquals(false, checkbox2.isSelected());
    
    	
    }
    
}