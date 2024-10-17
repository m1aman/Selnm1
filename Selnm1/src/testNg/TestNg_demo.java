package testNg;
//TestNG demo, Packagename lowercase, classname uppercase
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_demo 
{
	@Test
	public void test()
	{
		Reporter.log("Hii",true);
	}

	@Test
	public void test1()
	{
		Reporter.log("Hello",true);
	}




}

