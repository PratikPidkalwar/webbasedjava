package com.testing.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "C:\\Users\\HP\\Documents\\Selenium Project\\chromedriver-win64\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.youtube.com/");
    	Thread.sleep(2000);
    	driver.findElement(By.name("search_query")).sendKeys("never gonna give you up");
    	Thread.sleep(2000);
    	driver.findElement(By.id("search-icon-legacy")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("After installation, restart browser or open website in new tab.")).click();
    	Thread.sleep(2000);
    	
	}

}
