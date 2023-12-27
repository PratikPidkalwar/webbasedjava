package com.testing.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "C:\\Users\\HP\\Documents\\Selenium Project\\chromedriver-win64\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.flipkart.com/");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("_30XB9F")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("Pke_EE")).sendKeys("HP Pavelian");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("_2iLD__")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("_4rR01T")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("_1_3w1N")).click();
    	Thread.sleep(2000);
    	

    	
	}

}
