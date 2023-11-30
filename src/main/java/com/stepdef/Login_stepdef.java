package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.POM.Login_Page_POM;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepdef {
	public WebDriver driver;
	
	public Login_Page_POM lp = null;
	@Before
	public void setup1() {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe" );
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///D:/Selenium_study/Offline%20Website/index.html");
	}
	@After
	public void teardown1() {
		driver.quit();
	}
	
	@Given("^user should be on login page1$")
	public void user_should_be_on_login_page1() throws Throwable {
	    System.out.println(driver.getTitle());
	}
	@Then("User should see Header txt on login page")
	public void user_should_see_header_txt_on_login_page() {
	    String Act_element = driver.findElement(By.xpath("//b[contains(text(),'Java By Kiran')]")).getText();
	    System.out.println(Act_element);
	    Assert.assertEquals(Act_element, "Java By Kiran");

}
	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		lp = new Login_Page_POM(driver);
		lp.login_jbk(username, password);
	/*	driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();*/
	}
}