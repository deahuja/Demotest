package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

	ChromeOptions o = new ChromeOptions();
	o.addArguments("headless");
	
		
		WebDriver driver = new ChromeDriver(o); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/"); // enter URL
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("deahuja");
		driver.findElement(By.name("password")).sendKeys("ri001708");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click(); //login button
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		
	
		
	}

}
