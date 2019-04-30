package org.validdetail;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline extends BaseclassAddCustomer {
	//static WebDriver driver;
//	BaseclassAddCustomer b=new BaseclassAddCustomer();

	
	//BaseclassAddCustomer b=new BaseclassAddCustomer();
	@Given("The user is in add triff paln page")
	public void the_user_is_in_add_triff_paln_page() {
		
		Hooks.driver.get("http://demo.guru99.com/telecom/addtariffplans.php");

	}

	@When("The user fill the valid detail {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_the_valid_detail(String monthrent, String freeloc, String freeint, String freesms, String loccharges, String intcharges, String testrep) {
		//BaseclassAddCustomer b=new BaseclassAddCustomer();
		BaseclassAddCustomer b = PageFactory.initElements(Hooks.driver, BaseclassAddCustomer.class);
	type(b.getRent(), monthrent);
	type(b.getLoc(), loccharges);
	type(b.getCha(), freesms);
	type(b.getMin(), freeint);
	type(b.getInte(), testrep);
	type(b.getSm(), intcharges);
	type(b.getSms(), freeloc);
	
	}

	@When("The user click the submit button in add triff plan")
	public void the_user_click_the_submit_button_in_add_triff_plan() {
		 Hooks.driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {
		Assert.assertTrue(Hooks.driver.findElement(By.tagName("h2")).isDisplayed());	

	}




}
