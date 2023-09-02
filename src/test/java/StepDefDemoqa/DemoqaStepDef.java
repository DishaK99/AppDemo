package StepDefDemoqa;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.DemoqaPageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoqaStepDef {
	
	WebDriver driver;
	DemoqaPageFactory pf;
	Actions action;
	
	@Given("user is on the registration page of demoqa")
	public void user_is_on_the_registration_page_of_demoqa() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
	   
	}
	@When("user enters all the valid data")
	public void user_enters_all_the_valid_data(DataTable data) {
		
		pf=new DemoqaPageFactory(driver);

		List<String> cell1=data.asList(String.class);
		pf.enterDetails(cell1.get(0),cell1.get(1), cell1.get(2), cell1.get(3), cell1.get(4));
	    
	}
	@And("user clicks enter button")
	public void user_clicks_enter_button() {
		action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	@Then("Registration should be successful")
	public void registration_should_be_successful() {
	    
	}
	@When("user enters all the invalid data")
	public void user_enters_all_the_invalid_data(DataTable data) {
		
		pf=new DemoqaPageFactory(driver);

		List<String> cell1=data.asList(String.class);
		pf.enterInvalidDetails(cell1.get(0),cell1.get(1), cell1.get(2));
	    
	    
	}
	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	   
	}

}
