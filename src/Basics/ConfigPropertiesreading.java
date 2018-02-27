package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigPropertiesreading {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		Properties prop = new Properties();
		
		
		FileInputStream ip= new FileInputStream("C:\\Users\\Deepak Ahuja\\New_Selnium\\SeleniumBasics\\src\\Basics\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies
		
		String st= prop.getProperty("URL");
		driver.get(st);

				
		//   driver.get("http://gmail.com"); // enter URL
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("username"));
				
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
				
				Thread.sleep (2000);
				
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
				
			

	}

}
