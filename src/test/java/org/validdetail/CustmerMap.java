package org.validdetail;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CustmerMap {
	static WebDriver driver;

	@Given("The user into the add customer page")
	public void the_user_into_the_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\UserDetail\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");

	}

	@When("The user fill the valid customer ID detail")
	public void the_user_fill_the_valid_customer_ID_detail(DataTable mapdetail) {
		Map<String, String> MapDetail = mapdetail.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(MapDetail.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(MapDetail.get("lname"));
		driver.findElement(By.id("email")).sendKeys(MapDetail.get("email"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(MapDetail.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(MapDetail.get("phnum"));
	}

	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		 driver.findElement(By.name("submit")).click();
	}

	@Then("The user check the correct User genrated ID formate")
	public void the_user_check_the_correct_User_genrated_ID_formate() {
      Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());		
	}

}
