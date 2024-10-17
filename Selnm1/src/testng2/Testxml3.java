package testng2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testxml3 
{
	@Test 
	public void D() 
	{
		Reporter.log("Emojy",true);
	}

	@Test()
	public void E()
	{
		Reporter.log("Heart",true);
	}
	
	@Test()
	public void F()
	{
		Reporter.log("icon",true);
	}


}
