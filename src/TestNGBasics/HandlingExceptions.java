package TestNGBasics;

import org.testng.annotations.Test;

public class HandlingExceptions {
	
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1(){
		String x = "100A";
		Integer.parseInt(x);
	}

	
	@Test(expectedExceptions=NumberFormatException.class)
	public void handingexception()
	
	{
		String m = "2000MNOP";
	    Double.parseDouble(m);
	
	    
	}
}
