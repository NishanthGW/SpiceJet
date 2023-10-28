package testcasesUSA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.USA_Menu;

public class Task009 {
	
	//9. Write code to navigate to the checkout page and fill out the form with dummy payment information.
	
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
	public void BrandsCart() throws InterruptedException {
		try{
			USA_Menu Um = new USA_Menu(driver);
//			Um.AddBrands();
//			Um.AddAppliances();
			Um.AddAudio();
			Um.Checkout();
			System.out.println();
			System.out.println("TESTCASE-9 RESULT : Successfully navigated to the checkout page.");	
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
			System.out.println("TESTCASE-9 RESULT : Execution of Test Script is interrupted.");	
			System.out.println();
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();	
	}

}
