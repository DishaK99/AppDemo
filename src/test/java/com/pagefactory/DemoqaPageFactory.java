package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="firstName")WebElement firstname;
	@FindBy(id="lastName")WebElement lastname;
	@FindBy(id="userEmail")WebElement useremail;
	@FindBy(id="userNumber")WebElement number;
	@FindBy(id="dateOfBirthInput")WebElement birthDate;
	@FindBy(id="submit")WebElement submitBtn;
	@FindBy(id="currentAddress")WebElement address;
	
	public DemoqaPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterDetails(String fname, String lname, String email, String mobNumber, String userAddress)
	{
	
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		useremail.sendKeys(email);
		number.sendKeys(mobNumber);
		address.sendKeys(userAddress);
		//birthDate.sendKeys(DOB);
		
	}
	
	public void enterInvalidDetails(String fname, String lname, String email)
	{
	
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		useremail.sendKeys(email);
		
		
	}
	public void saveDetails()
	{
		submitBtn.click();	
		}
	
}
