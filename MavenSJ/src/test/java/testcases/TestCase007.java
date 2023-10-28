package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import pages.HomePage;

public class TestCase007 {
	
	//8. Write code to verify that the booking was successful by checking the resulting web page for the booking confirmation message.

	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void ConfirmationCheck() throws InterruptedException {
//		HomePage Hp = new HomePage(driver);
//		Hp.OneWay();
//		Hp.RoundTrip();
	}
	
	@AfterTest
	public void END() {
//		driver.close();		
	}

}
