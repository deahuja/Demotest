package TestDataLearning;

import excel.utility.Xls_Reader;

public class TestDatafromHalfEbay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader read= new Xls_Reader("C:\\Users\\Deepak Ahuja\\New_Selnium\\SeleniumBasics\\src\\Ebaytestdata\\EbayTestData.xlsx");
		
		String firstname= read.getCellData("Mysheet", 0, 2 );
		System.out.println(firstname);
		
	    String lastname = read.getCellData("Mysheet", 1, 2);
		System.out.println(lastname);
		
		String streetaddress = read.getCellData("Mysheet", 2, 2);
		System.out.println(streetaddress);
		
		String streetaddress2 = read.getCellData("Mysheet", 3, 2);
		System.out.println(streetaddress2);
		
		String City = read.getCellData("Mysheet", 4, 2);
		System.out.println(City);
		
		String State = read.getCellData("Mysheet", 5, 2);
		System.out.println(State);
		
		String Zip = read.getCellData("Mysheet", 6, 2);
		System.out.println(Zip);
		
		String email = read.getCellData("Mysheet", 7, 2);
		System.out.println(email);
		
		
	}

}
