package testcasesUSA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.USA_Menu;

public class Task007 {
	
	//7. Write a code to select and add an item from (Menu à Shop by Department).
	
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
	public void ShopByDepartment() throws InterruptedException {
		try{
			USA_Menu Um = new USA_Menu(driver);
			Um.menu();
			Um.AddAppliances();
			Um.AddAudio();
			System.out.println();
			System.out.println("TESTCASE-7 RESULT : successfully selected an item from Menu Shop by Department and item added to the Cart.");	
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
			System.out.println("TESTCASE-7 RESULT : Execution of Test Script is interrupted.");	
			System.out.println();
		}		
	}
	
	@AfterTest
	public void END() {
		driver.close();	
	}	
	
}
