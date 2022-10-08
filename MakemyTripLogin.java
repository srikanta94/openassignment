package com.openmoney.quicklinks.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakemyTripLogin {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/srikanta.panigrahi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
//		//click on the logo
//		driver.findElement(By.xpath("//img[@src='//imgak.mmtcdn.com/pwa_v3/pwa_hotel_assets/header/mmtLogoWhite.png']")).click();
//		
//		//click on Flights
//		driver.findElement(By.xpath("href=\"https://www.makemytrip.com/flights/\"")).click();
//		String flightUrl = driver.getCurrentUrl();
//		System.out.println(flightUrl);
//		
//		//click on the logo
//		 driver.findElement(By.xpath("//img[@src='//imgak.mmtcdn.com/pwa_v3/pwa_hotel_assets/header/mmtLogoWhite.png']")).click();
//		
		//click on the hotels
		driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/hotels/']")).click();
		String hotelUrl = driver.getCurrentUrl();
		System.out.println(hotelUrl);
		
		//click to search field
		driver.findElement(By.xpath("//input[@id='city']")).click();
		
		//sendkeys to search field
				driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']")).sendKeys("Bangalore");
		
		//click on the Bangalore 
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore, Karnataka, India')]")).click();

		//select checkin date
		driver.findElement(By.xpath("//div[@aria-label='Tue Nov 01 2022' and @tabindex='0']")).click();
		
		//select the checkout date
		driver.findElement(By.xpath("(//div[@aria-label=\"Wed Nov 02 2022\"])[1]")).click();
		
		//select 5 Adults
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		
		
		//select 2 child
		driver.findElement(By.xpath("//li[@data-cy='children-2']")).click();
		
		//select Age for 2 child
		
		WebElement age1 = driver.findElement(By.id("0"));
		
		Select select  = new Select(age1);
		select.selectByVisibleText("3");
		
		WebElement age2 = driver.findElement(By.id("1"));
		Select select1  = new Select(age2);

		select1.selectByVisibleText("5");


		
		
		Thread.sleep(3000);
		
		//click on the addanother room
		driver.findElement(By.xpath("//button[@class='btnAddRoom' and @data-cy='addAnotherRoom']")).click();
		
		//select 2 Adults for room2
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		
		//select 1 child
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		
		WebElement age3 = driver.findElement(By.id("0"));
		
		Select select2  = new Select(age3);
        select2.selectByVisibleText("4");
		
		//Remove the Data1 
		driver.findElement(By.xpath("//a[@data-cy='removeButton-1']")).click();
		
		//click on apply
		driver.findElement(By.xpath("//button[@data-cy='submitGuest']")).click();
		
		//click on search
		driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
		
		//click on the 5star properties
		driver.findElement(By.xpath("//span[contains(text(),'5 Star Properties')]//parent::div")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//span[contains(text(),'5 Star Properties')]//parent::div")).click();

		
		//click on the first hotel
		driver.findElement(By.xpath("//div[@id='Listing_hotel_1']")).click();
		
		Set<String> handels =driver.getWindowHandles();
		
		Iterator it = handels.iterator();
		
		String parendId= (String) it.next();
		String childId= (String) it.next();
		
		driver.switchTo().window(childId);

		
		
		Thread.sleep(3000);
		//get the Hotel name
		String hotelName= driver.findElement(By.xpath("//h1[@class='font26 blackText latoBlack appendBottom10']")).getText();
		System.out.println(hotelName);
		
		Thread.sleep(3000);

		
		//click on the View this combo button
		driver.findElement(By.xpath("//button[contains (text(),'VIEW THIS COMBO') and @id='detpg_multi_view_combo']")).click();
		
		//click on book now
		driver.findElement(By.xpath("//a[@class='primaryBtn ']")).click();
		
		Thread.sleep(3000);
		
		//click on the select combo
		driver.findElement(By.xpath("//button[@id='detpg_multi_view_combo']")).click();

         Thread.sleep(3000);
		
		//click on the select combo
		driver.findElement(By.xpath("//button[@id='detpg_multi_view_combo']")).click();
	
		
		
		
		
		
		
		
		

		
		
		
	}

}
