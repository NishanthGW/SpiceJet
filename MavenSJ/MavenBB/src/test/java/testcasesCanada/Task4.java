package testcasesCanada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Canada;
import pages.HomePage;

public class Task4 {
	
	//Task4 : validation of title in each Menu page
	
	@Test
	public void ShopMenu() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		
		HomePage P1 = new HomePage(driver);
		P1.canada();
		
		Canada P2 = new Canada(driver);
		System.out.println("Shop Menu : ");
		P2.shop();
		driver.navigate().to("https://www.bestbuy.ca/en-ca?intlreferer=&intlredir=https://www.bestbuy.com/");

		System.out.println("UltimateApplianceEvent Menu : ");
		P2.UltimateApplianceEvent();
		driver.navigate().to("https://www.bestbuy.ca/en-ca?intlreferer=&intlredir=https://www.bestbuy.com/");
		
		System.out.println("Deal Menu : ");
		P2.Deal();
		
		System.out.println("Menus in the home page working properly.");
		
		driver.close();
		
	}


}
