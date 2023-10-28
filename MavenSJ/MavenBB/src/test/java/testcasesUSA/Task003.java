package testcasesUSA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.USA_Account;

public class Task003 {
	
	//Task3 : Validating Login functionality.
	//3. Write a code to do Sign-Up and Login functionality.
	
	//Issues
//		1. Unable to sign in again.
//		2. Need to rename the screenshot name each time.
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		HomePage P1 = new HomePage(driver);
		P1.usa();
	}
	
	@Test
	public void Account() throws InterruptedException, IOException {
		try{
			USA_Account USAac = new USA_Account(driver);
//			USAac.SignInNegative1();
//			USAac.SignInNegative2();
			USAac.SignInNegative("grayston@mail.com", "dsniau&12335");
			USAac.SignInPositive("greatking@gmail.com", "ShootingStar@45678");
//			USAac.SignInPositive("abishekabi710@gmail.com", "skyisblue@1947");
			USAac.CreateAccount();
//			USAac.AccOtherOpts();
			System.out.println();
			System.out.println("TESTCASE-3 RESULT : Sign-Up and Login functionality working as Expected.");
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
			System.out.println("TESTCASE-3 RESULT : Execution of Test Script is interrupted..");
			System.out.println();
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();	
	}
}
