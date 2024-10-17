package testNg;
//Enabledfalse or Skip
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled1 
{
	@Test
	public void A() 
	{
		Reporter.log("Signup",true);
	}

	@Test(enabled = false)
	public void B()
	{
		Reporter.log("Login",true);
	}
	
	@Test
	public void C()  
	{
		Reporter.log("Likepage",true);
	}

}
