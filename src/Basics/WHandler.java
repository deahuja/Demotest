package Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.partialLinkText("Good PopUp #2")).click();
		
		Set <String> handler= driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		
		String st= it.next();
		System.out.println(st);
		
		String st1=it.next();
		System.out.println(st1);
		
		driver.switchTo().window(st1);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(st);
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
