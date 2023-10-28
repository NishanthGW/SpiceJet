package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USA_Account {
	WebDriver driver;
	
	public USA_Account (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	String HomePage = "https://www.bestbuy.com/?intl=nosplash";

	@FindBy(xpath="//button[text()='No, Thanks']")
	public static WebElement NoThanks1;
	
	@FindBy(xpath="//span[text()='Account']")
	public static WebElement Acc;
	
	@FindBy(xpath="//a[text()='Sign In']")
	public static WebElement SignIn;
	@FindBy(xpath="//input[@id='fld-e']")
	public static WebElement email;
	@FindBy(xpath="//input[@id='fld-p1']")
	public static WebElement pwd;
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	public static WebElement show;
	@FindBy(xpath="//button[text()='Sign In']")
	public static WebElement Submit;
	
	@FindBy(xpath="//button[@class='c-button c-button-outline c-button-lg c-button-block c-button-icon c-button-icon-leading svg-button webauthn-button']")
	public static WebElement Passkey;	
	@FindBy(xpath="//button[@class='c-button c-button-outline c-button-lg c-button-block c-button-icon c-button-icon-leading svg-button social-button apple-button  font-weight-normal']")
	public static WebElement Apple;
	@FindBy(xpath="//div[@id='google-button']")
	public static WebElement Google;
	
	@FindBy(xpath="//a[text()='Create Account']")
	public static WebElement create;
	@FindBy(xpath="//input[@id='firstName']")
	public static WebElement FirstName;
	@FindBy(xpath="//input[@id='lastName']")
	public static WebElement LastName;
	@FindBy(xpath="//input[@id='email']")
	public static WebElement Email;
	@FindBy(xpath="//input[@id='fld-p1']")
	public static WebElement NewPass;
	@FindBy(xpath="//input[@id='reenterPassword']")
	public static WebElement RePass;
	@FindBy(xpath="//input[@id='phone']")
	public static WebElement phone;
	@FindBy(xpath="//input[@id='is-recovery-phone']")
	public static WebElement Check;
	@FindBy(xpath="//button[text()='Create an Account']")
	public static WebElement CrAcc;
	@FindBy(xpath="//div[@class='google-container']")
	public static WebElement Goo;

	@FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
	public static WebElement SWWrong1;
	
	@FindBy(xpath="//div[@class='c-alert c-alert-v2 flex rounded-100 v-bg-pure-white w-full border-solid body-copy-lg c-alert-error border-error cia-alert']")
	public static WebElement resultbox;	

	String Path = "C:\\Users\\godwi\\OneDrive\\Desktop\\Software Testing\\ScreenShots\\SShot1.png";
	
	public void SignInNegative(String Email, String Pass) throws InterruptedException, IOException {
		System.out.println("SignInNegative Method Initiated.");
		try{
			driver.navigate().to(HomePage);
			try{
				Thread.sleep(1000);
				Acc.click();
				Thread.sleep(1000);
			}
			catch(Exception e){
				NoThanks1.click();
				Acc.click();
				Thread.sleep(1000);
			}
//			String ActSignInHomePage = driver.getTitle();
//			System.out.println("Actual Sign in page title : "+ActSignInHomePage);
			SignIn.click();
			Thread.sleep(5000);
			email.sendKeys(Email);
			Thread.sleep(5000);
			show.click();	
			Thread.sleep(5000);
			pwd.sendKeys(Pass);
			Thread.sleep(5000);
			Submit.click();
			Thread.sleep(12000);
			USA_Account USAa = new USA_Account(driver);
			USAa.SSTC003();
			if(SWWrong1.isDisplayed()){
				System.out.println("PASS : LogIn fuctionality with SignInNegative1 Method worked as expected with Negative Datas.");
				System.out.println();	
			}
			else{
				System.out.println("FAIL : LogIn fuctionality with SignInNegative1 Method worked as expected with Negative Datas.");
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted .");
			System.out.println();
		}
	}
	
	public void SignInNegative1() throws InterruptedException, IOException {
		System.out.println("SignInNegative1 Method Initiated.");
		try{
			driver.navigate().to(HomePage);
			Thread.sleep(1000);
			try{
				Thread.sleep(1000);
				Acc.click();
				Thread.sleep(1000);
			}
			catch(Exception e){
				NoThanks1.click();
				Acc.click();
				Thread.sleep(1000);
			}
//			String ActSignInHomePage = driver.getTitle();
//			System.out.println("Actual Sign in page title : "+ActSignInHomePage);
			SignIn.click();
			email.sendKeys("asfg@mail.com");
			show.click();	
			pwd.sendKeys("qwerty@1234");
			Submit.click();
			Thread.sleep(8000);
			USA_Account USAa = new USA_Account(driver);
			USAa.SSTC003();
			if(SWWrong1.isDisplayed()){
				System.out.println("PASS : LogIn fuctionality with SignInNegative1 Method worked as expected with Negative Datas.");
				System.out.println();		
			}
			else{
				System.out.println("FAIL : LogIn fuctionality with SignInNegative1 Method worked as expected with Negative Datas.");
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}		
	}
	
	public void SignInNegative2() throws InterruptedException, IOException {
		System.out.println("SignInNegative2 Method Initiated.");
		try{
			driver.navigate().to(HomePage);
			Thread.sleep(1000);
			try{
				Thread.sleep(1000);
				Acc.click();
				Thread.sleep(1000);
			}
			catch(Exception e){
				NoThanks1.click();
				Acc.click();
				Thread.sleep(1000);
			}
			SignIn.click();
			email.sendKeys("knasdi@mail.com");
			show.click();	
			pwd.sendKeys("ksyd9@589");
			Submit.click();
			Thread.sleep(8000);
			USA_Account USAaa = new USA_Account(driver);
			USAaa.SSTC003();
			if(SWWrong1.isDisplayed()){
				System.out.println("PASS : LogIn fuctionality with SignInNegative1 Method worked as expected with Negative Datas.");
				System.out.println();	
			}
			else{
				System.out.println("FAIL : LogIn fuctionality with SignInNegative1 Method worked as expected with Negative Datas.");
				System.out.println();
			}
			System.out.println("LogIn fuctionality with SignInNegative2 Method worked as expected with Negative Datas.");
			System.out.println(); 
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}   
	}
	
	public void SignInPositive(String Email1, String Pass1) throws InterruptedException, IOException {
		System.out.println("SignInPositive Method Initiated.");
		try{
			driver.navigate().to(HomePage);
			Thread.sleep(1000);
			try{
				Thread.sleep(1000);
				Acc.click();
				Thread.sleep(1000);
			}
			catch(Exception e){
				NoThanks1.click();
				Acc.click();
				Thread.sleep(1000);
			}
//			String ActSignInHomePage = driver.getTitle();
//			System.out.println("Actual Sign in page title : "+ActSignInHomePage);
			SignIn.click();
			Thread.sleep(5000);		
			email.sendKeys(Email1);
			Thread.sleep(5000);		
			show.click();
			Thread.sleep(5000);
			pwd.sendKeys(Pass1);
			Thread.sleep(5000);
			Submit.click();
			Thread.sleep(15000);
			USA_Account USAa = new USA_Account(driver);
			USAa.SSTC003();
			if(SWWrong1.isDisplayed()){
				System.out.println("PASS : LogIn fuctionality with SignInPositive Method worked as expected.");
				System.out.println();	
			}
			else{
				System.out.println("FAIL : LogIn fuctionality with SignInPositive Method not worked as expected.");
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}
	}
	
	public void AccOtherOpts() throws InterruptedException, IOException {
		System.out.println("AccOtherOpts Method Initiated.");
		driver.navigate().to(HomePage);
		try{
			Acc.click();
			Thread.sleep(10000);
		}
		catch(Exception e){
			NoThanks1.click();
			Acc.click();
			Thread.sleep(7000);
		}
		SignIn.click();
		Passkey.click();
		Thread.sleep(8000);
		USA_Account USAa = new USA_Account(driver);
		USAa.SSTC003();
		System.out.println("Successfully navigated to Passkey webpage");
		driver.navigate().to(HomePage);
		try{
			Acc.click();
			Thread.sleep(10000);
		}
		catch(Exception e){
			NoThanks1.click();
			Acc.click();
			Thread.sleep(10000);
		}		
		SignIn.click();
		Thread.sleep(1000);
		Apple.click();
		Thread.sleep(8000);
		USAa.SSTC003();
		System.out.println("Successfully navigated to Apple signIn webpage");
		driver.navigate().to(HomePage);
		Thread.sleep(1000);
		try{
			Thread.sleep(1000);
			Acc.click();
			Thread.sleep(1000);
		}
		catch(Exception e){
			NoThanks1.click();
			Acc.click();
			Thread.sleep(1000);
		}
		SignIn.click();
		Thread.sleep(10000);
		try {
			Google.click();
			Thread.sleep(8000);
			USAa.SSTC003();
			System.out.println("Successfully navigated to Google signIn webpage");
		}
		catch(Exception e) {
			System.out.println("Unable to navigate to google page");
		}
	}
	
	public void CreateAccount() throws InterruptedException, IOException {
		System.out.println("CreateAccount Method Initiated.");
		try{
			driver.navigate().to(HomePage);
			Thread.sleep(1000);
			try{
				Thread.sleep(1000);
				Acc.click();
				Thread.sleep(1000);
			}
			catch(Exception e){
				NoThanks1.click();
				Acc.click();
				Thread.sleep(1000);
			}
			create.click();
			Thread.sleep(3000);
			FirstName.sendKeys("Stephen");
			Thread.sleep(3000);
			LastName.sendKeys("Fleming");
			Thread.sleep(3000);
			Email.sendKeys("knasdi@gmail.com");
			Thread.sleep(3000);
			NewPass.sendKeys("Luffy&Zoro@123");
			Thread.sleep(3000);
			RePass.sendKeys("Luffy&Zoro@123");
			Thread.sleep(3000);
			phone.sendKeys("9874563210");
			Thread.sleep(3000);
			Check.click();
			Thread.sleep(3000);
			CrAcc.click();
			Thread.sleep(8000);
			USA_Account USAa = new USA_Account(driver);
			USAa.SSTC003();
			if(SWWrong1.isDisplayed()){
				System.out.println("PASS : Sign-Up fuctionality with CreateAccount Method working as expected.");
				System.out.println();	
			}
			else{
				System.out.println("FAIL : Sign-Up fuctionality with CreateAccount Method not working as expected.");
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}
//		try{
//			Goo.click();
//			System.out.println("Successfully navigated to Google create account page");
//		}
//		catch(Exception e){
//			System.out.println("Unable to click google pages");
//		}
//		Thread.sleep(5000);
	}	
	
	public void SSTC003() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC003_";
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
