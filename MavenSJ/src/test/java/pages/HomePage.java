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
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()='one way']")
	public static WebElement OneWay;

	@FindBy(xpath="//div[text()='round trip']")
	public static WebElement RoundTrip;
	
	@FindBy(xpath="//div[@data-testid='to-testID-origin']")
	public static WebElement From;
	@FindBy(xpath="//div[text()='Pandit Deen Dayal Upadhyay Airport']")
	public static WebElement Agra;
	@FindBy(xpath="//div[text()='Kempegowda International Airport']")
	public static WebElement Bengaluru;	
	@FindBy(xpath="//div[@data-testid='to-testID-flip-arrow']")
	public static WebElement DirChanger;
	@FindBy(xpath="//div[@data-testid='to-testID-destination']")
	public static WebElement Destination;
	@FindBy(xpath="//div[text()='Jaipur International Airport']")
	public static WebElement Jaipur;
	@FindBy(xpath="//div[text()='Chhatrapati Shivaji International Airport']")
	public static WebElement Mumbai;	
	@FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
	public static WebElement DepartDate;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-19bllq0 r-u8s1d r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")
	public static WebElement Previouse;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")
	public static WebElement Next;
	@FindBy(xpath="//descendant::div[@data-testid='undefined-calendar-day-24'][3]")
	public static WebElement DayDepart;
	
	
	@FindBy(xpath="//div[@data-testid='return-date-dropdown-label-test-id']")	
	public static WebElement ReturnDate;
	@FindBy(xpath="//descendant::div[@data-testid='undefined-calendar-day-30'][3]")
	public static WebElement DayRet;
	
	
	@FindBy(xpath="//div[text()='Passengers']")
	public static WebElement Passengers;
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	public static WebElement AdultPlus;
	@FindBy(xpath="//div[@data-testid='Adult-testID-minus-one-cta']")
	public static WebElement AdultMinus;
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	public static WebElement ChildrenPlus;
	@FindBy(xpath="//div[@data-testid='Children-testID-minus-one-cta']")
	public static WebElement ChildrenMinus;
	@FindBy(xpath="//div[@data-testid='Infant-testID-plus-one-cta']")
	public static WebElement InfantPlus;
	@FindBy(xpath="//div[@data-testid='Infant-testID-minus-one-cta']")
	public static WebElement InfantMinus;
	@FindBy(xpath="//div[@data-testid='home-page-travellers-done-cta']")
	public static WebElement Done;
	
	@FindBy(xpath="//div[text()='Currency']")
	public static WebElement Currency;
	@FindBy(xpath="//descendant::div[text()='INR'][2]")	
	public static WebElement INR;
	
	@FindBy(xpath="//div[text()='Family & Friends']")
	public static WebElement FamilyFriends;
	@FindBy(xpath="//a[text()='Senior Citizen']")
	public static WebElement SeniorCitizen;
	@FindBy(xpath="//div[text()='Unaccompanied Minor']")
	public static WebElement UnaccompaniedMinor;
	@FindBy(xpath="//div[text()='Students']")
	public static WebElement Students;
	@FindBy(xpath="//div[text()='Armed Forces']")
	public static WebElement ArmedForces;
	@FindBy(xpath="//div[text()='Govt. Employee']")
	public static WebElement GovtEmployee;
	@FindBy(xpath="//div[text()='Special Assistance']")
	public static WebElement SpecialAssistance;
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	public static WebElement SearchFlight;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[2]")
	public static WebElement Agree;
	@FindBy(xpath="(//div[text()='Continue'])[1]")
	public static WebElement Continue;
	
	public void OneWay() throws InterruptedException {
		System.out.println("OneWay Method Initiated");
		OneWay.click();
		Thread.sleep(6000);
		System.out.println("OneWay");
		From.click();
		System.out.println("From");
		Bengaluru.click();
//		From.sendKeys("Agr");
		Thread.sleep(6000);
		System.out.println("Bengaluru");
//		Destination.click();
//		Thread.sleep(6000);
		Destination.click();
		Thread.sleep(6000);
		Mumbai.click();
//		Destination.sendKeys("Kolkata");
		Thread.sleep(6000);
		System.out.println("Mumbai");
//		DepartDate.click();
		Thread.sleep(6000);
		System.out.println("DepartDate");
		DayDepart.click();
		Thread.sleep(6000);
		System.out.println("Day");
		Passengers.click();
		AdultPlus.click();
		AdultPlus.click();
		AdultMinus.click();
		ChildrenPlus.click();
		ChildrenMinus.click();
		InfantPlus.click();
		InfantMinus.click();
		Thread.sleep(6000);
		Done.click();
		Thread.sleep(6000);
		System.out.println("Passengers");
		Currency.click();
		Thread.sleep(6000);
		INR.click();
		Thread.sleep(6000);
		System.out.println("Currency");
		FamilyFriends.click();
		Thread.sleep(6000);
		FamilyFriends.click();
		Thread.sleep(6000);
		System.out.println("FamilyFriends");
		
		SearchFlight.click();
		Thread.sleep(6000);
		System.out.println("SearchFlight");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = ("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		System.out.println(ActualTitle);
		System.out.println(ExpectedTitle);
		System.out.println();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
//		try{	
//			Agree.click();
//			Thread.sleep(6000);
//			System.out.println("Agree");
//			Thread.sleep(8000);
//		}
//		catch(Exception e){
//			System.out.println("Agree option not presentat this time");
//		}
//	
//		Continue.click();
//		Thread.sleep(10000);
//		System.out.println("Continue");
	}
	
	public void RoundTrip() throws InterruptedException {
		System.out.println("RoundTrip Method Initiated");
		driver.navigate().to("https://www.spicejet.com/");
		System.out.println("Navigated to home page.");
		Thread.sleep(10000);		
		RoundTrip.click();
		Thread.sleep(6000);
		System.out.println("RoundTrip");
		From.click();
		System.out.println("From");
		Bengaluru.click();
//		From.sendKeys("Agr");
		Thread.sleep(6000);
		System.out.println("Bengaluru");
//		Destination.click();
//		Thread.sleep(6000);
		Destination.click();
		Thread.sleep(6000);
		Mumbai.click();
//		Destination.sendKeys("Kolkata");
		Thread.sleep(6000);
		System.out.println("Mumbai");
//		DepartDate.click();
		Thread.sleep(6000);
		System.out.println("DepartDate");
		DayDepart.click();
		Thread.sleep(6000);
		System.out.println("DayDepart");
//		ReturnDate.click();
		Thread.sleep(6000);
		DayRet.click();
		System.out.println("DayRet");
		Passengers.click();
		AdultPlus.click();
//		AdultPlus.click();
		AdultPlus.click();
		AdultMinus.click();
		ChildrenPlus.click();
		ChildrenMinus.click();
		InfantPlus.click();
		InfantMinus.click();
		Thread.sleep(6000);
		Done.click();
		Thread.sleep(6000);
		System.out.println("Passengers");
		Currency.click();
		Thread.sleep(6000);
		INR.click();
		Thread.sleep(6000);
		System.out.println("Currency");
		FamilyFriends.click();
		Thread.sleep(6000);
		FamilyFriends.click();
		Thread.sleep(6000);
		System.out.println("FamilyFriends");
		SearchFlight.click();
		Thread.sleep(6000);
		System.out.println("SearchFlight");

//		try{
//			Agree.click();
//			Thread.sleep(6000);
//			System.out.println("Agree");
//			Thread.sleep(8000);
//		}
//			catch(Exception e){
//				System.out.println("Agree option not present in this time.");
//				Thread.sleep(8000);
//				Continue.click();
//				Thread.sleep(10000);
//				System.out.println("Continue");
//			}
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = ("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		System.out.println(ActualTitle);
		System.out.println(ExpectedTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	public void SSTC004() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenSJ\\ScreenShots\\SSTC004_";
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
