package testNg;
//Priority
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 
{
	@Test //Priority=0
	public void A() //Alphabetically prior
	{
		Reporter.log("Signup",true);
	}

	@Test(priority = 1)
	public void B()
	{
		Reporter.log("Login",true);
	}
	
	@Test(priority = 0)
	public void C()  //Priority=0
	{
		Reporter.log("Likepage",true);
	}

}
