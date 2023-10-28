package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
	
	WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//div[text()='Login']")
	public static WebElement Login;
	
	//Mobile Number Login
	@FindBy(xpath="//div[text()='Mobile Number']")
	public static WebElement MobileNumber;
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	public static WebElement MbNumber;
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	public static WebElement Mbpassword;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-utggzx r-1otgn73']")
	public static WebElement ShowPass;
	@FindBy(xpath="//div[text()='Forgot Password ?']")
	public static WebElement MbForgetPassword;
	@FindBy(xpath="//div[@data-testid='login-cta']")
	public static WebElement MbLogin;
	
	//Email Login
	@FindBy(xpath="//div[text()='Email']")
	public static WebElement Email;
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	public static WebElement EmID;
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	public static WebElement Empassword;
	@FindBy(xpath="//div[text()='Forgot Password ?']")
	public static WebElement EmForgetPassword;
	@FindBy(xpath="//div[@data-testid='login-cta']")
	public static WebElement EmLogin;
	
	//Other Login
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1wtj0ep r-ku1wi2 r-1sp51qo r-62p4ah'])[1]")
	public static WebElement TravelAgent;
	@FindBy(xpath="//descendant::div[@class='css-1dbjc4n r-zso239'][2]")
	public static WebElement SUbAgent;
	@FindBy(xpath="//descendant::div[@class='css-1dbjc4n r-zso239'][3]")
	public static WebElement CorporateAccount;
	@FindBy(xpath="//descendant::div[@class='css-1dbjc4n r-zso239'][4]")
	public static WebElement SMETravellers;

	@FindBy(xpath="//div[text()='Invalid Username/Password']")
	public static WebElement Invalid;

	public void EmailLI() throws InterruptedException, IOException {
		System.out.println("EmailLI Method initiated");
		try{
			Login.click();
			Thread.sleep(8000);
			Email.click();
			Thread.sleep(8000);
			EmID.sendKeys("godwinnishan@gmail.com");
			Thread.sleep(8000);
			ShowPass.click();
			Thread.sleep(8000);
			Empassword.sendKeys("Ncgusa#1237");
			Thread.sleep(8000);
			EmLogin.click();
			Thread.sleep(5000);
			if(Invalid.isDisplayed()){
				LogInPage LiP = new LogInPage(driver);
				LiP.SSTC003();
				System.out.println("TESTCASE-3 RESULT : Email Login functionality option working as expected");
			}
			else{
				LogInPage LiP = new LogInPage(driver);
				LiP.SSTC003();
				System.out.println("TESTCASE-3 RESULT : Email Login functionality not working as expected");
			}			
		}
		catch(Exception e){
			LogInPage LiP1 = new LogInPage(driver);
			LiP1.SSTC003();
			System.out.println("TESTCASE-3 RESULT : Test Script running interrupted");
		}
	}
	public void MobilelLI() throws InterruptedException, IOException {
		System.out.println("MobilelLI Method initiated");
		try{
			driver.navigate().to("https://www.spicejet.com/");
			Login.click();
			Thread.sleep(8000);
			MobileNumber.click();
			Thread.sleep(8000);
			MbNumber.sendKeys("7722366982");
			Thread.sleep(8000);
			Mbpassword.sendKeys("Ncgusa#1237");
			Thread.sleep(8000);
			MbLogin.click();
			Thread.sleep(4000);
			if(Invalid.isDisplayed()){
				LogInPage LiP = new LogInPage(driver);
				LiP.SSTC003();
				System.out.println("TESTCASE-3 RESULT : Mobile Login functionality working as expected");
			}
			else{
				LogInPage LiP = new LogInPage(driver);
				LiP.SSTC003();
				System.out.println("TESTCASE-3 RESULT : Mobile Login functionality not working as expected");
			}
		}
		catch(Exception e){
			LogInPage LiP1 = new LogInPage(driver);
			LiP1.SSTC003();
			System.out.println("TESTCASE-3 RESULT : Test Script running interrupted");
		}
	}
	public void OtherLI() throws InterruptedException {
		System.out.println("OtherLI Method initiated");
		try{
			Login.click();
			Thread.sleep(8000);
			String LoginURL = driver.getCurrentUrl();
			System.out.println(LoginURL);
		}
		catch(Exception e){
			System.out.println("Already in Log in Page");
			String LoginURL = driver.getCurrentUrl();
			System.out.println(LoginURL);
		}
		System.out.println();
		Thread.sleep(6000);
		TravelAgent.click();
		Thread.sleep(6000);
		System.out.println("TravelAgent");
		Set<String> URL = driver.getWindowHandles();
		for(String w:URL) {
			System.out.println(w);
			System.out.println(driver.getTitle());
			System.out.println();
			driver.switchTo().window(w);
			if(w.equals("EA3C9E58E17E4B9150CDB9612F012711")){
//				driver.switchTo().window(w).close();
			}
		}
		System.out.println();
		Thread.sleep(6000);
//		driver.close();
//		Thread.sleep(6000);
		driver.getWindowHandle();
		System.out.println("window handle obtained");
//		Thread.sleep(6000);
		driver.navigate().to("https://www.spicejet.com/");
		SUbAgent.click();
//		driver.navigate().back();
//		CorporateAccount.click();
//		driver.navigate().back();
//		SMETravellers.click();
//		driver.navigate().back();
	}
	
	public void SSTC003() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenSJ\\ScreenShots\\SSTC003_";
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
	}
}
