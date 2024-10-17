package testng3;
//Running multiple classes in different packages
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testxml2 
{
	@Test 
	public void D() 
	{
		Reporter.log("Comment",true);
	}

	@Test()
	public void E()
	{
		Reporter.log("Share",true);
	}
	
	@Test()
	public void F()
	{
		Reporter.log("Message",true);
	}

	
}
