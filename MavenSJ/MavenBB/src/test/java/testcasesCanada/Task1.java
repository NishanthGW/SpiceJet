package testcasesCanada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import pages.HomePage;

public class Task1 {
	
	@Test
	public void URL() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
        
        System.out.println("Web Browser opened and navigated to bestbuy website Successfully.");
        System.out.println();
	}
}
