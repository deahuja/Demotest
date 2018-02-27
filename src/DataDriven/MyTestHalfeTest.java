package DataDriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.utility.MyTestUtility;

public class MyTestHalfeTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
	driver = new ChromeDriver(); // launch chrome
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
		
	}
	
	@DataProvider
	public Iterator<Object[]> gettestdata()
	{
	ArrayList<Object[]> getData= MyTestUtility.ReadTestDataFromExcel();
	return getData.iterator();
	
	}
	
	
	@Test(dataProvider="gettestdata")
	public void Actualwork(String fn, String ln, String ad1, String ad2, String city, String state, String zip, String email)
	{
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(ad1);
	System.out.println(ad2);
	System.out.println(city);
	System.out.println(state);
	System.out.println(zip);
	System.out.println(email);
		
	//enter data:
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(fn);
			
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(ln);
			
			driver.findElement(By.xpath("//*[@id='address1']")).clear();
			driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(ad1);
			
			driver.findElement(By.xpath("//*[@id='address1']")).clear();
			driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(ad2);
			
			driver.findElement(By.xpath("//*[@id='city']")).clear();
			driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);

			Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
			select.selectByVisibleText(state);
			
			driver.findElement(By.xpath("//*[@id='zip']")).clear();
			driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zip);
			
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
			
			driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
			driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(email);
	
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
	
	
	
	
	}


