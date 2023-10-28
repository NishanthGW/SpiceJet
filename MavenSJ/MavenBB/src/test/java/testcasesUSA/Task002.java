package testcasesUSA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class Task002 {
	
	//Task002 - Validation of URL link
	//2. Write a code to validate if the given URL Link is broken
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test
	public void URL() throws InterruptedException, IOException {
		try{
			driver.get("https://www.bestbuy.com/");
	        HomePage HP = new HomePage(driver);
		        String ExpURL001 =  "https://www.bestbuy.com/";
		        String ActURL001 = driver.getCurrentUrl();
		        System.out.println("Expected URL : "+ ExpURL001);
		        System.out.println("Actual URL : "+ ActURL001);
		        if(ActURL001.equals(ExpURL001)){
			        HP.SSTC002();		        	
			        System.out.println();	        
			        System.out.println("TESTCASE-2 RESULT: URL is stable and not broken.");
			        System.out.println();
	        }
	        else{
		        HP.SSTC002();
		        System.out.println();
		        System.out.println("TESTCASE-2 RESULT: URL is broken and not stable.");
		        System.out.println();
	        }
		}
		catch(Exception e){
	        HomePage HP = new HomePage(driver);
	        HP.SSTC001();
			System.out.println("TESTCASE-2 RESULT : Execution of Test Script is interrupted.");
		}
	}
	
	@AfterTest
	public void END() {
		driver.close();		
	}
}
