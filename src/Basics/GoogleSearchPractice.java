package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");


		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("http://www.google.com");
		
		
		driver.findElement(By.id("lst-ib")).sendKeys("Deepak Ahuja");
		
	List <WebElement> linklist=	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	
	System.out.println("The Size of linklist is  "+linklist.size());
	
	for (int i = 0; i<linklist.size();i++)
	{
	System.out.println(linklist.get(i).getText());
	}
				
	for (int i = 0; i<linklist.size();i++)
	{
	System.out.println(linklist.get(i).getText());
	
	if(linklist.get(i).getText().contains("deepak ahuja bio"))
		{
		linklist.get(i).click();
		break;
		}
	
		
		}		
	
	
		
	}

}
