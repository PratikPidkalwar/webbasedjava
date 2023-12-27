package com.testing.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	Scanner sc=new Scanner(System.in);
        
    	System.setProperty("webdriver.chrome.drive", "C:\\Users\\HP\\Documents\\Selenium Project\\chromedriver-win64\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.swiggy.com/");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("x4bK8")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("mobile")).sendKeys("7057173289");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("a-ayg")).click();
    	Thread.sleep(2000);
    	
    	System.out.println("Enetr otp");
    	String otp=sc.next();
    	driver.findElement(By.id("otp")).sendKeys(otp);
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("a-ayg")).click();
    	Thread.sleep(2000);
    	
    	
    	
    }
}
