package com.openmoney.quicklinks.qa.pages;
import com.openmoney.quicklinks.qa.pages.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickLinks {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
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

}
