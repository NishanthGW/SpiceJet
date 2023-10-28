package testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase001 {
	
	//1. Set up a Selenium project in your preferred programming language (Java, Python, etc.).
	//2. Write code to open a web browser and navigate to the SpiceJet flight booking system
	
	WebDriver driver;
	
	@BeforeTest
	public void SetupOne() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void spicejet() throws IOException {
		String ExpectedURL = "https://www.spicejet.com/";
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenSJ\\ScreenShots\\SSTC001_";
		int Num = (int)(Math.random()*9999);
		if(Num <= 1000){
			Num = Num + 1000;
		}
		String SSPath = Path11+Num+".png";
		System.out.println("Screenshot Taken : "+SSPath);
		TakesScreenshot Scrshot = (TakesScreenshot)driver;
		File Sourcefile = Scrshot.getScreenshotAs(OutputType.FILE);
		File fileDest = new File(SSPath);
		FileHandler.copy(Sourcefile, fileDest);
		String ActualURL = driver.getCurrentUrl();
        System.out.println("Expected URL : "+ ExpectedURL);
        System.out.println("Actual URL : "+ ActualURL);
        Assert.assertEquals(ExpectedURL, ActualURL);
        System.out.println();
        System.out.println("TESTCASE-1 RESULT : Successfully set up a selenium project, opened a web browser and navigated to the spicejet website.");
        System.out.println();        
	}
	
	@AfterTest
    public void End(){
		driver.close();	        	
    }

}
