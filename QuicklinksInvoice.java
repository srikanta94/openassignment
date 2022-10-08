package com.openmoney.quicklinks.qa.pages;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuicklinksInvoice {
	
	 static WebDriver driver;
	
	
//	public static void takeScreenshot(String fileName) throws IOException
//
//	{
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(file, new File("/Users/srikanta.panigrahi/eclipse-workspace/openapplicationtest/src/main/java/"
//				+ "com/openmoney/quicklinks/qa/pages" + fileName +".jpg"));
//		
//		
//		
//		
//	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.open.money/login");
		//Thread.sleep(10000);
		
		//Sendkeys to username field
		driver.findElement(By.xpath("//input[@formcontrolname='login']")).sendKeys("9353150385");
		
		//sendkeys to possword field
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Login@1617");
		
		//click on the sign in button
		driver.findElement(By.xpath("//span[text()=\" Sign In \"]")).click();
		Thread.sleep(10000);

		//Get the home page URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//click on the create invoice
		driver.findElement(By.xpath("//img[@alt=\"Create Invoice\"]//parent::div")).click();
		
		System.out.println("Clicked Invoice note the elements");
		
		
		Thread.sleep(2000);
		
		//get invoice number
		String invoiceNumber= driver.findElement(By.xpath("//input[@formcontrolname='invoice_sequence_id']")).getText();
		System.out.println(invoiceNumber);
		
		//sendkeys to Bill to 
		driver.findElement(By.xpath("//mat-label[contains(text(),'Bill To')]//parent::label//parent::span//parent::div//input[@type='text']")).click();
		
		driver.findElement(By.xpath("//mat-label[contains(text(),'Bill To')]//parent::label//parent::span//parent::div//input[@type='text']")).sendKeys("chiku");

		
		Thread.sleep(5000);
		//click on the contact passed
		driver.findElement(By.xpath("//div[@class=\"text-sm mb-0.5\"]")).click();
		
		String refId= "12345";
		
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
		
		//redirect to homepage
		driver.get("https://app.open.money/receivables/dashboard");
	}

}
