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

public class USA_Menu {
	WebDriver driver;
	
	public USA_Menu (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	String HomePage = "https://www.bestbuy.com/?intl=nosplash";
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	public static WebElement menu;
	@FindBy(xpath="//button[text()='No, Thanks']")
	public static WebElement NoThanks;	
	
	@FindBy(xpath="//span[text()='Cart']")
	public static WebElement CartPage;
	@FindBy(xpath="//button[text()='Checkout']")
	public static WebElement Checkout;
	@FindBy(xpath="//button[text()='Continue as Guest']")
	public static WebElement Guest;
	@FindBy(xpath="//input[@id='user.emailAddress']")
	public static WebElement EmailCP;
	@FindBy(xpath="//input[@id='user.phone']")
	public static WebElement PhoneNumCP;
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	public static WebElement SubmitCP;
	
	
	@FindBy(xpath="//button[@data-id='node-30']")	
	public static WebElement Deals;
	@FindBy(xpath="//a[text()='Deal of the Day'][1]")
	public static WebElement DoD;
	
	@FindBy(xpath="//button[@data-id='node-60']")
	public static WebElement SupportandServise;
	@FindBy(xpath="//a[text()='Repair & Tech Services']")
	public static WebElement RandT;
	
	@FindBy(xpath="//button[@data-id='node-79']")
	public static WebElement Brands;
	@FindBy(xpath="//a[text()='Samsung']")
	public static WebElement Samsung;
	@FindBy(xpath="//a[text()='TV and home theater'][1]")
	public static WebElement TVandhometheater;
	@FindBy(xpath="//a[text()='Ultimate TVs']")
	public static WebElement UltimateTVs;
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'][1]")
	public static WebElement S90Cadd;
	@FindBy(xpath="//button[text()='Continue shopping']")
	public static WebElement ConSho;
		
	@FindBy(xpath="//button[@data-t='hamburger-navigation-button']")
	public static WebElement menu1;
	
	@FindBy(xpath="//button[@data-lid='ubr_app']")
	public static WebElement Appliances;
	@FindBy(xpath="//button[@data-lid='ubr_app_ska']")
	public static WebElement SmaKitchAppli;
	@FindBy(xpath="//a[text()='Coffee, Tea & Espresso']")
	public static WebElement CoffTea;
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'][1]")
	public static WebElement NespresoAdd;
	@FindBy(xpath="//button[text()='Continue shopping']")
	public static WebElement ContSHopAppli;
	
	@FindBy(xpath="//button[@data-id='node-277']")
	public static WebElement TVHomeTheatre;
	
	@FindBy(xpath="//button[@data-lid='ubr_cp']")
	public static WebElement CompTab;

	@FindBy(xpath="//button[@data-lid='ubr_mob']")
	public static WebElement CellPhones;

	@FindBy(xpath="//button[@data-lid='ubr_au']")
	public static WebElement Audio;	
	@FindBy(xpath="//a[text()='Musical Instruments']")
	public static WebElement MusicInst;
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART'][1]")
	public static WebElement AddItem;

	@FindBy(xpath="(//div[@class='image-block-standard__image-wrapper'])[1]")
	public static WebElement AudioItem;
	@FindBy(xpath="//button[text()='Add to Cart']")
	public static WebElement AddtoCart11;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	public static WebElement ContSHo;
	
	@FindBy(xpath="//button[@data-lid='ubr_gmm']")
	public static WebElement VideoGames;	

	@FindBy(xpath="//button[@data-lid='ubr_cc']")
	public static WebElement Camera;
	
	@FindBy(xpath="//button[@data-lid='ubr_hof']")
	public static WebElement Home;

	@FindBy(xpath="//button[@data-lid='ubr_sh']")
	public static WebElement SmartHome;

	@FindBy(xpath="//button[@data-lid='ubr_car']")
	public static WebElement CarElectGPS;
	
	@FindBy(xpath="//button[@data-lid='ubr_mm']")
	public static WebElement Movie;

	@FindBy(xpath="//button[@data-lid='ubr_wt']")
	public static WebElement WearableTech;

	@FindBy(xpath="//button[text()='Close']")
	public static WebElement Close;

		public void menu() throws InterruptedException {
		menu.click();
		Thread.sleep(10000);		
	}
		
	public void MenuDeal() {
		try{
			driver.navigate().to(HomePage);
			try {
				menu.click();
			}
			catch(Exception e) {
				NoThanks.click();
				menu.click();
			}
			Deals.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
			System.out.println();
			String ExpTitle =  "Best Buy | Official Online Store | Shop Now & Save";
	        System.out.println("Expected URL Title : "+ ExpTitle);
	        String ActTitle = driver.getTitle();
	                System.out.println("Actual URL Title : "+ ActTitle);
	        if(ActTitle.equals(ExpTitle)){
	            System.out.println("Pass : Title of the page is validated and working as expected");
	        }
	        else{
	            System.out.println("Fail : Unable to navigate to the expected page.");
	        }
		}
		catch(Exception e){
				System.out.println("Fail : Test Script running is interrupted .");
		}
		try{
	        DoD.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
	        String ExpTitle1 = "Deal of the Day: Electronics Deals - Best Buy"; 
	        String actTitle1 = driver.getTitle(); 
	        System.out.println("Expected URL Title : "+ ExpTitle1);
	        System.out.println("Actual URL Title : "+ actTitle1);
	        if(actTitle1.equals(ExpTitle1)){
	            System.out.println("Pass : Title of the Deal Menu page was validated and Menu is working as expected");
	        }
	        else{
	            System.out.println("Fail : Unable to navigate to the expected page.");
	        }
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted .");
		}
	}
	
	public void SupportServise() {
		try{
			driver.navigate().to(HomePage);
			try {
				menu.click();
				System.out.println();
			}
			catch(Exception e) {
				NoThanks.click();
				menu.click();
			}
			SupportandServise.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
			String ExpTitle2 =  "Best Buy | Official Online Store | Shop Now & Save";
	        System.out.println("Expected URL Title : "+ ExpTitle2);
	        String ActTitle2 = driver.getTitle();
	                System.out.println("Actual URL Title : "+ ActTitle2);
	        if(ActTitle2.equals(ExpTitle2)){
	            System.out.println("PASS : Title of the SupportandServise page was Successfully Validated and Menu option working as expected");
	        }
	        else{
	            System.out.println("FAIL :  Unable to navigate to the expected page.");
	        }

		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}
	        
	      //Menu-Support&Services-RandT
		try{
	        RandT.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
	        String ExpTitle1 = "Schedule a Service - Best Buy";
	        String actTitle1 = driver.getTitle(); 
	        System.out.println("Expected URL Title : "+ ExpTitle1);
	        System.out.println("Actual URL Title : "+ actTitle1);
	        if(actTitle1.equals(ExpTitle1)){
	            System.out.println("PASS : Title of the Deal of the Day page is working as expected");
	        }
	        else{
	            System.out.println("FAIL :  Unable to navigate to the expected page.");
	        }
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}
    }
	
	public void Brands() throws InterruptedException {
		try{
			driver.navigate().to(HomePage);
			try {
				Thread.sleep(3000);
				menu.click();
				System.out.println();
			}
			catch(Exception e) {
				Thread.sleep(3000);
				NoThanks.click();
				menu.click();
			}
			Brands.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
			System.out.println();
			String ExpTitle1 =  "Best Buy | Official Online Store | Shop Now & Save";
	        System.out.println("Expected URL Title : "+ ExpTitle1);
	        String ActTitle1 = driver.getTitle();
	                System.out.println("Actual URL Title : "+ ActTitle1);
	        if(ActTitle1.equals(ExpTitle1)){
	            System.out.println("PASS : Title of the Brands page is as expected");
	        }
	        else{
	            System.out.println("FAIL :  Unable to navigate to the expected page.");
	        }
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}
        
      //Menu-Brands-Samsung
		try{
	        Samsung.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
	        String ExpTitle2 = "Samsung Store – Best Buy";
	        String actTitle2 = driver.getTitle(); 
	        System.out.println("Expected URL Title : "+ ExpTitle2);
	        System.out.println("Actual URL Title : "+ actTitle2);
	        if(actTitle2.equals(ExpTitle2)){
	            System.out.println("PASS : Title of Brands-Samsung is as expected");
	        }
	        else{
				System.out.println("Fail : Test Script running is interrupted.");
	        }
		}
		catch(Exception e){
			System.out.println("Fail : Test Script running is interrupted.");
		}
}

	public void AddBrands() throws InterruptedException, IOException {
		System.out.println();
		System.out.println("AddBrands Method Initiated");
			driver.navigate().to(HomePage);
			try{
				Thread.sleep(10000);
				NoThanks.click();
				Thread.sleep(8000);
				menu.click();
				Thread.sleep(5000);				
			}
			catch(Exception e){
				menu.click();
				Thread.sleep(5000);
			}
			Brands.click();
	        
	      //Menu-Brands-Samsung
	        Samsung.click();
			Thread.sleep(6000);
			USA_Menu usm = new USA_Menu(driver);
			usm.SSTC004();
			Thread.sleep(10000);		
	        TVandhometheater.click();
			Thread.sleep(10000);		
	        UltimateTVs.click();
			Thread.sleep(20000);		
	        S90Cadd.click();
			Thread.sleep(20000);
			USA_Menu usm1 = new USA_Menu(driver);
			usm1.SSTC008();
	        ConSho.click();
			Thread.sleep(20000);
			System.out.println("PASS : Item in the Brand menu is added to the Cart Successfully.");
    }
	
	public void AddAppliances() throws InterruptedException, IOException {
		System.out.println();
		System.out.println("AddAppliances Method Initiated");
			driver.navigate().to(HomePage);
			try {
				Thread.sleep(5000);
				menu.click();
			}
			catch(Exception e) {
				NoThanks.click();
				Thread.sleep(5000);
				menu.click();
				Thread.sleep(5000);
			}
			Appliances.click();
			Thread.sleep(1000);
			SmaKitchAppli.click();
			Thread.sleep(1000);
			CoffTea.click();
			Thread.sleep(1000);
			NespresoAdd.click();
			Thread.sleep(20000);
			USA_Menu usm1 = new USA_Menu(driver);
			usm1.SSTC007();
			ContSHopAppli.click();
			System.out.println("PASS : Item in Appliances Menu added to the Cart Successfully.");
	}

	public void AddAudio() throws InterruptedException, IOException {
		System.out.println();
		System.out.println("AddAudio Method Initiated");
			driver.navigate().to(HomePage);
			try{
				Thread.sleep(6000);
				NoThanks.click();
			}
			catch(Exception e){
				System.out.println("No popup");
			}
			try {
				Thread.sleep(1000);
				menu.click();
				Thread.sleep(1000);
			}
			catch(Exception e) {
				NoThanks.click();
				menu.click();
			}
			Thread.sleep(5000);
			Audio.click();
			Thread.sleep(5000);
			MusicInst.click();
			System.out.println("MusicInst");
			Thread.sleep(15000);
			try{
				AddItem.click();
				Thread.sleep(20000);
			}
			catch(Exception e){
				AudioItem.click();
				Thread.sleep(20000);
				AddtoCart11.click();
				Thread.sleep(20000);
			}
			Thread.sleep(20000);
			USA_Menu usm1 = new USA_Menu(driver);
			usm1.SSTC007();
			ContSHo.click();
			System.out.println("PASS : Item in Audio menu added to the Cart");
	}
	
	public void OtherMenuOpt() throws InterruptedException {
		System.out.println();
		System.out.println("OtherMenuOpt Method Initiated");
		System.out.println("AddAudio Method Initiated");
			driver.navigate().to(HomePage);
			try {
				menu.click();
				System.out.println();
			}
			catch(Exception e) {
				NoThanks.click();
				menu.click();
			}
			System.out.println("All Menu options are worked as expected");
	        System.out.println();
	}
	
	public void Checkout() throws InterruptedException, IOException {
		System.out.println();
		System.out.println("Checkout Method Initiated");
			driver.navigate().to(HomePage);
			Thread.sleep(2000);
			try {
				CartPage.click();
				Thread.sleep(2000);
			}
			catch(Exception e) {
				NoThanks.click();
				CartPage.click();
				Thread.sleep(2000);
			}
			Checkout.click();
			Thread.sleep(8000);
			Guest.click();
			Thread.sleep(8000);
			EmailCP.sendKeys("jasonjerom321215@gmail.com");
			PhoneNumCP.sendKeys("6236548967");
			SubmitCP.click();
			Thread.sleep(20000);
			USA_Menu usm1 = new USA_Menu(driver);
			usm1.SSTC009();
			Thread.sleep(2000);	
			System.out.println("PASS : All Menu options are worked as expected");
	}

	public void SSTC004() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC004_";
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

	public void SSTC007() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC007_";
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

	public void SSTC008() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC008_";
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

	public void SSTC009() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC009_";
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
