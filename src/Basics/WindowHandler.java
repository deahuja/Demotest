package Basics;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

	//	driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		Set <String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentit= it.next();
		System.out.println(parentit);
		
		
		String childit= it.next();
		System.out.println(childit);
		
		
		driver.switchTo().window(childit);
		String str=driver.getTitle();
		
		System.out.println(str);
		
		driver.close();
		
		driver.switchTo().window(parentit);
		
		String st1= driver.getTitle();
		
		System.out.println(st1);
		
		
		
		
		
		
		
	
		
		
		
	
		


	}

}
