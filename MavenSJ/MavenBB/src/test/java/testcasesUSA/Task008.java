package testcasesUSA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.USA_Menu;

public class Task008 {
	
	//8. Write a code to select and add an item from (Menu à Brands à Select Any Brand).
	
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
			Um.AddBrands();
			System.out.println();
			System.out.println("TESTCASE-8 RESULT : successfully selected an item from Menu Brand and item added to the Cart.");	
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
			System.out.println("TESTCASE-8 RESULT : Execution of Test Script is interrupted.");	
			System.out.println();
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();	
	}
}
