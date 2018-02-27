package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new HtmlUnitDriver();
		
		
	//	WebDriver driver = new ChromeDriver(); // launch chrome
	//	driver.manage().window().maximize();
	
		
		System.out.println(driver.getTitle());
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
		System.out.println(driver.getTitle());
				
		driver.findElement(By.id("firstname")).sendKeys("Deepak");
		driver.findElement(By.name("lastname")).sendKeys("Ahuja");
		driver.findElement(By.id("address1")).sendKeys("119A, Sayers Road");
		driver.findElement(By.name("city")).sendKeys("Melbourne");
		
		Select s=new Select(driver.findElement(By.name("state")));
		s.selectByValue("CA");
		
		Select si=new Select(driver.findElement(By.name("canned")));
		si.selectByValue("2");
		
		Select dob= new Select(driver.findElement(By.name("birthdate2")));
		dob.selectByVisibleText("January");
		
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("acceptq1")).click();
		driver.findElement(By.cssSelector("#continue > span > span")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Sign in")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
