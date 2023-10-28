package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.OtherMenusPage;

public class TestCase008 {
	
//	9. Write a code to validate below fields available on booking page
//		a. Check-in
//		b. Flight status
//		c. Manage Booking
//	10. Write code to close the web browser when testing is complete.
	
	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void Otherfields() throws InterruptedException {
		try{
			OtherMenusPage OMP = new OtherMenusPage(driver);
			OMP.Checkin();
			Thread.sleep(5000);
			OMP.SSTC008();
			System.out.println("TESTCASE-8 RESULT : PASS: Check-in functionality working as expected.");
			OMP.Flightstatus();
			Thread.sleep(5000);
			OMP.SSTC008();
			System.out.println("TESTCASE-8 RESULT : PASS: Flight status functionality working as expected.");
			OMP.ManageBooking();
			Thread.sleep(5000);
			OMP.SSTC008();
			System.out.println("TESTCASE-8 RESULT : PASS: Manage Booking functionality working as expected.");
//			OMP.BookyourCharter();
//			Thread.sleep(5000);
//			OMP.SSTC008();
//			System.out.println("TESTCASE-8 RESULT : PASS: BookyourCharter functionality working as expected.");
			
		}
		catch(Exception e){
			System.out.println("TESTCASE-8 RESULT : FAIL: Test Script execution interrupted.");
		}
	}

	@AfterTest
	public void END() {
//		driver.quit();		
	}
}
