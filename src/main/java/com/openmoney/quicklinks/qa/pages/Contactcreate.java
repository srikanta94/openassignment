package com.openmoney.quicklinks.qa.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactcreate {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


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
		
		//click on the contact icon
	    driver.findElement(By.xpath("//button[@class=\"p-2 rounded ml-2 leading-none opacity-50 ng-star-inserted\"]")).click();
	
	    //click on the add icon
		driver.findElement(By.xpath("//mat-icon[@svgicon=\"add\"]")).click();
		
		driver.findElement(By.xpath("//om-contact-form//om-contact-single-form//span[contains(@class,'button-wrapper')]/mat-icon[@svgicon='close']")).click();
		
		//click on the No button
		driver.findElement(By.xpath("//button[@class=\"mx-2 om-btn om-basic-button btn-s-sm transition ng-star-inserted\"]")).click();
		
		
		//click on the vendor check box
		driver.findElement(By.xpath("//span[contains (text(),\" Vendor \")]")).click();
	
		
		//Sendkeys to display name
		driver.findElement(By.xpath("//input[@formcontrolname=\"display_name\"]")).sendKeys("Sri");
		
		//sendkeys to contact person
		driver.findElement(By.xpath("//input[@formcontrolname=\"name\"]")).sendKeys("Sri p");
		
		//sendkeys to mobilenumber
		driver.findElement(By.xpath("//input[@formcontrolname=\"mobile_number\"]")).sendKeys("8147436879");
		
		//sendKeys to Email field
		driver.findElement(By.xpath("//input[@formcontrolname=\"email_id\"]")).sendKeys("chiku@gmail.com");
		
		//sendkeys to UPI id field
		driver.findElement(By.xpath("//input[@formcontrolname=\"vpa\"]")).sendKeys("8147272253@ybl");
		
		
		//click on the bank account details
	    driver.findElement(By.xpath("//div[contains(text(),\" Bank Account Details \")]")).click();
	    
	    //sendkeys to Beneficiary account number
	    driver.findElement(By.xpath("//input[@formcontrolname=\"beneficiary_account_number\"]")).sendKeys("1234567890");
	    
	    //sendkeys to IFSC code 
	    driver.findElement(By.xpath("//input[@formcontrolname=\"ifsc_code\"]")).sendKeys("UTIB0000333");
	    
	    Thread.sleep(3000);
	    
	  //click on the bank account details
	    driver.findElement(By.xpath("//div[contains(text(),\" Bank Account Details \")]")).click();
		
	    //click on the Address 
	    driver.findElement(By.xpath("//div[contains (text(), \" Address \")]")).click();
	    
	    //send keys to address field
	    driver.findElement(By.xpath("//input[@formcontrolname=\"address_line\"]")).sendKeys("13 Bhubaneswari layout");
	    
	    Thread.sleep(3000);
	    
	    //sendkeys to Pincode
	    driver.findElement(By.xpath("//mat-label[contains(text(),\" Pincode \")]//parent::label//parent::span//parent::div//input[@formcontrolname='pincode']")).sendKeys("560037");
	    
	  //click on the Address 
	   driver.findElement(By.xpath("//div[contains (text(), \" Address \")]")).click();
	   
	   //click on the Tax and payments
	   driver.findElement(By.xpath("//div[contains(text(),\" Tax & Payments \")]")).click();
	   
	   //send keys to PAN number
	   driver.findElement(By.xpath("//input[@formcontrolname=\"pan\"]")).sendKeys("coapp5012d");
	   
	   //send keys to TDS fiels
	   driver.findElement(By.xpath("//input[@formcontrolname=\"tds\"]")).sendKeys("18");
	   
	   Thread.sleep(300);
	   //click on the dropdown
	  WebElement element =  driver.findElement(By.xpath("//mat-label[contains(text(),\" Select Registration Type \")]//parent::label//parent::span//parent::div//mat-select"));
	   
	   element.sendKeys(Keys.DOWN);
	   
	 //click on the Tax and payments
	   driver.findElement(By.xpath("//div[contains(text(),' Tax & Payments ')]")).click();
	   
	   Thread.sleep(2000);
	   
	   //click on the Notes
	   driver.findElement(By.xpath("//div[contains(text(),' Notes ')]")).click();
	   
	   //send keys to Note field
	   driver.findElement(By.xpath("//textarea[@formcontrolname=\"notes\"]")).sendKeys("Test Vendor creation");
	   
	   //click on the save button
	   driver.findElement(By.xpath("//span[contains(text(),'SAVE')]")).click();
	   
	   
	   
	   
	 
	   
	    
	    
	    
	    
	    
	    
	    
		
		
	
	}

}
