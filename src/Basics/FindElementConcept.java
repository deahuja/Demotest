package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome
				driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		
driver.get("http://www.facebook.com"); //enter URL
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());

		System.out.println(linklist.get(2).getText());
		
		for (int i =0;i<linklist.size();i++)
		{
			String st= linklist.get(i).getText();
			System.out.println(st);
		}
		
		driver.close();


	}

}
