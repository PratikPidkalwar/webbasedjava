package SeleniumTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class DemoTesting 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "E:\\CDAC2364\\SDM\\SDLC\\Automation Testing\\chromedriver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.apple.com/");
        
        Thread.sleep(500);
        
        driver.manage().window().maximize();
        
        Thread.sleep(500);
        
        driver.findElement(By.className("globalnav-link globalnav-submenu-trigger-link globalnav-link-iphone")).click();
        
    }
}
