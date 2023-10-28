package testcasesCanada;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.BestBuyHome;
//import pages.Canada;
import pages.HomePage;
//import pages.USA_Account;

public class Task6 {
	
	//Task 6 : search and add an item to the shopping cart.
	
	@Test
	public void HomeLinks() throws InterruptedException, IOException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		
		HomePage P1 = new HomePage(driver);
		P1.usa();
		BestBuyHome BBH = new BestBuyHome(driver);
		BBH.Screenshot();
//		USA_Account Pusa = new USA_Account(driver);
//		Pusa.Menu();
		
//		Canada P2 = new Canada(driver);
//		P2.Search();
		
		
	}

}
