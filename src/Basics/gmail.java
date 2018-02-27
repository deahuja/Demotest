package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//WebDriver driver= new HtmlUnitDriver();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

WebDriver driver = new ChromeDriver(); // launch chrome
driver.manage().window().maximize(); // maximize window
driver.manage().deleteAllCookies(); // delete all the cookies

		
   driver.get("http://gmail.com"); // enter URL
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepakahuja79@gmail.com");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ri00170823");
		
		Thread.sleep (2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(9000);
		
		for (int i=0;i<=10;i++)
		{
		
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		
	///	driver.findElement(By.partialLinkText("COMPOSE")).click();
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("himanshudutta@gmail.com");
		
		driver.findElement(By.name("subjectbox")).sendKeys("Checking looping   "+ i);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();

		}				

	}

}
