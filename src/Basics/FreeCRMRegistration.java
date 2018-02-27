package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreeCRMRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/"); // enter URL
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		
		//driver.get("https://www.freecrm.com/"); // enter URL
		
		//driver.findElement(By.xpath("//button[@type='button' and  @class='btn']")).click();
		
		Select se=new Select(driver.findElement(By.name("payment_plan_id")));
		
		se.selectByValue("1");
		
		driver.findElement(By.name("first_name")).sendKeys("Deepak");
		driver.findElement(By.name("surname")).sendKeys("Ahuja");
		driver.findElement(By.name("email")).sendKeys("deepakahuja79@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("deepakahuja79@gmail.com");
		driver.findElement(By.name("username")).sendKeys("deahuja");
		driver.findElement(By.name("password")).sendKeys("ri001708");
		driver.findElement(By.name("passwordconfirm")).sendKeys("ri001708");
		driver.findElement(By.name("agreeTerms")).click();
		driver.findElement(By.id("submitButton")).click();
		
		String st=driver.switchTo().alert().getText();
		System.out.println(st);
		
		driver.switchTo().alert().accept();
		
	}

}
