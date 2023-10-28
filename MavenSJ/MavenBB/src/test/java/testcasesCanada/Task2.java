package testcasesCanada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2 {
	@Test
	public void url() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");

        String ExpURL =  "https://www.bestbuy.com/";
        System.out.println("Expected URL : "+ ExpURL);
        String ActURL = driver.getCurrentUrl();
        System.out.println("Actual URL : "+ ActURL);
        
        if(ActURL.equals(ExpURL)){
            System.out.println("URL is stable and not broken");
        }
        else{
            System.out.println("Url is broken and not stable");
        }
        System.out.println();
	}
	

}
