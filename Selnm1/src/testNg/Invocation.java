package testNg;
//Invocation
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation 
{
	@Test
	public void A() 
	{
		Reporter.log("Signup",true);
	}

	@Test(invocationCount = 0)
	public void B()
	{
		Reporter.log("Login",true);
	}
	
	@Test(invocationCount = 2)
	public void C()  
	{
		Reporter.log("Likepage",true);
	}
}
