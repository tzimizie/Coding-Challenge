package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class ChallengingDomPage extends BaseClass{

	public ChallengingDomPage(WebDriver driver) {
		super(driver);
		
	}

	
		//@FindBy(how=How.XPATH, using="//*[@id='content']/div/div/div/div[2]/table/tbody/tr[5]/td[4]")
		//public static WebElement definiebas4;
		
		//public static WebElement definiebas4 = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr[5]/td[4]"));
	
		@FindBy(how=How.ID, using="canvas")
		public static WebElement answerBox;
		
	

		
	
		
	
	
}
		