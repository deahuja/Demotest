package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
driver.manage().window().maximize(); // maximize window
driver.manage().deleteAllCookies(); // delete all the cookies


driver.get("http://www.spicejet.com/"); // enter URL
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
/*
Actions a= new Actions(driver);

a.moveToElement(driver.findElement(By.partialLinkText("MENU"))).build().perform();
Thread.sleep(3000);

a.moveToElement(driver.findElement(By.partialLinkText("Travel Info"))).build().perform();
Thread.sleep(3000);

driver.findElement(By.partialLinkText("Carriage of Live Animals")).click();
*/

Actions act= new Actions(driver);

act.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();

Thread.sleep(2000);
act.moveToElement(driver.findElement(By.partialLinkText("SpiceCash/SpiceClub Members"))).build().perform();
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Member Login")).click();



	}

}
