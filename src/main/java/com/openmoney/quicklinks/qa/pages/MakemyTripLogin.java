package com.openmoney.quicklinks.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTripLogin {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
		
		//send keys to email field
		String email = "krushnachandrapanigrahy0@gmail.com";
		String password = "Login@1617";
		driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']")).sendKeys(email);
		
		Thread.sleep(2000);
		
		//click on continue
		driver.findElement(By.xpath("//button[@data-cy=\"continueBtn\" and @type ='button']//parent::div")).click();
		
		Thread.sleep(3000);
		
		//send keys to password
		//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
	}

}
