package com.openmoney.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakemyTripTest {
	
	 WebDriver driver;

		@BeforeMethod
		public void startBrowser() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.makemytrip.com/");
			
			driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
			
			//send keys to email field
			String email = "krushnachandrapanigrahy0@gmail.com";
			String password = "Login@1617";
			driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']")).sendKeys(email);
			
			Thread.sleep(30000);
			
			//click on continue
			driver.findElement(By.xpath("//div//button//span[contains(text(),'Continue')]")).click();
			driver.findElement(By.xpath("//div//button//span[contains(text(),'Continue')]")).click();

			
			
			//sendkeys to password
			driver.findElement(By.id("password")).sendKeys("Login@1617");
			
			//click on Login button
			driver.findElement(By.xpath("//button//span[contains(text(),'Login')]")).click();
			
		}
		
		
		@Test
		public void login()
		{
			
		}

		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
}
