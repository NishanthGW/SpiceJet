package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LogInPage;

public class TestCase003 {
	
	//4. Write a code to Login with dummy email ID and Password on Popup fields after clicking	Login button on top of the page.
		
	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void Login() throws InterruptedException, IOException {
		LogInPage LIPage = new LogInPage(driver);
			LIPage.EmailLI();
			LIPage.MobilelLI();
//			LIPage.OtherLI();	
	}
	
	@AfterTest
	public void End() {	
		driver.close();
	}
}
