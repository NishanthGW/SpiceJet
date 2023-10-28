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
import org.testng.Assert;

public class BookingPage {
	
	WebDriver driver;
	
	public BookingPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	//Flights
	@FindBy(xpath="//div[@data-testid='spicesaver-flight-select-radio-button-0']")
	public static WebElement SpiceSaver;
	@FindBy(xpath="//div[@class='r-1awozwy r-1loqt21 r-13awgt0 r-1777fci r-6dt33c r-bnwqim r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu css-1dbjc4n']")
	public static WebElement SpiceFlex;
	@FindBy(xpath="(//div[@data-testid='spiceflex-flight-select-radio-button-1'])[1]")
	public static WebElement SpiceMax;
	@FindBy(xpath="//div[@data-testid='hold-now-search-page-desktop']")
	public static WebElement HoldFAreNow;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-1hi8f7o']")
	public static WebElement HoldFAreNowClose;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	public static WebElement ContinueFt;
	
	//Passengers	
	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
	public static WebElement TitleCP;
	@FindBy(xpath="//descendant::div[text()='Mr'][2]")
	public static WebElement MrCP;	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	public static WebElement FirstMiddleCP;
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	public static WebElement LastCP;
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	public static WebElement ContNumberCP;
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	public static WebElement EmailCP;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu']")
	public static WebElement CountryCP;
	@FindBy(xpath="//div[text()='India']")
	public static WebElement IndiaCP;
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	public static WebElement TownCityCP;
	@FindBy(xpath="//div[text()='Retain my details for the next visit.']")
	public static WebElement RetaindetailsCP;
	@FindBy(xpath="//div[text()='I prefer not to receive future communication and newsletter from SpiceJet over text, WhatsApp or e-mail.']")
	public static WebElement DoNotReceiveCP;
	@FindBy(xpath="//div[text()='I have a GST number (optional)']")
	public static WebElement GSTNumberCP;
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
	public static WebElement PrimaryP1;
	@FindBy(xpath="//div[@data-testid='traveller-0-title-field']")
	public static WebElement TitleP1;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1habvwh r-19fu0aa r-1loqt21 r-mabqd8 r-1777fci r-1yt7n81 r-1otgn73']")
	public static WebElement MrP1;
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	public static WebElement FirstMiddleP1;
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	public static WebElement LastP1;
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	public static WebElement ContNumberP1;
	@FindBy(xpath="//div[text()='Next']")
	public static WebElement NextP1;
	@FindBy(xpath="//div[@id='pax-item-MSFBRFQ-']")
	public static WebElement Passenger2;
	@FindBy(xpath="//div[@data-testid='traveller-1-title-field']")
	public static WebElement TitleP2;
	@FindBy(xpath="//div[text()='Mrs']")
	public static WebElement MrP2;
	@FindBy(xpath="//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	public static WebElement FirstMiddleP2;
	@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	public static WebElement LastP2;
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
	public static WebElement ContNumberP2;
	@FindBy(xpath="//div[text()='Next']")
	public static WebElement NextP2;
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	public static WebElement ContinuePas;
	@FindBy(xpath="//div[@id='at_addon_close_icon']")
	public static WebElement Popup3;
	
	
	//Addon
	@FindBy(xpath="(//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACUAAAAlCAYAAADFniADAAAABHNCSVQICAgIfAhkiAAAA7BJREFUWEfNWE1IFGEYfkdXV9FV8xdRWw2ki1CnpI4bSYQUS4fEY4cFCw91CPbgSUHo0ApSgmDHNKFDHSKI9li4l+wYQrKrIv5t6brouqvb804zw+y4O3+uNAPD7sz3zfs987zP+zOfQBaPpaUld0VFxR1BEG7h0RvZbPYifj34deFeBv8TJSUlUVx/w/n58PDwY3d3d8rKMoLZySsrK9ew6FMsdL+8vHy/srKyrqysjPgECMIYYYxOTk4onU7T0dERAdAf/FZj7B3GXnR0dETMrGcIKhqNXiotLQ3B2E2Px1OFg3BtxrY45/j4mJLJJCUSiSQuv+D6idfr/aVnQBcUAAXAwsuamhoXTtNACk3c29sjnBmw+RjApgvNKwhqdXX1FRgZrK+vr4W7zgxINsBujcfju2DsTXt7+6N8hvOCWltbm4NWbjc2NtayVop9sPa2t7d3ob1PbW1tA1r7p1ZkhsDMYFNTU22xwWjtbW1t7YK5U4zlgGINAdDzlpaWc2FIC4oZ29jYYGDP1BpTQHGUQdQ/m5ubXcXUkBHbrLHNzU0W/2U5KhVQcNt7hPzdYkSZERDtOEclUsYHCP8ej4mgpMQYhuiqrBos1nwEVxLu9HGCFUGBpTmw9OB/sCS/lMTWW7A1IEi1bL+1tdVlJVMXiyHZDmf+9fX1DEpTtQDX+SHs1xB4ndmFFhYWxKm9vb26jywvL1MkEqH+/n7i8mR0QPBcKx8KnJfguiErrvP7/aL94eFh8vl8eddiQCMjI2Ld05unfhhi5zI0JUBg31FKrqIdMXoRZTwcDtPk5GRBYGpAnZ2dNDY2ZoopuI52dnZ+sPvi0NMFq3oqBMwuIH5DSVe/GVQaqYAbNNNMyRO1wLq6uhSXWWFItscZHp7LCLFYLIvcYBlQPmBut5tSqRTZASTbA0l0JqZkQ/Pz8zQ7OyteorOgiYkJUxrSMqEwZVdTskG1huR7ZqNNC0rRFFLCYkNDwxUr0ZcPELusr6+Ppqf/NZR2gHH0oQFcFPMUctQQcpUlXRWKMqN0obeIVGqmbGV0o7C3C0zJ6HZqXyAQIHSNulGmBjY6Oko9PT26nsipfTzTapcwPj4ulo9gMKgbZQxsZmaGQqEQobbqgsrpEnimI/spiS1ndZ4MypE9ugTMWV8zsgod990nA3PcF7KaMUftJcjAHLfrogLmrP0pdQrW7uShq6jjz/tCO3m8m3dwcHA+O3na2qDe80QLfR17AF7MydnzxP0Y7n21u+f5FwuPrAHjhMBtAAAAAElFTkSuQmCC'])[1]")
	public static WebElement popupNew;
	
	@FindBy(xpath="//div[@id='at_addon_close_icon']")
	public static WebElement Popup;
	@FindBy(xpath="//div[@data-testid='spice-max-card-add-cta']")
	public static WebElement SpiceMaxAdd;
	@FindBy(xpath="//descendant::div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'][3]")
	public static WebElement CloseAdd;
	@FindBy(xpath="//div[@data-testid='bookingFlow-spicePlus-add-cta']")
	public static WebElement SpicePlusAdd;
	@FindBy(xpath="//div[@data-testid='bookingFlow-seats-add-cta']")
	public static WebElement Seat;
	@FindBy(xpath="(//div[text()='10D'])[1]")
	public static WebElement D10;
	@FindBy(xpath="(//div[text()='10C'])[1]")
	public static WebElement C10;
	@FindBy(xpath="(//div[text()='12E'])[1]")
	public static WebElement E12;
	@FindBy(xpath="(//div[text()='12D'])[1]")
	public static WebElement D12;
	@FindBy(xpath="(//div[text()='11E'])[1]")
	public static WebElement E11;
	@FindBy(xpath="(//div[text()='11D'])[1]")
	public static WebElement D11;
	@FindBy(xpath="//div[text()='Skip']")
	public static WebElement Skip;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	public static WebElement SelectMeals;
	@FindBy(xpath="//div[text()='Spinach, corn and cheese sandwich in marble bread']")
	public static WebElement San1;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1ewfge1 r-z2wwpe r-rs99b7 r-1tbvqmw r-1loqt21 r-15d164r r-6dt33c r-1oqcu8e r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-13qz1uu']")
	public static WebElement Passenger22;
	@FindBy(xpath="//div[text()='Chicken masala in multigrain bread']")
	public static WebElement San2ChickenMasala;
	@FindBy(xpath="//div[text()='Done']")
	public static WebElement DoneSM;
	@FindBy(xpath="//div[@data-testid='bookingFlow-meals-add-cta']")
	public static WebElement SpiceCafe;
	@FindBy(xpath="//div[@data-testid='bookingFlow-blueRibbonBag-add-cta']")
	public static WebElement Bagprotekt;
	@FindBy(xpath="//div[@data-testid='bookingFlow-youFirst-add-cta']")
	public static WebElement You1st;
	@FindBy(xpath="//div[@data-testid='bookingFlow-assurance-add-cta']")
	public static WebElement SpiceInsurance;
	@FindBy(xpath="//div[@data-testid='bookingFlow-wheelChair-add-cta']")
	public static WebElement Wheelchair;
	@FindBy(xpath="//div[@data-testid='bookingFlow-baggage-add-cta']")
	public static WebElement ExcessBaggage;
	@FindBy(xpath="//div[@data-testid='bookingFlow-carrymoreonboard-add-cta']")
	public static WebElement CarryMore;
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	public static WebElement ContinueAdd;
	@FindBy(xpath="//span[@id='selectfrompopup']")
	public static WebElement SelectseatPromp;
	//TryCatch

	//Payment
	@FindBy(xpath="//div[text()='Credit/Debit Card']")
	public static WebElement CreditDebitCard;

	@FindBy(xpath="(//label[@id='cardnumber'])[1]")
	public static WebElement Textbox;
	
	@FindBy(xpath="//input[@placeholder='Enter Card Number Here']")
	public static WebElement CardNumber;
	@FindBy(xpath="//input[@placeholder='Cardholder Name']")
	public static WebElement Name;	
	@FindBy(xpath="//input[@placeholder='MM']")
	public static WebElement MM;
	@FindBy(xpath="//input[@placeholder='YY']")
	public static WebElement YY;
	@FindBy(xpath="//input[@placeholder='123']")
	public static WebElement CVV;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-C10fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	public static WebElement Proceed;
	@FindBy(xpath="//div[text()='NetBanking']")
	public static WebElement NetBanking;
	@FindBy(xpath="//div[text()='UPI']")
	public static WebElement UPI;
	@FindBy(xpath="//div[text()='Wallets']")
	public static WebElement Wallets;
	@FindBy(xpath="//div[text()='EMI']")
	public static WebElement EMI;
	@FindBy(xpath="//div[text()='Credit Shell']")
	public static WebElement CreditShell;
	@FindBy(xpath="//div[text()='Gift Card']")
	public static WebElement GiftCard;
	@FindBy(xpath="//div[text()='SC Points']")
	public static WebElement SCPoints;
	@FindBy(xpath="//div[text()='Voucher']")
	public static WebElement Voucher;
	@FindBy(xpath="//div[@id='at_prepayment_close_icon']")
	public static WebElement PopupPayment;
	
	
	public void Flights() throws InterruptedException {
		System.out.println("Flights Method Initiated");
		try{
			Thread.sleep(10000);
			SpiceFlex.click();
			Thread.sleep(5000);
			System.out.println("SpiceFlex");
			ContinueFt.click();
			System.out.println("Continue");
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println("Unable to select SpiceFlex option");
			Thread.sleep(5000);
			ContinueFt.click();
			System.out.println("ContinueFt");			
		}
		String ExpectedTitle = ("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String ActualTitle = driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Successfully navigated to Passengers Page");
	}
	
	public void Passengers() throws InterruptedException {
		System.out.println("Passenger Method Initiated");
		Thread.sleep(8000);
		TitleCP.click();
		Thread.sleep(5000);
		System.out.println("TitleCP");
		MrCP.click();
		Thread.sleep(5000);
		System.out.println("MrCP");
		FirstMiddleCP.sendKeys("Christopher");
		Thread.sleep(5000);
		System.out.println("FirstMiddleCP");
		LastCP.sendKeys("Roy");
		Thread.sleep(5000);
		System.out.println("LastCP");
		ContNumberCP.sendKeys("6951236552");
		Thread.sleep(5000);
		System.out.println("ContNumberCP");
		EmailCP.sendKeys("RoyChristopher132659@gmail.com");
		Thread.sleep(5000);
		System.out.println("EmailCP");
		CountryCP.click();
		Thread.sleep(5000);
		System.out.println("CountryCP");
		IndiaCP.click();
		Thread.sleep(5000);
		System.out.println("IndiaCP");
		TownCityCP.sendKeys("Agra");
		Thread.sleep(5000);
		System.out.println("TownCityCP");
		RetaindetailsCP.click();
		Thread.sleep(5000);
		System.out.println("RetaindetailsCPUnclicked");		
		DoNotReceiveCP.click();
		Thread.sleep(5000);
		System.out.println("DoNotReceiveCP");
		PrimaryP1.click();
		Thread.sleep(5000);
		System.out.println("PrimaryP1");
		NextP1.click();
		Thread.sleep(5000);
		System.out.println("NextP1");
//		Passenger2.click();
//		Thread.sleep(5000);
//		System.out.println("Passenger2");
		TitleP2.click();
		Thread.sleep(5000);
		System.out.println("TitleP2");
		MrP2.click();
		Thread.sleep(5000);
		System.out.println("MrP2");
		FirstMiddleP2.sendKeys("Catherine");
		Thread.sleep(5000);
		System.out.println("FirstMiddleP2");
		LastP2.sendKeys("Sneha");
		Thread.sleep(5000);
		System.out.println("LastP2");
		ContNumberP2.sendKeys("6753654949");
		Thread.sleep(5000);
		System.out.println("ContNumberP2");
//		NextP2.click();
//		Thread.sleep(5000);
//		System.out.println("NextP2");
		ContinuePas.click();
		Thread.sleep(5000);
		System.out.println("ContinuePas");
		
		String ExpectedTitle = ("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String ActualTitle = driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Successfully navigated to Addon Page");		
	}

	public void Addon() throws InterruptedException {
		System.out.println("Addon Method Initiated");
		try{			
			Thread.sleep(15000);
			Popup.click();
			System.out.println("Popup Closed");
		}
		catch(Exception e1){
			System.out.println("Popup Message not appeared");
		}

		try{
			Seat.click();
			Thread.sleep(5000);
			System.out.println("Seat");
		}
		catch(Exception e){
			System.out.println("Unable to select Seat");
			Seat.click();
			Thread.sleep(5000);
			System.out.println("Seat");

		}
	try{
			Thread.sleep(5000);
			D10.click();
			System.out.println("D10");
			try{
				Thread.sleep(5000);
				Skip.click();
				System.out.println("Skip");
			}
			catch(Exception e){
				System.out.println("No Popups");
			}
			try{
				Thread.sleep(5000);
				C10.click();
				System.out.println("C10");
			}
			catch(Exception e){
				System.out.println("Unable to select C10");
				Thread.sleep(5000);
				C10.click();
				System.out.println("C10");
			}
			try{
				Thread.sleep(5000);
				Skip.click();
				System.out.println("Skip1");
			}
			catch(Exception e){
				System.out.println("No Popups");
			}
			}
	catch(Exception e){
		try{
				Thread.sleep(5000);
				E12.click();
				System.out.println("E12");
				try{
					Thread.sleep(5000);
					Skip.click();
				}
				catch(Exception e1){
					System.out.println("No Popups");
				}
				try{
					Thread.sleep(5000);
					D12.click();
					System.out.println("D12");
				}
				catch(Exception e1){
					System.out.println("Unable to select C10 at first attempt");
					Thread.sleep(5000);
					D12.click();
					System.out.println("D12");
				}
				try{
					Thread.sleep(8000);
					Skip.click();
					System.out.println("Skip1");
				}
				catch(Exception e1){
					System.out.println("No Popups");
				}
			}
			catch(Exception e1){
				try{
					Thread.sleep(5000);
					E11.click();
					System.out.println("E11");
					try{
						Thread.sleep(5000);
						Skip.click();
					}
					catch(Exception e2){
						System.out.println("No Popups");
					}
					try{
						Thread.sleep(8000);
						D11.click();
						System.out.println("D11");
					}
					catch(Exception e2){
						System.out.println("Unable to select D11 at first attempt");
						Thread.sleep(8000);
						D11.click();
						System.out.println("D11");
					}
					try{
						Thread.sleep(8000);
						Skip.click();
						System.out.println("Skip1");
					}
					catch(Exception e2){
						System.out.println("No Popups");
					}
				}
				catch(Exception e2){
					System.out.println("Execution of Addon method intercepted.");
				}
			}
		}

		Thread.sleep(8000);
		SelectMeals.click();
		System.out.println("SelectMeals");
		try{
			Thread.sleep(5000);
			San1.click();
			System.out.println("San1");
			Thread.sleep(5000);
			San2ChickenMasala.click();
			System.out.println("San2ChickenMasala1");
			Thread.sleep(5000);
			San1.click();
			System.out.println("San2");
			Thread.sleep(5000);
			San2ChickenMasala.click();
			System.out.println("San2ChickenMasala2");
			Thread.sleep(5000);
			DoneSM.click();
			System.out.println("DoneSM");
			}
		catch(Exception e){
			System.out.println("SelectMeals Not shown this time.");
			try{
				Thread.sleep(20000);
				Popup3.click();
			}
			catch(Exception e5){
				System.out.println("No PopUp");
			}			
		}
		
		Thread.sleep(5000);
		ContinueAdd.click();
		System.out.println("ContinueAdd");

		try{
			Thread.sleep(8000);
			SelectseatPromp.click();
			Thread.sleep(5000);
			System.out.println("SelectseatPromp");
		}
		catch(Exception e){
			System.out.println("No Popup notification appeared");
		}
		String ExpectedTitle = ("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String ActualTitle = driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("PASS : Successfully navigated to Payment Page");
	}
	
	public void Payment() throws InterruptedException {
		System.out.println("Payment Method Initiated");
		try{			
			Thread.sleep(20000);
			popupNew.click();
			System.out.println("Popup Closed");
		}
		catch(Exception e1){
			System.out.println("Popup Message not appeared");
		}
		try{
			Thread.sleep(5000);
			CreditDebitCard.click();
			Thread.sleep(5000);
			System.out.println("CreditDebitCard");
			NetBanking.click();
			Thread.sleep(5000);
			System.out.println("NetBanking");
			UPI.click();
			Thread.sleep(5000);
			System.out.println("UPI");
			Wallets.click();
			Thread.sleep(5000);
			System.out.println("Wallets");
			EMI.click();
			Thread.sleep(5000);
			System.out.println("EMI");
			CreditShell.click();
			Thread.sleep(5000);
			System.out.println("CreditShell");
			GiftCard.click();
			Thread.sleep(5000);
			System.out.println("GiftCard");
			SCPoints.click();
			Thread.sleep(5000);
			System.out.println("SCPoints");
			Voucher.click();
			Thread.sleep(5000);
			System.out.println("Voucher");

		}
		catch(Exception e){
			Thread.sleep(10000);
			PopupPayment.click();
			System.out.println("Popup Closed");
		}
		
		try{
				Thread.sleep(5000);
				CreditDebitCard.click();
				Thread.sleep(15000);
				System.out.println("CreditDebitCard");

				try{
					Thread.sleep(10000);
					PopupPayment.click();
					System.out.println("Popup Closed");
				}
				catch(Exception e){
					System.out.println("No popup");
				}
//				CardNumber.click();
				if(CardNumber.isDisplayed()) {
					System.out.println("CardNumber Element is Displayed");
					JavascriptExecutor JSE5 = (JavascriptExecutor) driver;
					JSE5.executeScript("arguments[0].value='4018061289202450'", CardNumber);
					Thread.sleep(5000);
//					CardNumber.sendKeys("4018061289202450");
//					Thread.sleep(5000);
					System.out.println("CardNumber");					
				}

				JavascriptExecutor JSE4 = (JavascriptExecutor) driver;
//				Name.click();
				JSE4.executeScript("arguments[0].value='Catherine'", Name);
				Thread.sleep(5000);
//				Name.sendKeys("Catherine");
//				Thread.sleep(5000);
				System.out.println("Name");
				MM.click();
				JSE4.executeScript("arguments[0].value='07'", MM);			
				Thread.sleep(5000);
//				MM.sendKeys("07");
//				Thread.sleep(5000);
//				System.out.println("MM");
//				YY.click();
				JSE4.executeScript("arguments[0].value='28'", YY);	
				Thread.sleep(5000);
//				YY.sendKeys("28");
//				Thread.sleep(5000);
				System.out.println("YY");
//				CVV.click();
				JSE4.executeScript("arguments[0].value='564'", CVV);					
				Thread.sleep(5000);
//				CVV.sendKeys("564");
//				Thread.sleep(5000);
				System.out.println("CVV");
//				Proceed.click();
				JSE4.executeScript("arguments[0].click();", Proceed);	
				Thread.sleep(5000);
				System.out.println("Proceed");
			}
			catch(Exception e1){
				System.out.println("FAIL : Unable to complete the execution.");
			}
				
		String ExpectedTitle = ("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		String ActualTitle = driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		try{
			Assert.assertEquals(ActualTitle, ExpectedTitle);
		}
		catch(Exception e){
			System.out.println("Try again.");
		}
		System.out.println("PASS : Successfully navigated to Payment Page");
	}
	
	public void SSTC001() throws IOException{
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
	}
	
	public void SSTC005() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenSJ\\ScreenShots\\SSTC005_";
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
