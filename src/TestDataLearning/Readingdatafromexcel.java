package TestDataLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excel.utility.Xls_Reader;

public class Readingdatafromexcel {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
		
		

		Xls_Reader reader = new Xls_Reader("C:\\Users\\Deepak Ahuja\\New_Selnium\\SeleniumBasics\\src\\Ebaytestdata\\EbayTestData.xlsx");
		
	//	reader.addColumn("Mysheet","Status");	
		
	    int rowcount= reader.getRowCount("Mysheet");
		System.out.println(rowcount);
		
			
		
		
		for(int rown=2;rown<=rowcount;rown++)
		{
		
		System.out.println("=========================================");
		
		String firstname = reader.getCellData("Mysheet", 0, rown);
		System.out.println(firstname);
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		
		String lastname = reader.getCellData("Mysheet", 1, rown);
		System.out.println(lastname);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		
		String streetaddress = reader.getCellData("Mysheet", 2, rown);
		System.out.println(streetaddress);
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys(streetaddress);
		
		
		
		
		String streetaddress2 = reader.getCellData("Mysheet", 3, rown);
		System.out.println(streetaddress2);
		driver.findElement(By.name("address2")).clear();
		driver.findElement(By.name("address2")).sendKeys(streetaddress2);
		
		
		String City = reader.getCellData("Mysheet", 4, rown);
		System.out.println(City);
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(City);
		
		String State = reader.getCellData("Mysheet", 5, rown);
		System.out.println(State);
	   
		Select Sel=new Select (driver.findElement(By.name("state")));
		Sel.selectByVisibleText(State);
		
				
		String Zip = reader.getCellData("Mysheet", 6, rown);
		System.out.println(Zip);
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys(Zip);
		

		
		String email = reader.getCellData("Mysheet", 7, rown);
		System.out.println(email);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		
	 //   reader.setCellData("Mysheet", "Status", rown, "Pass");
		
		
	}

	}
}
