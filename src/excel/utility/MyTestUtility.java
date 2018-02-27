package excel.utility;

import java.util.ArrayList;

public class MyTestUtility {

	static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> ReadTestDataFromExcel()
	{
	    ArrayList<Object[]> MyData= new ArrayList<Object[]>();
	      
	    
		reader= new Xls_Reader("C:\\Users\\Deepak Ahuja\\New_Selnium\\SeleniumBasics\\src\\Ebaytestdata\\EbayTestData.xlsx");
		
		int rowcount = reader.getRowCount("Mysheet");
		System.out.println(rowcount);
		
		for (int rown=2;rown<=rowcount;rown++)
			
		{
			String fn = reader.getCellData("Mysheet", 0, rown);
			String ln = reader.getCellData("Mysheet", 1, rown);
			String ad1 = reader.getCellData("Mysheet", 2, rown);
			String ad2 = reader.getCellData("Mysheet", 3, rown);
			String city = reader.getCellData("Mysheet", 4, rown);
			String state = reader.getCellData("Mysheet", 5, rown);
			String zip = reader.getCellData("Mysheet", 6, rown);
			String email = reader.getCellData("Mysheet", 7, rown);
			
			Object[] O = {fn,ln,ad1,ad2,city,state,zip,email};
			MyData.add(O);
			
			
			
		}
		return MyData;
		
	}
	}

