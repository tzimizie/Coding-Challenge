package step_definitions;

import static org.testng.AssertJUnit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ChallengingDomPage;


public class ChallengingDom{
    public WebDriver driver;
    
    public ChallengingDom()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open the Dom website$")
    public void iOpenTheDomWebsite() throws Throwable {
        
    	
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        Thread.sleep(10000);
    }

    @Then("^I verify the table contains definiebas4$")
    public void iCheckForTheTableContents() throws Throwable {
    WebElement definiebas4 = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr[5]/td[4]"));
    	
    System.out.print(definiebas4.toString());
    String tableText = definiebas4.toString();
    assertTrue((tableText.contains("definiebas4")));
    
    	
    }
    @And("^the number in the answer box is printed out$")
    public void answerBoxNumberPrinted() throws Throwable {
    	
    String boxText = ChallengingDomPage.answerBox.getText();
    System.out.println(boxText);
    
    	
    }
    
    @And("^the text in the blue button is printed out$")
    public void blueBoxTextPrinted() throws Throwable {
    String boxText = ChallengingDomPage.answerBox.getText();
    System.out.println(boxText);
    
    	
    }
    
}