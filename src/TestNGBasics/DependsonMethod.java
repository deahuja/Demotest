package TestNGBasics;

import org.testng.annotations.Test;

public class DependsonMethod {
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
		
	
	}
	
	
	}
