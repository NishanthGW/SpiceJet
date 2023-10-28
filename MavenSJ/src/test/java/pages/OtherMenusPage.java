package pages;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherMenusPage {
	
	WebDriver driver;
	
	public OtherMenusPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}	
	
//	Check-In
	@FindBy(xpath="//div[text()='check-in']")
	public static WebElement checkin;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	public static WebElement TicketNumber;
//	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj r-12kfsgm'])[2]")
//	@FindBy (xpath="(//descendant::div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj r-12kfsgm'])[2])")

	@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com']")
	public static WebElement EmailIDCI;
	@FindBy(xpath="//div[text()='Search Booking']")
	public static WebElement SearchBooking;
	
//	FlightStatus
	@FindBy(xpath="//div[text()='flight status']")
	public static WebElement FlightStatus;
	@FindBy(xpath="//div[text()='Departure Date']")
	public static WebElement DepartureDate;
	@FindBy(xpath="//div[text()='Yesterday']")
	public static WebElement Yesterday;
	@FindBy(xpath="//div[text()='Today']")
	public static WebElement Today;
	@FindBy(xpath="//div[text()='Tomorrow']")
	public static WebElement Tomorrow;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	public static WebElement From;
	@FindBy(xpath="//div[text()='Indira Gandhi International Airport']")
	public static WebElement Delhi;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	public static WebElement To;
	@FindBy(xpath="//div[text()='Netaji Subhash Chandra Bose International Airport']")
	public static WebElement Kolkata;
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-1i10wst r-1eimq0t r-mk0yit r-xfkzu9 r-lnhwgy']")
	public static WebElement FlightNumber;
	
	@FindBy(xpath="(//div[text()='Search Flights'])")
//	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	public static WebElement SearchFlights;
	
//	ManageBooking
	@FindBy(xpath="//div[text()='manage booking']")
	public static WebElement ManageBooking;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	public static WebElement TicketNumberMB;
//	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com / Doe']")
	public static WebElement EmailIDMB;
//	@FindBy(xpath="//div[text()='Search Booking']")
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	public static WebElement SearchBookingMB;
	@FindBy(xpath="//div[text()='View Change Assist']")
	public static WebElement ViewChangeAssist;
	
//	Flights
	@FindBy(xpath="//div[text()='Flights']")
	public static WebElement Flights;
	@FindBy(xpath="//div[text()='Book your Charter']")
	public static WebElement BookyourCharter;	
	
	public void Checkin() throws InterruptedException {
		checkin.click();
		Thread.sleep(5000);
		System.out.println("checkin");
//		JavascriptExecutor JSE = (JavascriptExecutor) driver;
//		JSE.executeScript("arguments[0].click();", TicketNumber);
//		Thread.sleep(5000);
//		JSE.executeScript("arguments[0].value='G5F8S3'", TicketNumber);
		TicketNumber.sendKeys("G5F8S3");
		Thread.sleep(5000);
		System.out.println("TicketNumber");

		try{
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("arguments[0].click();", EmailIDCI);
			JSE1.executeScript("arguments[0].value='Ronaldjiu1235@gmail.com'", EmailIDCI);
//			EmailIDCI.sendKeys("Ronaldjiu1235@gmail.com");
			Thread.sleep(5000);
			System.out.println("EmailIDCI");
		}
		catch(Exception e){
				System.out.println("FAIL : Unable to interact with EmailIDCI Element");				
		}
		Thread.sleep(5000);
		if(SearchBooking.isDisplayed()) {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("arguments[0].click();", SearchBooking);
			SearchBooking.click();
			Thread.sleep(8000);
			System.out.println("SearchBooking");	
		}
		else {
			System.out.println("SearchBooking Not present");
		}
	}
	
	public void Flightstatus() throws InterruptedException {
		FlightStatus.click();
		Thread.sleep(5000);
		System.out.println("FlightStatus");
		DepartureDate.click();
		Thread.sleep(5000);
		System.out.println("DepartureDate");
		Tomorrow.click();
		Thread.sleep(5000);
		System.out.println("Tomorrow");
		From.click();
		Thread.sleep(5000);
		System.out.println("From");
		Delhi.click();
		Thread.sleep(5000);
		System.out.println("Delhi");
		Kolkata.click();
		Thread.sleep(5000);
		System.out.println("Kolkata");
		FlightNumber.sendKeys("52366");
		Thread.sleep(5000);
		System.out.println("FlightNumber");
		try{
			Thread.sleep(5000);
			JavascriptExecutor JSE = (JavascriptExecutor) driver;
			JSE.executeScript("arguments[0].click();", SearchFlights);
			Thread.sleep(5000);
			System.out.println("SearchFlights");
		}
		catch(Exception e){
			System.out.println("SearchFlights element click intercepted:");			
			Thread.sleep(5000);
			SearchFlights.click();
			Thread.sleep(5000);
			System.out.println("SearchFlights");
		}		
	}	
	
	public void ManageBooking() throws InterruptedException {
		ManageBooking.click();
		Thread.sleep(4000);
		System.out.println("ManageBooking");
		TicketNumberMB.sendKeys("K6A6V6");
		Thread.sleep(4000);
		System.out.println("TicketNumberMB");

		JavascriptExecutor JSE2 = (JavascriptExecutor) driver;
		JSE2.executeScript("arguments[0].click();", EmailIDMB);
		JSE2.executeScript("arguments[0].value='Ronaldjiu1235@gmail.com'", EmailIDMB);
//		EmailIDMB.sendKeys("Ronaldjiu1235@gmail.com");
		System.out.println("EmailIDMB");
		SearchBookingMB.click();
		Thread.sleep(4000);
		System.out.println("");
	}	
	
	public void BookyourCharter() throws InterruptedException {
		Flights.click();
		Thread.sleep(4000);
		System.out.println("Flights");
		BookyourCharter.click();
		Thread.sleep(4000);
		System.out.println("BookyourCharter");
//		driver.quit();
	}	
	
	public void SSTC008() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenSJ\\ScreenShots\\SSTC008_";
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
