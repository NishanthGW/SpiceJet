package testcasesUSA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HPBottomlinks;
import pages.HomePage;

public class Task005 {
	
	//5. Write a code to validate the bottom links on the home page.
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		HomePage P1 = new HomePage(driver);
		P1.usa();
		JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
		JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	@Test
	public void BottomLinks() throws InterruptedException {
		try{
			HPBottomlinks BL = new HPBottomlinks(driver);
			BL.OrderPurchases();
			BL.SupportServices();
			BL.Partnerships();
			BL.PaymentOptions();
			BL.RewardsMembership();
			BL.AboutBestBuy();
			System.out.println();
			System.out.println("TESTCASE-5 RESULT : Bottom Links are working as Expected.");
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
			System.out.println("TESTCASE-5 RESULT : Execution of Test Script is interrupted.");
			System.out.println();
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();	
	}
}
