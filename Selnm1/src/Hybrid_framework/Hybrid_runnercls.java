package Hybrid_framework;
import org.testng.annotations.Test;
import All_generics.Baseclass_generic;
import pom.Pom;

public class Hybrid_runnercls extends Baseclass_generic
{
	@Test
	void test() throws InterruptedException
	{
		Thread.sleep(2000);
		Pom p=new Pom(driver);
		p.login2().click();
		Thread.sleep(2000);
	}

}
