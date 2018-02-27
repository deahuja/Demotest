package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
				driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		
		driver.get("https://jqueryui.com/droppable/"); // enter URL
		Thread.sleep(4000);
		
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		Actions ac=new Actions(driver);
		ac.clickAndHold(driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"))).moveToElement(driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"))).release().build().perform();
		
		
				
			

	}

}
