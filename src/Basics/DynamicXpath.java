package Basics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicXpath {

public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		
		
		driver.get("http://www.google.com/"); // enter URL
		Thread.sleep(1000);
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
				
	//	By locator = By.cssSelector("article");
		// By locator = By.xpath("//*[@id='custom-block-grid']/div/ul/div[1]/li");
		
		By locator = By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']");
		
		List<WebElement> list = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		System.out.println(list.size());
		
	//	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		
	//	System.out.println("Size of list is  " + list.size());
		
	for (int i=0;i<list.size();i++)
			
		{
			System.out.println(list.get(i).getText());
			
	
			
			if(list.get(i).getText().contains("java spice"))
			{
				list.get(i).click();
				break;
			}
			
	
					}
	
	driver.findElement(By.partialLinkText("Order Take-Away")).click();
	
	

	}

}
