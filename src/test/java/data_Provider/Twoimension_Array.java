package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Twoimension_Array {
	@Test(dataProvider="getarray")
	public void data(String S1, String S2)
	{
		System.out.println(S1+" "+S2);
	}
	
@DataProvider
public Object[][] getarray()
{
	Object[][] obj=new Object[5][2];
	
	obj[0][0]="us1";
	obj[0][1]="psd1";
	
	obj[1][0]="us2";
	obj[1][1]="psd2";
	
	obj[2][0]="us3";
	obj[2][1]="psd3";
	
	obj[3][0]="us4";
	obj[3][1]="psd4";
	
	obj[4][0]="us5";
	obj[4][1]="psd5";
	
	obj[4][0]="us1";
	obj[4][1]="psd1";
	
	return obj;
	
}
}
