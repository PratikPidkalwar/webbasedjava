package SeleniumTestProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyWebsiteTesting {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);		
		
        System.setProperty("webdriver.chrome.driver", "E:\\CDAC2364\\SDM\\SDLC\\Automation Testing\\chromedriver\\chromedriver.exe");

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.className("x4bK8")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("mobile")).sendKeys("7066929406");
		
		
		/*Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("Harish");
		
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("kuteharish0703@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
		System.out.println("Enter the Otp");
		Scanner sc = new Scanner(System.in);
		String otp = sc.next();
		Thread.sleep(5000);
		driver.findElement(By.name("otp")).sendKeys(otp);
		
		Thread.sleep(3000);
		driver.findElement(By.className("a-ayg")).click();*/
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
		Thread.sleep(1000);
		String otp = sc.next();
		
		Thread.sleep(1000);
		driver.findElement(By.name("otp")).sendKeys(otp);
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
//		Thread.sleep(1000);
//		driver.findElement(By.className("_8pSp-")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("location")).sendKeys("400034");
		
		
		Thread.sleep(1000);
		driver.findElement(By.className("_3iFC5")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("sc-dcJsrY kMlaev")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("sc-dcJsrY kMtDjj")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("_1RPOp")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("mmytI")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.className("styles_viewCart__32FxP")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.className("_3PNwl")).click();
		
		
//		Thread.sleep(1000);
//		driver.findElement(By.className("_3PNwl")).click();
		
	}
}