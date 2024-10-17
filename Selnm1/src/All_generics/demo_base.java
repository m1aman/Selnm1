package All_generics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class demo_base 
{
	@BeforeSuite
	public void Bsuite()
	{
		System.out.println("Beforesuite executed..");
	}
	@BeforeTest
	public void Btest()
	{
		System.out.println("Beforetest executed..");
	}
	@BeforeClass
	public void Bclass()
	{
		System.out.println("Beforeclass executed..");
	}
	@BeforeMethod
	public void Bmethod()
	{
		System.out.println("Beforemethod executed..");
	}
	
	@AfterMethod
	public void Amethod()
	{
		System.out.println("Aftermethod executed..");
	}
	@AfterClass
	public void Aclass()
	{
		System.out.println("Afterclass executed..");
	}
	@AfterTest
	public void Atest()
	{
		System.out.println("Aftertest executed..");
	}
	@AfterSuite(alwaysRun = true) 
	void Asuite()
	{
		System.out.println("Aftersuite executed..");
	}
	
	
}
