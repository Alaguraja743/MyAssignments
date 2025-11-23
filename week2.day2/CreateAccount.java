package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click(); 
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Alagu");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industryName = driver.findElement(By.name("industryEnumId"));
	    Select industry = new Select(industryName);
	    industry.selectByVisibleText("Computer Software");
	    
	    WebElement ownershipName = driver.findElement(By.name("ownershipEnumId"));
	    Select ownership = new Select(ownershipName);
	    ownership.selectByVisibleText("S-Corporation");
	    
	    WebElement sourceName = driver.findElement(By.id("dataSourceId"));
	    Select source = new Select(sourceName);
	    source.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement marketingName = driver.findElement(By.id("marketingCampaignId"));
	    Select marketing = new Select(marketingName);
	    marketing.selectByIndex(6); 
	    
	    WebElement stateName = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select state = new Select(stateName);
	    state.selectByValue("TX");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.close();
	    
	    

	}

}
