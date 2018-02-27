package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Readingmailandpassword {
	
	@Test
	@Parameters({"email","password","url"})
	
	public void checkingreading(String email,String password, String url) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(url); // enter URL
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
		
		
	}
	
	}


