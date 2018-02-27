package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaCar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");


		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.expedia.com.au/");
		
		driver.findElement(By.id("tab-car-tab-hp")).click();
		
		driver.findElement(By.xpath("//*[@id=\"car-pickup-hp-car\"]")).sendKeys("Melbourne, VIC, AU");
		
		driver.findElement(By.xpath("//*[@id=\"car-dropoff-hp-car\"]")).sendKeys("Adeliade, SA, AU");
		
		WebElement locator = driver.findElement(By.xpath("//*[@id=\"car-pickup-date-hp-car\"]"));
	 	 
		String dateVal = "15-03-2018";
		
		selectDateByJS(driver, locator, dateVal);
		

		Select sel= new Select(driver.findElement(By.xpath("//*[@id=\"car-pickup-time-hp-car\"]")));
		
		sel.selectByVisibleText("10:15 am");
		 
		 
		WebElement locator1= driver.findElement(By.xpath("//*[@id=\"car-dropoff-date-hp-car\"]"));
			
		String dateVal1= "27-09-2018";
				
		selectDateByJS(driver, locator1, dateVal1);
		 
		Select sel1= new Select(driver.findElement(By.xpath("//*[@id=\"car-dropoff-time-hp-car\"]")));
		 
		sel1.selectByValue("0115AM");
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//*[@id=\"gcw-cars-form-hp-car\"]/div[7]/label/button")).click();
			
			
		}
		
		
		public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
			
		}
		 
		
		
		
		
		
		
	

	}


