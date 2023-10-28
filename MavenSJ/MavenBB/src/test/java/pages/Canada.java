package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Canada {
		WebDriver driver;
		
		public Canada (WebDriver driver) {
			this.driver=driver;
		}
		By acc = By.xpath("//span[text()='Account']");
		By user = By.xpath("//input[@id='username']");
		By pass = By.xpath("//input[@id='password']");
		By show = By.xpath("//span[text()='Show']");
		By signin = By.xpath("//span[@class='GSYpm']");
		
		By shop = By.xpath("//span[@data-automation='x-shop']");
		By LGT = By.xpath("//a[@title='Latest and Greatest Tech']");
		By pix2 = By.xpath("//a[text()='Google Pixel Watch 2']");
		
		By UAE = By.xpath("//span[@data-automation='x-ultimate-appliance event']");
		By Refri = By.xpath("//a[text()='Refrigerator Deals']");
		By OBA = By.xpath("//a[text()='Open Box Appliances']");
		
		By Deal = By.xpath("//span[@data-automation='x-deals']");
		By TD = By.xpath("//a[text()='Top Deals']");
		By PCgame = By.xpath("//a[text()='PC Gaming Sale']");
		
		By search = By.xpath("//input[@type='search']");
		By Submit = By.xpath("//button[@class='searchButton_2mES- fitContainer_2HpHA']");
		By ApplePowerBank = By.xpath("//img[@alt='Apple MagSafe Battery Pack']");
		By ApplePowerBank1 = By.xpath("//div[text()='Apple MagSafe Battery Pack']");
		By cart = By.xpath("//span[@class='content_LFMVU'][1]");
		
		
		public void Acc() throws InterruptedException {
			driver.findElement(acc).click();
			driver.findElement(user).click();
			driver.findElement(user).sendKeys("asdfg@gmail.com");
			driver.findElement(pass).click();
			driver.findElement(pass).sendKeys("asfgr@12365");
			driver.findElement(show).click();
			driver.findElement(signin).click();	
			}
		
		public void shop(){
			driver.findElement(shop).click();
			System.out.println();
			String ExpTitle =  "Best Buy: Shop Online For Deals & Save | Best Buy Canada";
	        System.out.println("Expected URL Title : "+ ExpTitle);
	        String ActTitle = driver.getTitle();
	                System.out.println("Actual URL Title : "+ ActTitle);
	        if(ActTitle.equals(ExpTitle)){
	            System.out.println("Title of the page is as expected");
	        }
	        else{
	            System.out.println("Title of the page is not as expected.");
	        }
	        System.out.println();
	        
			driver.findElement(LGT).click();
			try{
				driver.findElement(pix2).click();				
			}
			catch(Exception e) {
				System.out.println("Dynamic Element");
			}
		}
		
		public void UltimateApplianceEvent(){
			driver.findElement(UAE).click();
			
			System.out.println();
			String ExpTitle =  "Best Buy: Shop Online For Deals & Save | Best Buy Canada";
	        System.out.println("Expected URL Title : "+ ExpTitle);
	        String ActTitle = driver.getTitle();
	                System.out.println("Actual URL Title : "+ ActTitle);
	        if(ActTitle.equals(ExpTitle)){
	            System.out.println("Title of the page is as expected");
	        }
	        else{
	            System.out.println("Title of the page is not as expected.");
	        }
	        System.out.println();
	        
			driver.findElement(Refri).click();
			driver.navigate().back();
			driver.findElement(UAE).click();
			driver.findElement(OBA).click();			
		}
		
		public void Deal(){
			driver.findElement(Deal).click();
			
			System.out.println();
			String ExpTitle =  "Best Buy: Shop Online For Deals & Save | Best Buy Canada";
	        System.out.println("Expected URL Title : "+ ExpTitle);
	        String ActTitle = driver.getTitle();
	                System.out.println("Actual URL Title : "+ ActTitle);
	        if(ActTitle.equals(ExpTitle)){
	            System.out.println("Title of the page is as expected");
	        }
	        else{
	            System.out.println("Title of the page is not as expected.");
	        }
	        System.out.println();
	        
			driver.findElement(TD).click();
			driver.navigate().back();
			driver.findElement(Deal).click();
			driver.findElement(PCgame).click();	
		}
		
		public void Search() throws InterruptedException{
			driver.findElement(search).click();
			driver.findElement(search).sendKeys("Apple MegSafe Battery Pack");
			driver.findElement(Submit).click();
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
				driver.findElement(ApplePowerBank1).click();
				Thread.sleep(5000);

			}
			catch(Exception e) {
				System.out.println("Unable to click");
			}
			try {
				Thread.sleep(5000);
				driver.findElement(cart).click();
				Thread.sleep(5000);

			}
			catch(Exception e) {
				System.out.println("Unable to click the button");
			}
			
//			driver.findElement(cart).click();
			
		}
}

