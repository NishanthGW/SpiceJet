package testcasesCanada;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.HomePage;

public class Task5 {
	
	//Task5 : Validating Bottom links in Home Page
	
	@Test
	public void HomeLinks() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		
		HomePage P1 = new HomePage(driver);
		P1.canada();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement li:links) {
			System.out.println(li.getText());
		}
		
	}

}
