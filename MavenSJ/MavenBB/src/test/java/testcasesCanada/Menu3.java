package testcasesCanada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Canada;
import pages.HomePage;

public class Menu3 {
	@Test
	public void DealMenu() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		
		HomePage P1 = new HomePage(driver);
		P1.canada();
		
		Canada P2 = new Canada(driver);
		P2.Deal();
		
//		driver.close();
	}

}
