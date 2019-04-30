package org.validdetail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseclassAddCustomer extends Basecustomer{
	//static WebDriver driver;
	public BaseclassAddCustomer() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="rental1")
	private WebElement rent;
	@FindBy(id="local_minutes")
	private WebElement loc;
	@FindBy(id="inter_minutes")
	private WebElement inte;
	@FindBy(id="sms_pack")
	private WebElement sms;
	@FindBy(id="minutes_charges")
	private WebElement min;
	@FindBy(id="inter_charges")
	private WebElement cha;
	@FindBy(id="sms_charges")
	private WebElement sm;
	@FindBy(name="submit")
	private WebElement clk;
	public WebElement getClk() {
		return clk;
	}
	public WebElement getRent() {
		return rent;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getInte() {
		return inte;
	}
	public WebElement getSms() {
		return sms;
	}
	public WebElement getMin() {
		return min;
	}
	public WebElement getCha() {
		return cha;
	}
	public WebElement getSm() {
		return sm;
	}
	
}
