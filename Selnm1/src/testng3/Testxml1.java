package testng3;
//Running multiple classes in different packages
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testxml1 
{
	@Test 
	public void A() 
	{
		Reporter.log("Signup",true);
	}

	@Test()
	public void B()
	{
		Reporter.log("Login",true);
	}
	
	@Test()
	public void C()  //Priority=0
	{
		Reporter.log("Likepage",true);
	}

	
}
