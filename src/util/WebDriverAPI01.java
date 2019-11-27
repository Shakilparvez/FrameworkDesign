package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverAPI01 {

	public WebDriver driver;

	public void pageload() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public void maxscreen() {
		driver.manage().window().maximize();
	}

	public void wttime() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void dltcookies() {
		driver.manage().deleteAllCookies();

	}

	public void TypeByXpath(String FbLocators, String Fbvalues) {
		driver.findElement(By.xpath(FbLocators)).sendKeys(Fbvalues);

	}

	public void ClickByXpath(String FbLocators) {
		driver.findElement(By.xpath(FbLocators)).click();
	}

	public void ClickById(String FbLocators) {
		driver.findElement(By.id(FbLocators)).click();
	}

	public void FindByXpath(String FbLocators) {
		driver.findElement(By.xpath(FbLocators)).isEnabled();

	}

	// select from drop-down list//WebElemet

	public void selectMonth(String month) {

		WebElement wb1 = driver.findElement(By.id("month"));
		Select s1 = new Select(wb1);
		s1.selectByValue("month");

	}
}
