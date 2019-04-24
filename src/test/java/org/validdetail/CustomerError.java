package org.validdetail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CustomerError {
	static WebDriver driver;
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\UserDetail\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");    
	}

	@When("the user fill the valid customer valid detail")
	public void the_user_fill_the_valid_customer_valid_detail(DataTable data1) {
		List<String> detail = data1.asList(String.class);
		driver .findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(detail.get(0));
		driver.findElement(By.id("lname")).sendKeys(detail.get(1));
		driver.findElement(By.id("email")).sendKeys(detail.get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(detail.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(detail.get(4));
   
	}

	@When("the user click the submit button")
	public void the_user_click_the_submit_button(DataTable data2) {
    driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see the customer id genrated")
	public void the_user_should_see_the_customer_id_genrated() {
	   }



}
