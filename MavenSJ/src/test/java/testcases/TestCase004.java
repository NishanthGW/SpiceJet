package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class TestCase004 {
	
//	5. Write code to search for flights by entering dummy origin and destination information for below types of trips:
//		a. One-way
//		b. Round Trip
	
	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void Search() throws InterruptedException {
		HomePage Hp = new HomePage(driver);
		try{
			Hp.OneWay();
			Hp.SSTC004();
			System.out.println("TESTCASE-4 RESULT : One-way functionality working as expected.");
			
			Hp.RoundTrip();
			Hp.SSTC004();
			System.out.println("TESTCASE-4 RESULT : Round Trip functionality working as expected.");
		}
		catch(Exception e){
			System.out.println("TESTCASE-4 RESULT : Test Script execution interrupted.");
		}
	}
	
	@AfterTest
	public void END() {
		driver.close();		
	}
}
