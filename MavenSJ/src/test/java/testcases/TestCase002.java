package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignUpPage;

public class TestCase002 {
	
	//3. Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields.

	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void SignUp() throws InterruptedException, IOException {
		SignUpPage Home = new SignUpPage(driver);
		Home.signup();
        System.out.println();
        System.out.println("TESTCASE-2 RESULT : SignUp page has been validated successfully and working as expected.");
        System.out.println();
	}
	
	@AfterTest
    public void End(){
		driver.quit();      	
    }
}
