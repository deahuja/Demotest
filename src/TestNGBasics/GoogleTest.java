package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	

	@BeforeMethod
	public void Googlelauncher()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.google.com/"); // enter URL
	}
	
	@Test(priority=1, groups="love")
	public void GoogleTitle()
	{
		System.out.println(driver.getTitle());
			
	}
	
	@Test(priority=2, groups="love")
	public void Displayed()
	{
		boolean b = driver.findElement(By.xpath("//input[@value='Google Search']")).isDisplayed();
		System.out.println("Google Search is Displayed  "+ b);
	}
	
	@Test(priority=2, groups="Valentine")
	public void Test1()
	{
		
		System.out.println("This is Test Case 1");
	}
	
	
	@Test(priority=2, groups="Valentine")
	public void Test2()
	{
		
		System.out.println("This is Test Case 2");
	}
	
	
	
	
	
	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}
	
	
	
	
	
	
}
	

