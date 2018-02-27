package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
				driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		
		driver.get("http://www.spicejet.com/"); // enter URL
		
		Thread.sleep(4000);
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Hot Meals")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_CONTACTEMAIL1\"]")).sendKeys("deepakahuja79@gmail.com");
			
		
		
		
		

	}

}
