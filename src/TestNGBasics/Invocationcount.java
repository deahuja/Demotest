package TestNGBasics;

import org.testng.annotations.Test;

public class Invocationcount {
	
	@Test(invocationCount=100) 
	public void Justprintit()
	{
		System.out.println("Wpoohoo");
	}

	@Test(expectedExceptions = NumberFormatException.class,invocationCount=10)
	public void test1(){
		String x = "100A";
		Integer.parseInt(x);
	}
}
