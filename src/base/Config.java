package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import util.WebDriverAPI01;

public class Config extends WebDriverAPI01 {

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)

	public void browsersetup(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\QA2019\\GitHub\\FrameworkDesign\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\QA2019\\GitHub\\FrameworkDesign\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.get("http://www.facecook.com");
		pageload();
		maxscreen();
		wttime();
		
		
		
		
		
		
	}

}
