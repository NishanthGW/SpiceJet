package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BookingPage;
import pages.HomePage;

public class TestCase005 {
	
	//6. Write code to select a flight and proceed to the booking page.
	
	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void SelectFlight() throws InterruptedException, IOException {
		try{
			HomePage Hp = new HomePage(driver);
			Hp.OneWay();
//			Hp.RoundTrip();
			BookingPage BPage = new BookingPage(driver);
			BPage.Flights();
			BPage.SSTC005();
			System.out.println("TESTCASE-5 RESULT : PASS: flight has been successfully selected and navigated to the booking page.");
		}
		catch(Exception e){
			System.out.println("TESTCASE-5 RESULT : FAIL: Test Script execution interrupted.");
		}
	}

	@AfterTest
	public void END() {
//		driver.close();		
	}
}
