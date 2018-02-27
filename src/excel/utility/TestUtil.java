package excel.utility;


import java.util.ArrayList;

//import com.excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getDataFromExcel(){

			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
			try {
				reader= new Xls_Reader("C:\\Users\\Deepak Ahuja\\New_Selnium\\SeleniumBasics\\src\\Ebaytestdata\\EbayTestData.xlsx");
		
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			for (int rowNum = 2; rowNum <= reader.getRowCount("Mysheet"); rowNum++) {
				
					String firstName = reader.getCellData("Mysheet", "firstname", rowNum);
					String lastName = reader.getCellData("Mysheet", "lastname", rowNum);
					String address1 = reader.getCellData("Mysheet", "address1", rowNum);
					String address2 = reader.getCellData("Mysheet", "address2", rowNum);
					String city = reader.getCellData("Mysheet", "city", rowNum);
					String state = reader.getCellData("Mysheet", "state", rowNum);
					String zipCode = reader.getCellData("Mysheet", "zipcode", rowNum);
					String emailAddress = reader.getCellData("Mysheet", "emailaddress", rowNum);

					Object ob[] = {firstName, lastName, address1, address2, city, state, zipCode, emailAddress};
					myData.add(ob);
					
					
					
			}
			return myData;
		
	}
	
	
	
	

}
