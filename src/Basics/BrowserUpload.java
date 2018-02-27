package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
	

		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Selenium\\test.xlsx");
		Thread.sleep(10000);
		
		String so=driver.switchTo().alert().getText();
		System.out.println(so);
		
		//driver.switchTo().alert().accept();
		
		
	//	driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

}
