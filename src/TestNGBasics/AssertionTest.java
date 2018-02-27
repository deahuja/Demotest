package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	
	int c;

	@Test
	public void maintestcase()
	{
	System.out.println("Main Test Case");
	int a=10;
	int b= 20;
	c=a+b;
	System.out.println("The output of maintestcase method is   "+c);
	}
	
	@Test(dependsOnMethods="maintestcase")
	public void Test1()
	{
	System.out.println("The output of child test case methid is   "+c);
	Assert.assertEquals(c, 20);
	
	}
	
	@Test(invocationCount=10) 
	public void assertiontest()
	{
		int x=10;
		int y=20;
		String str=null;
		
		
		if (x>y) 
		{   
			str="X is GREATER than Y";
			
			System.out.println(str);
		}

		else {
			str="Y is GREATER than X";
			System.out.println(str);
		}
		
		Assert.assertEquals(str, "Y is GREATER than X");
	}
	
	

}
