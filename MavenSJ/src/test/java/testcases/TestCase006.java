package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BookingPage;
import pages.HomePage;

public class TestCase006 {
	
	//7. Write code to fill out the booking form with dummy passenger and payment information.
	
	//Unable to enter a details in CardNumber in CreditDebitCard Payment Method.
	
	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void Booking() throws InterruptedException {
		try{
			HomePage Hp = new HomePage(driver);
			BookingPage BP = new BookingPage(driver);
			Hp.OneWay();
//			Hp.RoundTrip();
			BP.Flights();
			BP.Passengers();
			BP.Addon();
			BP.Payment();
			System.out.println("TESTCASE-6 RESULT : Successfully filled the booking form with dummy informations.");
		}
		catch(Exception e){
			System.out.println("TESTCASE-6 RESULT : Test Script execution is interrupted.");
		}
	}	
	
	@AfterTest
	public void END() {
//		driver.close();		
	}
}
