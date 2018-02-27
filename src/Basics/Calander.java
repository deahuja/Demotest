package Basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calander {

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
		
		driver.findElement(By.name("username")).sendKeys("deahuja");
		driver.findElement(By.name("password")).sendKeys("ri001708");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click(); //login button
		
		driver.switchTo().frame("mainpanel");
		String date="14-March-2019";
		String[] Array = date.split("-");
		String day =Array[0];
		String month = Array[1];
		String year=Array[2];
		
		System.out.println(day+month+year+ "############");
		
		
		Thread.sleep(4000);
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1= new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
			
		
		Thread.sleep(3000);
		String BeforeXpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String AfterXpath="]/td[";
		boolean flag = false;
		
		int rown;
		int maxrow=6;
		String Val = null;
		int coln;
		
		for (rown=2; rown<=maxrow; rown++)
		{ 
			Thread.sleep(300);
			for (coln=1; coln<=7; coln++)
			{
	
				Val= driver.findElement(By.xpath(BeforeXpath+rown+AfterXpath+coln+"]")).getText();
				System.out.println(Val);
					
			if (Val.equals(day))
					{
				
				driver.findElement(By.xpath(BeforeXpath+rown+AfterXpath+coln+"]")).click();
				flag=true;
				break;
				
					}
			}
		
		
		if(flag){
			break;
		}
		
	
	}
 }
}


		

		

	


