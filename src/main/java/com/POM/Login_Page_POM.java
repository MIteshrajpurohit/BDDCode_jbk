package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_POM {
	
	
	public WebDriver driver;
	public Login_Page_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement username_id;
	@FindBy(id="password")
	WebElement pass_id;
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	public void login_jbk(String username ,String password) {
		username_id.sendKeys(username);
		pass_id.sendKeys(password);
		button.click();
		
	}

}
