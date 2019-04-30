package org.validdetail;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
static WebDriver driver;
@Before
public void method1() {
	System.out.println("before");
	System.setProperty("webdriver.chrome.driver", "E:\\AddUserDetail\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/addtariffplans.php");

}
@After
public void method2() {
	System.out.println("after");
    driver.quit();
}
}
