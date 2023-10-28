package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BestBuyHome {
	WebDriver driver;
	
	public BestBuyHome (WebDriver driver) {
		this.driver=driver;
	}
	
	public void HomePage(){
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
        System.out.println("Web Browser opened and navigated to bestbuy website Successfully");
        System.out.println();
	}
	
	
	public void Screenshot() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SShot";
		int Num = (int)(Math.random()*9999);
		if( Num <= 1000 ) { Num = Num + 1000;
		
		}
		String SSPath = Path11+Num+".png";
		System.out.println(SSPath);
		TakesScreenshot Scrshot = (TakesScreenshot)driver;
		File Sourcefile = Scrshot.getScreenshotAs(OutputType.FILE);
		File fileDest = new File(SSPath);
		FileHandler.copy(Sourcefile, fileDest);
	}
}
