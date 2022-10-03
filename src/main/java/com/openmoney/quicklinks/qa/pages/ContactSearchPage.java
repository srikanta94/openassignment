package com.openmoney.quicklinks.qa.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.openmoney.qa.base.Base;

public class ContactSearchPage extends Base{
	
	public static WebDriver driver;
	
	public static void contactSearch() throws InterruptedException
	
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
		Thread.sleep(10000);

		//Get the home page URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
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

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		ContactSearchPage.contactSearch();
		
	}

}
