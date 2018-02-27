package TestDataLearning;

import excel.utility.Xls_Reader;

public class adddetailsinexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Deepak Ahuja\\New_Selnium\\SeleniumBasics\\src\\Ebaytestdata\\EbayTestData.xlsx");
		
	//	reader.addSheet("Deepak");
		
//		reader.addColumn("Deepak", "firstname");
		
		System.out.println(reader.getColumnCount("Mysheet"));
		
		
		

	}

}
