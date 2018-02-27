package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
	

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		
		
		driver.findElement(By.name("proceed")).click();
		
		String alert= driver.switchTo().alert().getText();
		
		System.out.println(alert);
		
		if (alert.equals("Please enter a valid user name"))
		{
			System.out.println("Test Case Passed");
			
		} else {
			
			System.out.println("Test Case Failed");
			
		}
		
	 Thread.sleep(5000);
		
	
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
		
	}

}
