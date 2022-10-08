package com.openmoney.qa.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MakemyTripTest {
	
	public static WebDriver driver;
	 
	 
	 public static void takeFullPageScreenshot() throws IOException {
	     File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	     FileHandler.copy(source, new File("/Users/srikanta.panigrahi/eclipse-workspace/openapplicationtest/src/main/java/screenshots"));
	}
	

		@BeforeMethod
		public void startBrowser() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.makemytrip.com/");
			
			
			takeFullPageScreenshot();

			
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
		public static void login() throws IOException
		{
			takeFullPageScreenshot();
			
		}

		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
}
