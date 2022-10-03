package com.openmoney.qa.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	

	
	public static void login() throws InterruptedException
	{
	
	
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
	
	}

	public  static void main(String[] args) throws InterruptedException
	{
		Base b = new Base();
		b.login();
		
		
	}



}
