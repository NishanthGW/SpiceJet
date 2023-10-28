package pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}	

	@FindBy(xpath="//div[text()='Signup']")
	public static WebElement Signup;
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	public static WebElement Title;	
	@FindBy(xpath="//input[@id='first_name']")
	public static WebElement FirstName;
	@FindBy(xpath="//input[@id='last_name']")
	public static WebElement LastName;
	@FindBy(xpath="//select[@class='form-control form-select']")
	public static WebElement County;
	@FindBy(xpath="//input[@id='dobDate']")
	public static WebElement DateofBirth;
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	public static WebElement Year;
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	public static WebElement Month;
	@FindBy(xpath="//div[text()='14']")
	public static WebElement Day;
	@FindBy(xpath="//input[@class=' form-control']")
	public static WebElement MobileNumber;
	@FindBy(xpath="//input[@id='email_id']")
	public static WebElement EmailID;
	@FindBy(xpath="//input[@id='new-password']")
	public static WebElement Password;
	@FindBy(xpath="//img[@class='icon-active'][1]")
	public static WebElement Show1;
	@FindBy(xpath="//input[@id='c-password']")
	public static WebElement ConfirmPassword;
	@FindBy(xpath="//img[@class='icon-active']")
	public static WebElement Show2;
	@FindBy(xpath="//input[@id='defaultCheck1']")
	public static WebElement Agree;
	@FindBy(xpath="//button[text()='Submit']")
	public static WebElement SubmitSU;
	@FindBy(xpath="//a[text()='Log In']")
	public static WebElement LoginIfAlreadyMem;

	@FindBy(xpath="//label[text()='OTP Verification']")
	public static WebElement OTP;
	
	

//	@FindBy(xpath="")
//	public static WebElement ;
//	@FindBy(xpath="")
//	public static WebElement ;
	
	//div[text()='Login']
	
	public void Setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}
	
	public void signup() throws InterruptedException, IOException {
		Signup.click();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		for(String w:windows) {
			String Title = driver.switchTo().window(w).getTitle();
			System.out.println("Title of the window : "+ Title);
			System.out.println("ID of the window : "+w);
			String SigninPageTitle = "SpiceClub - The frequent flyer program of SpiceJet";
			if(Title.equals(SigninPageTitle)) {
				break;
			}
			System.out.println();
		}
		System.out.println();
		
		Title.click();
		Select TitleDD = new Select(Title);
		TitleDD.selectByVisibleText("Mr");
		FirstName.sendKeys("Captain");
		LastName.sendKeys("Steve");
		
		County.click();
		Select CountyDD = new Select(County);
		CountyDD.selectByVisibleText("India");
		
		DateofBirth.click();
		Year.click();		
		Select YearDD = new Select(Year);
		YearDD.selectByVisibleText("1990");
		Month.click();		
		Select MonthDD = new Select(Month);
		MonthDD.selectByVisibleText("June");
		Day.click();
		
		MobileNumber.sendKeys("8838898598");
		Thread.sleep(5000);
		EmailID.click();
		Thread.sleep(5000);
		try{
			EmailID.sendKeys("greatking@gmail.com");
			Thread.sleep(6000);
		}
		catch(Exception e){
//			System.out.println("Unable to enter the text in Email field at first attempt");
			EmailID.sendKeys("stoger2680@gmail.com");
			Thread.sleep(6000);
			System.out.println("Successfully entered the text in Email field");
			System.out.println();
		}
		Password.click();
		Thread.sleep(6000);
		Password.sendKeys("Ncgusa#1237");
		Thread.sleep(6000);
		Show1.click();
		Thread.sleep(6000);
		ConfirmPassword.sendKeys("Ncgusa#1237");
		Thread.sleep(6000);
		Show2.click();
		Thread.sleep(10000);		
		try{
			Agree.click();
			Thread.sleep(10000);
		}
		catch(Exception e){
//			System.out.println("Unable to check the Checkbox at first click");
			Agree.click();
			Thread.sleep(10000);
			System.out.println("Successfully Checked the Checkbox");
			System.out.println();
		}
		Thread.sleep(10000);
		try{
			SubmitSU.click();
			Thread.sleep(10000);
		}
		catch(Exception e){
//			System.out.println("Unable to click submit button at first time");
			SubmitSU.click();
			Thread.sleep(10000);
			System.out.println("Successfully clicked the submit button");
			System.out.println();
		}
		SignUpPage SuP = new SignUpPage(driver);
		SuP.SSTC002();
		if(OTP.isDisplayed()){
			System.out.println("PASS: signup function working as expected.");
		}
		else{
			System.out.println("FAIL: signup function not working as expected");
		}		
	}
		public void login() throws InterruptedException {
//			driver.close();
//			driver.switchTo().window("957A7068B42C1DC0A32A33A893C9D362");
			
	}
		
		public void SSTC002() throws IOException{
			String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenSJ\\ScreenShots\\SSTC002_";
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
