package testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency1 
{
	@Test
	public void A() 
	{
		Reporter.log("Signup",true);
	}

	@Test(dependsOnMethods = "C")
	public void B()
	{
		Reporter.log("Login",true);
	}
	
	@Test(dependsOnMethods = "A")
	public void C()  
	{
		Assert.fail();
		Reporter.log("Likepage",true);
	}
}
