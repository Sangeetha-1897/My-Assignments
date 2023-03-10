package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrakumar");
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop1=new Select(source);
	drop1.selectByVisibleText("Website");
	WebElement marketingCampaignId=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select drop2=new Select(marketingCampaignId);
drop2.selectByValue("9001");
WebElement ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select drop3=new Select(ownershipEnumId);
drop3.selectByIndex(4);
WebElement generalCountryGeoId =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select drop4=new Select(generalCountryGeoId);
drop4.selectByVisibleText("India");
driver.findElement(By.name("submitButton")).click();
System.out.println(driver.getTitle());
driver.close();

}}
