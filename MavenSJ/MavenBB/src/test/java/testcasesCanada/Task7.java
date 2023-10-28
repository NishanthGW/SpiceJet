package testcasesCanada;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;


import pages.HomePage;
import pages.USA_Menu;

public class Task7 {
	
	//10. Write code to verify that the order was placed successfully by checking the resulting web page for the order confirmation message.
	//11. Write code to close the web browser when testing is complete.
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
//		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
//		driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		HomePage P1 = new HomePage(driver);
		P1.usa();
	}
	
	@Test
	public void BrandsCart() throws InterruptedException, IOException {
		USA_Menu Um = new USA_Menu(driver);
		Um.AddAudio();
		Um.Checkout();
		HomePage HP = new HomePage(driver);
		HP.OrderStatus();
		System.out.println();
		System.out.println("Task7 RESULT : successfully navigated to the checkout page.");	
		System.out.println();
		
	}
}
