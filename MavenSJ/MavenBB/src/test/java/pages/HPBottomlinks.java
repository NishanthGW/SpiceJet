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

public class HPBottomlinks {
	WebDriver driver;
	public HPBottomlinks(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	String HomePage = "https://www.bestbuy.com/?intl=nosplash";
	@FindBy(xpath="//button[text()='No, Thanks']")
	public static WebElement NoThanks;
	
	//Order & Purchases
	@FindBy(xpath="//a[text()='Check Order Status']")
	public static WebElement CheckOrderStatus;
	@FindBy(xpath="//a[text()='Shipping, Delivery & Pickup']")
	public static WebElement ShippingDeliveryPickup;
	@FindBy(xpath="//a[text()='Returns & Exchanges']")
	public static WebElement ReturnsExchanges;
	@FindBy(xpath="//a[text()='Price Match Guarantee']")
	public static WebElement PriceMatchGuarantee;
	@FindBy(xpath="//a[text()='Product Recalls']")
	public static WebElement ProductRecalls;
	@FindBy(xpath="//a[text()='Trade-In Program']")
	public static WebElement TradeInProgram;
	@FindBy(xpath="//a[@data-lid='ft_op_gift_cards']")
	public static WebElement GiftCards;
	
	//Support & Services
	@FindBy(xpath="//a[text()='Visit our Support Center']")
	public static WebElement VisitourSupportCenter;
	@FindBy(xpath="//a[@data-lid='ft_support_shop_with_expert']")
	public static WebElement ShopwithanExpert;
	@FindBy(xpath="//a[text()='Schedule a Service']")
	public static WebElement ScheduleaService;
	@FindBy(xpath="//a[text()='Manage an Appointment']")
	public static WebElement ManageanAppointmen;
	@FindBy(xpath="//a[text()='Protection & Support Plans']")
	public static WebElement ProtectionSupportPlans;
	@FindBy(xpath="//a[text()='Haul Away & Recycling']")
	public static WebElement HaulAwayRecycling;
	@FindBy(xpath="//a[text()='Contact Us']")
	public static WebElement ContactUs;
	
	//Partnerships
	@FindBy(xpath="//a[text()='Affiliate Program']")
	public static WebElement AffiliateProgram;
	@FindBy(xpath="//a[text()='Advertise with Us']")
	public static WebElement AdvertisewithUs;
	@FindBy(xpath="//a[text()='Developers']")
	public static WebElement Developers;
	@FindBy(xpath="//a[text()='Best Buy Health']")
	public static WebElement BestBuyHealth;
	@FindBy(xpath="//a[text()='Best Buy Education']")
	public static WebElement BestBuyEducation;
	@FindBy(xpath="//a[@data-lid='ft_partner_best_buy_business']")
	public static WebElement BestBuyBusiness;
	
	//Payment Options
	@FindBy(xpath="//a[text()='My Best Buy® Credit Card']")
	public static WebElement CreditCard;
	@FindBy(xpath="//a[text()='Pay Your Bill at Citibank']")
	public static WebElement Citibank;
	@FindBy(xpath="//a[text()='Lease to Own']")
	public static WebElement LeasetoOwn;
	
	//Rewards & Membership
	@FindBy(xpath="//a[@data-lid='ft_member_best_buy_membership']")
	public static WebElement Memberships;
	@FindBy(xpath="//a[text()='View Points & Certificates']")
	public static WebElement ViewPointsCertificates;
	@FindBy(xpath="//a[text()='Member Offers']")
	public static WebElement MemberOffers;
	
	//About Best Buy
	@FindBy(xpath="//a[text()='Corporate Information']")
	public static WebElement CorporateInformation;
	@FindBy(xpath="//a[text()='Careers']")
	public static WebElement Careers;
	@FindBy(xpath="//a[text()='Corporate Responsibility']")
	public static WebElement CorporateResponsibility;
	@FindBy(xpath="//a[text()='Sustainability']")
	public static WebElement Sustainability;
	
	
	public void OrderPurchases() throws InterruptedException {
		System.out.println("OrderPurchases Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		CheckOrderStatus.click();
		Thread.sleep(3000);
		driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CheckOrderStatus.click();
			driver.navigate().back();
		}
		
		try{
			ShippingDeliveryPickup.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				ShippingDeliveryPickup.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
		ReturnsExchanges.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		}
		catch(Exception e){
			NoThanks.click();
			Thread.sleep(1000);
			ReturnsExchanges.click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		
		try {
			PriceMatchGuarantee.click();
			Thread.sleep(3000);
			driver.navigate().back();			
		}
		catch(Exception e) {
			NoThanks.click();
			PriceMatchGuarantee.click();
			Thread.sleep(3000);
			driver.navigate().back();			
		}
		
		try{
			ProductRecalls.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				ProductRecalls.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			TradeInProgram.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				TradeInProgram.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
		GiftCards.click();
		}
		catch(Exception e) {
			NoThanks.click();
			Thread.sleep(1000);
			GiftCards.click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		System.out.println("OrderPurchases Links are working as expected");
		System.out.println();
	}
	
	public void SupportServices() throws InterruptedException {
		System.out.println("SupportServices Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			VisitourSupportCenter.click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			VisitourSupportCenter.click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
		try{
			Thread.sleep(5000);
			ShopwithanExpert.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
			Thread.sleep(5000);
				NoThanks.click();
				Thread.sleep(5000);
				ShopwithanExpert.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			Thread.sleep(5000);
			ScheduleaService.click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		catch(Exception e){
			Thread.sleep(5000);
				NoThanks.click();
				Thread.sleep(5000);
				ScheduleaService.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			Thread.sleep(5000);
			ManageanAppointmen.click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
		catch(Exception e){
			Thread.sleep(5000);
				NoThanks.click();
				Thread.sleep(1000);
				ManageanAppointmen.click();
				Thread.sleep(5000);
				driver.navigate().back();
		}
		
		try{
			Thread.sleep(5000);
			ProtectionSupportPlans.click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
		catch(Exception e){
			Thread.sleep(5000);
				NoThanks.click();
				Thread.sleep(1000);
				ProtectionSupportPlans.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			Thread.sleep(5000);
			HaulAwayRecycling.click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		catch(Exception e){
			Thread.sleep(5000);
				NoThanks.click();
				Thread.sleep(1000);
				HaulAwayRecycling.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			Thread.sleep(5000);
			ContactUs.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		}
		catch(Exception e){
			Thread.sleep(5000);
				NoThanks.click();
				Thread.sleep(1000);
				ContactUs.click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(5000);
		}
			System.out.println("Support Services Links are working as expected");
			System.out.println();
	}
	
	public void Partnerships() throws InterruptedException {
		System.out.println("Partnerships Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			AffiliateProgram.click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			AffiliateProgram.click();
			driver.navigate().back();
		}
		try{
			AdvertisewithUs.click();
			Thread.sleep(3000);
			JavascriptExecutor JSE = (JavascriptExecutor) driver;
			JSE.executeScript("history.go(0)");
			JSE.executeScript("history.go(0)");
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				AdvertisewithUs.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			Developers.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				Developers.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			BestBuyHealth.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				BestBuyHealth.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			BestBuyEducation.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				BestBuyEducation.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			BestBuyBusiness.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				BestBuyBusiness.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		System.out.println("Partnerships Links are working as expected");
		System.out.println();
	}
	
	public void PaymentOptions() throws InterruptedException {
		System.out.println("PaymentOptions Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CreditCard.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CreditCard.click();
			driver.navigate().back();
		}
		
		try{
			Citibank.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				Citibank.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			LeasetoOwn.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				LeasetoOwn.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		System.out.println("PaymentOptions Links are working as expected");	
		System.out.println();
	}
	
	public void RewardsMembership() throws InterruptedException {
		System.out.println("RewardsMembership Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Memberships.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Memberships.click();
			driver.navigate().back();
		}
		try{
			ViewPointsCertificates.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				ViewPointsCertificates.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			MemberOffers.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				MemberOffers.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		System.out.println("RewardsMembership Links are working as expected");
		System.out.println();
	}
	
	public void AboutBestBuy() throws InterruptedException {
		System.out.println("AboutBestBuy Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CorporateInformation.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CorporateInformation.click();
			driver.navigate().back();
		}
		
		try{
			Careers.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				Careers.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			CorporateResponsibility.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				CorporateResponsibility.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
		
		try{
			Sustainability.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		catch(Exception e){
				NoThanks.click();
				Thread.sleep(1000);
				Sustainability.click();
				Thread.sleep(1000);
				driver.navigate().back();
		}
			System.out.println("AboutBestBuy Links are worked as expected");
			System.out.println();
	}
	
	String Path = "C:\\Users\\godwi\\OneDrive\\Desktop\\Software Testing\\ScreenShots\\BestBuy\\SShot1.png";

	public void SSTC005() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC005_";
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
