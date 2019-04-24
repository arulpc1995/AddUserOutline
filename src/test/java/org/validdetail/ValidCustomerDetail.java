package org.validdetail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidCustomerDetail {
	static WebDriver driver;
	@Given("user in add customer detail page")
	public void user_in_add_customer_detail_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\UserDetail\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");    
	}

	@When("user fill the valid customer detail in the page")
	public void user_fill_the_valid_customer_detail_in_the_page() {
		driver .findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("arul");
		driver.findElement(By.id("lname")).sendKeys("murugan");
		driver.findElement(By.id("email")).sendKeys("ardyf@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("address");
		driver.findElement(By.id("telephoneno")).sendKeys("812222914");
   
	}

	@When("user click the submit button")
	public void user_click_the_submit_button() {
		driver.findElement(By.name("submit")).click();   
	}

	@Then("user should see the customer id genrated")
	public void user_should_see_the_customer_id_genrated() {
	Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed()); 	   
	}
	
}
