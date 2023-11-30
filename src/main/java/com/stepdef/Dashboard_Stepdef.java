package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard_Stepdef {
	public WebDriver driver;
	@Before
	public void setup() {
		 System.setProperty("webdriver.gecko.driver","geckodriver.exe" );
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Selenium_study/Offline%20Website/index.html");
	}
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		System.out.println(driver.getTitle());
	   
	}
		
	    @When("user enter usernamepassword")
	    public void user_enter_usernamepassword() {
	        driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("123456");
	        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	    }
	    @Then("user will be on home page")
	    public void user_will_be_on_home_page() {
	        System.out.println(driver.getTitle());
	    }
	    @Then("user should be logout")
	    public void user_should_be_logout() throws Exception {
	    	Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[contains(text(),'LOGOUT')]")).click();
	    }
	    @Then("user page should be open")
	    public void user_page_should_be_open() {
	        driver.findElement(By.xpath("//span[contains(text(),'Users')]")).click();
	    }

}
