package testng1;

import org.testng.annotations.Test;

public class Dptest {

	
	@Test(dataProvider = "insertdata" ,dataProviderClass = testng1.Dpclass.class)
	public void testdata1(String a, String b) {
		System.out.println(a+"  "+b);
		
	}
	
	
	
	
	
	
	
}
