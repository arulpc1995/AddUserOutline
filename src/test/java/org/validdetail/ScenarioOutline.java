package org.validdetail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline {
	static WebDriver driver;
	@Given("The user is in add triff paln page")
	public void the_user_is_in_add_triff_paln_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\UserDetail\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");

	}

	@When("The user fill the valid detail {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_the_valid_detail(String monthrent, String freeloc, String freeint, String freesms, String loccharges, String intcharges, String testrep) {
		
		driver.findElement(By.id("rental1")).sendKeys(monthrent);
		driver.findElement(By.id("local_minutes")).sendKeys(freeloc);
		driver.findElement(By.id("inter_minutes")).sendKeys(freeint);
		driver.findElement(By.id("sms_pack")).sendKeys(freesms);
		driver.findElement(By.id("minutes_charges")).sendKeys(loccharges);
		driver.findElement(By.id("inter_charges")).sendKeys(intcharges);
		driver.findElement(By.id("sms_charges")).sendKeys(testrep);
	}

	@When("The user click the submit button in add triff plan")
	public void the_user_click_the_submit_button_in_add_triff_plan() {
		 driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());	

	}




}
