package testcasesUSA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class Task001 {
	
	//Task 001 - opening the Bestbuy Website in Browser.
	//1. Write code to open a web browser and navigate to the Best Buy e-commerce website.
	
	WebDriver driver;
	
	@BeforeTest
	public void SETUP() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	
	@Test
	public void URL() throws InterruptedException, IOException {
		try{
			driver.get("https://www.bestbuy.com/");
	        HomePage HP = new HomePage(driver);
	        HP.usa();
		        String ExpURL001 =  "https://www.bestbuy.com/?intl=nosplash";
		        String ActURL001 = driver.getCurrentUrl();
		        System.out.println("Expected URL : "+ ExpURL001);
		        System.out.println("Actual URL : "+ ActURL001);
		        if(ActURL001.equals(ExpURL001)){
			        HP.SSTC001();		        	
			        System.out.println();	        
			        System.out.println("TESTCASE-1 RESULT : Web Browser opened and navigated to bestbuy website Successfully.");
			        System.out.println();
	        }
	        else{
		        HP.SSTC001();
		        System.out.println();
		        System.out.println("TESTCASE-1 RESULT : Opening the Browser and navigated to bestbuy website was interrupted.");
		        System.out.println();
	        }
		}
		catch(Exception e){
	        HomePage HP = new HomePage(driver);
	        HP.SSTC001();
			System.out.println("TESTCASE-1 RESULT : Execution of Test Script is interrupted.");
		}
	}
	
	@AfterTest
	public void END() {
		driver.close();	
	}

}
