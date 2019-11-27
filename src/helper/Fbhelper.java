package helper;

import org.openqa.selenium.By;
import org.testng.Assert;

import locators.Fblocators;
import util.WebDriverAPI01;
import values.Fbvalues;

public class Fbhelper extends WebDriverAPI01 {



	Fblocators ab = new Fblocators();
	Fbvalues bb = new Fbvalues();
	
	public void FbLogoTest(String Fblocators) {
		driver.findElement(By.xpath(""));
	}

	public void FbLogin() {
		TypeByXpath(ab.EmailPh,bb.Email);
		TypeByXpath(ab.PassWord,bb.Pass);
		ClickById(ab.LoginBtn);
		
	}
	
	public void LoginVerify() {
	String Greeting = 	driver.findElement(By.xpath(ab.FbGreeting)).getText();
	String actGreeting = Greeting.trim();
	System.out.println(actGreeting);
	Assert.assertEquals(actGreeting, "MD Jewel");
		
	}

}

	
	
	
	
	
}
