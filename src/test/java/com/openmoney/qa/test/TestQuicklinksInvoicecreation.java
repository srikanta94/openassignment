package com.openmoney.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestQuicklinksInvoicecreation {
	
	 WebDriver driver;
	

		 

	@BeforeMethod
	public void navigteHome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.open.money/login");
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Sendkeys to username field
		driver.findElement(By.xpath("//input[@formcontrolname='login']")).sendKeys("9353150385");
		
		//sendkeys to possword field
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Login@1617");
		
		//click on the sign in button
		driver.findElement(By.xpath("//span[text()=\" Sign In \"]")).click(); 
		Thread.sleep(3000);
 
	}
	
	@Test (priority = 2)
	public void quickLinkTest()
	{
       driver.findElement(By.xpath("//img[@alt=\"Create Invoice\"]//parent::div")).click();
		
		System.out.println("Clicked Invoice note the elements");

		
		
		
		//Navigate to homepage
		driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
		
		//click on the create Bill 
		driver.findElement(By.xpath("//img[@alt=\"Create Bill\"]//parent::div")).click();
		
		System.out.println("Clicked Bill note the elements");

		
		
		
		//Navigate to homepage
				driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
		
		//click on the create Estimate
		driver.findElement(By.xpath("//img[@alt=\"Create Estimate\"]//parent::div")).click();
		
		System.out.println("Clicked Estimate note the elements");

		
		
		
		//Navigate to homepage
		driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
				
		//click on the credit note
		driver.findElement(By.xpath("//img[@alt=\"Create Debit Note\"]//parent::div")).click();
		
		System.out.println("Clicked Debit note the elements");


		
		//Navigate to homepage
		driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
		
		//click on the create Receipt
		driver.findElement(By.xpath("//img[@alt=\"Create Receipt\"]//parent::div")).click();
		
		System.out.println("Clicked receipt the elements");

		
		//Navigate to homepage
		driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
		
		//click on the create credit note
		driver.findElement(By.xpath("//img[@alt=\"Create Credit Note\"]//parent::div")).click();
		
		System.out.println("Clicked credit note the elements");

		
		//Navigate to homepage
		driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
		
		//click on the arrow button
		driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"mat-ripple mat-tab-header-pagination mat-tab-header-pagination-after mat-elevation-z4\"]")).click();
		
		//click on the Expense
		driver.findElement(By.xpath("//img[@alt=\"Expense\"]//parent::div")).click();
		
		System.out.println("Clicked Expense the elements");
		
		//Navigate to homepage
		driver.findElement(By.xpath("//img[@src=\"https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/dashboard.svg\"]")).click();
	}
	
	@Test (priority = 1)
	public void createInvoice() throws InterruptedException
	{
       
		driver.findElement(By.xpath("//img[@alt=\"Create Invoice\"]//parent::div")).click();
		
		System.out.println("Clicked Invoice note the elements");
		
		
		Thread.sleep(2000);
		
		//sendkeys to Bill to 
		driver.findElement(By.xpath("//mat-label[contains(text(),'Bill To')]//parent::label//parent::span//parent::div//input[@type='text']")).click();
		
		driver.findElement(By.xpath("//mat-label[contains(text(),'Bill To')]//parent::label//parent::span//parent::div//input[@type='text']")).sendKeys("chiku");

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(5000);
		//click on the contact passed
		driver.findElement(By.xpath("//div[@class=\"text-sm mb-0.5\"]")).click();
		
		String refId= "12348";
		
		//send keys to ref id
		driver.findElement(By.xpath("//mat-label[contains(text(),'Ref ID #')]//parent::label//parent::span//parent::div//input[@type='text']")).sendKeys(refId);
		
		
		Thread.sleep(2000);
		//send keys to invoice description
		driver.findElement(By.xpath("//textarea[@formcontrolname=\"description\"]")).sendKeys("Invoice for Chiku");
		
		//click on the item dropdown
		driver.findElement(By.xpath("//input[@placeholder=\"Select Item\"]")).click();
		
		Thread.sleep(1000);
		//click on the mobile product
		driver.findElement(By.xpath("//div[contains(text(),'mobile')]")).click();

		//sendkeys to Discription
		driver.findElement(By.xpath("//textarea[@placeholder=\"Description\"]")).sendKeys("Mobile");
		
		//click on Save button
		driver.findElement(By.xpath("//button[@id='om_sales_saveinvoice_create']")).click();
		
		Thread.sleep(2000);
		
		//click on the sales icon
		driver.findElement(By.xpath("//img[@src='https://open-frontend-bucket.s3.amazonaws.com/open-money/navigations/sales.svg']")).click();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
