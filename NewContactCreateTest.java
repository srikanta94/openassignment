package com.openmoney.qa.test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewContactCreateTest {
	
	 WebDriver driver;

		@BeforeMethod
		public void startBrowser() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://app.open.money/login");
			
			//Sendkeys to username field
			driver.findElement(By.xpath("//input[@formcontrolname='login']")).sendKeys("9353150385");
			
			//sendkeys to possword field
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Login@1617");
			
			//click on the sign in button
			driver.findElement(By.xpath("//span[text()=\" Sign In \"]")).click();
		}
		
		@Test(priority=1)
		public void newContactTest() throws InterruptedException {
			//click on the contact icon
		    driver.findElement(By.xpath("//button[@class=\"p-2 rounded ml-2 leading-none opacity-50 ng-star-inserted\"]")).click();
		
		    //click on the add icon
			driver.findElement(By.xpath("//mat-icon[@svgicon=\"add\"]")).click();
			
			driver.findElement(By.xpath("//om-contact-form//om-contact-single-form//span[contains(@class,'button-wrapper')]/mat-icon[@svgicon='close']")).click();
			
			//get Text from the pop up
			String popUpText = driver.findElement(By.xpath("//p[contains(text(),'Are You Sure ?')]")).getText();
			System.out.println(popUpText);
			
			String expectedPopUpText = "Are You Sure ?";
			
			Assert.assertEquals(expectedPopUpText, popUpText);
			

			
			
			//get detailed text from the pop up
			String detailPopupText =driver.findElement(By.xpath("//div[contains(text(),'Seems like you have filled some data in the form, Are you sure that you want to close this ?')]")).getText();
			System.out.println(detailPopupText);
			
            String expecteddetailPopupText = "Seems like you have filled some data in the form, Are you sure that you want to close this ?";
			
			Assert.assertEquals(expecteddetailPopupText, detailPopupText);
			
			assertEquals(detailPopupText, "Seems like you have filled some data in the form, Are you sure that you want to close this ?");
			
			//click on the No button
			driver.findElement(By.xpath("//button[@class=\"mx-2 om-btn om-basic-button btn-s-sm transition ng-star-inserted\"]")).click();
			
			
			//click on the vendor check box
			driver.findElement(By.xpath("//span[contains (text(),\" Vendor \")]")).click();
		
			
			//Sendkeys to display name
			driver.findElement(By.xpath("//input[@formcontrolname=\"display_name\"]")).sendKeys("Krushna");
			
			//sendkeys to contact person
			driver.findElement(By.xpath("//input[@formcontrolname=\"name\"]")).sendKeys("Krushna p");
			
			//sendkeys to mobilenumber
			driver.findElement(By.xpath("//input[@formcontrolname=\"mobile_number\"]")).sendKeys("8147436878");
			
			//sendKeys to Email field
			driver.findElement(By.xpath("//input[@formcontrolname=\"email_id\"]")).sendKeys("kra@gmail.com");
			
			//sendkeys to UPI id field
			driver.findElement(By.xpath("//input[@formcontrolname=\"vpa\"]")).sendKeys("8147272253@ybl");
			
			
			//click on the bank account details
		    driver.findElement(By.xpath("//div[contains(text(),\" Bank Account Details \")]")).click();
		    
		    //sendkeys to Beneficiary account number
		    driver.findElement(By.xpath("//input[@formcontrolname=\"beneficiary_account_number\"]")).sendKeys("1234567891");
		    
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
		@Test(priority=2)
		public void contactSearch() throws InterruptedException
		{
			//click on the contact icon
		    driver.findElement(By.xpath("//button[@class=\"p-2 rounded ml-2 leading-none opacity-50 ng-star-inserted\"]")).click();
		    
		    //sendkeys to contact search field
		    driver.findElement(By.xpath("//input[@formcontrolname='search']")).sendKeys("abu");
		    
		    Thread.sleep(2000);
		    
		    //click on the three dots
		    driver.findElement(By.xpath("//button[@class=\"mat-menu-trigger om-btn om-flat-button om-btn-icon om-btn-round btn-c-light btn-s-sm transition\"]//mat-icon")).click();
		
		    //click on the View button
		    driver.findElement(By.xpath("//button[contains(text(),'View')]")).click();
		    
		    //Get the bank account details
		    String text = driver.findElement(By.xpath("//h3[contains(text(),'Bank Account Details')]")).getText();
		    System.out.println(text);
		    
		    //Get the Account number
		   String accountnumber = driver.findElement(By.xpath("//div[contains(text(),' 36361629257 ')]")).getText();
		   
		   System.out.println("Account Number " + accountnumber);
		   
		   //Get IFSC code
		  String ifsc= driver.findElement(By.xpath("//div[@class=\"grid grid-cols-2 py-2 ng-star-inserted\"]//div[contains(text(),'ICIC0000104')]")).getText();
		  System.out.println("IFSC code is " + ifsc);
		}
		
		@AfterMethod
		public void quitBrowser() {
			driver.quit();
		}

}
