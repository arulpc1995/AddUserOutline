package org.validdetail;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basecustomer {
static WebDriver driver;
public static WebDriver browserchrome(String url) {
System.setProperty("webdriver.chrome.driver", "E:\\Mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
return driver;
	}
public static WebDriver browserexplore(String url) {
	System.setProperty("webdriver.ie.driver", "E:\\Mavenproject\\driver\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	driver.get(url);
	return driver;
	}
public static void type(WebElement element,String name) {
	element.sendKeys(name);
	}
public static void clkbutton(WebElement element) {
	element.click();
}
public static void closebrowser(WebDriver driver) {
	driver.quit();
}
//by using drop down method mean we using select interface method
public static void dropdown(WebElement element,String name) {
	Select s=new Select(element);
	List<WebElement> opt = s.getOptions();
	for (WebElement se : opt) {
		String text = se.getText();
		System.out.println(text);
		if (text.equals(name)||text.equals(name)) {
			s.selectByValue(text);
			s.selectByVisibleText(text);
			s.deselectAll();
			s.deselectByValue(text);
			s.deselectByVisibleText(name);
		}
	}
	}
public static void select(WebElement element,String name) {
	Select s1=new Select(element);
	s1.selectByVisibleText(name);
     
}

	public static void dropdownindex(WebElement element,int n) {
		
	Select s2=new Select(element);
	List<WebElement> opt = s2.getOptions();
	WebElement we = opt.get(n);
	String t1 = we.getText();
	System.out.println(t1);
	s2.selectByIndex(n);
	
	
	}

public static void takecsreenshot(WebDriver driver,String name) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File dest=new File(name);
	FileUtils.copyFile(source, dest);
	
}

public static void WHPwind(WebDriver driver) {
	String pwind = driver.getWindowHandle();
	System.out.println(pwind);
	
	Set<String> allwin = driver.getWindowHandles();
	System.out.println(allwin);
	for (String cwind : allwin) {
		if (!cwind.equals(pwind)) {
			driver.switchTo().window(pwind);
		}
	}
	}
	public static void WHcwind(WebDriver driver) {
		String pwind = driver.getWindowHandle();
		System.out.println(pwind);
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		for (String cwind : allwin) {
			if (!cwind.equals(pwind)) {
				driver.switchTo().window(cwind);
			}
		}
}
	
	public static void WHallwind(WebDriver driver) {
		String pwind = driver.getWindowHandle();
		System.out.println(pwind);
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		for (String cwind : allwin) {
			if (!cwind.equals(pwind)) {
				driver.switchTo().defaultContent();
			}
		}
	}

	public static void acti(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.contextClick(element).perform();
	//a.dragAndDrop(element, element2).perform();
}
public static void robo(WebElement element,int aski) throws AWTException {
	Robot r=new Robot();
	r.keyPress(aski);
	r.keyRelease(aski);

}
public static void alert(WebDriver driver,WebElement element) {
	Alert a=driver.switchTo().alert();
	a.accept();
}
public static void alertdis(WebDriver driver,WebElement element) {
	Alert a=driver.switchTo().alert();
	a.dismiss();
}
public static void scrolldown(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
}

public static void scrollup(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);
}


}
