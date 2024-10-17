package Sshot_generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss_generic 
{
	static String path="C:\\Users\\Nagendra Kr Ojha\\Desktop\\SS\\";
	static String format= ".jpeg";
	
	public static void ssgeneric(WebDriver driver)
	{
		Date d= new Date();
		String d2 = d.toString();
		String date=d2.replace(":", "-");
		
		try
		{
			TakesScreenshot t=(TakesScreenshot)driver;
			File img = t.getScreenshotAs(OutputType.FILE);
			File target = new File(path+date+format);
			FileHandler.copy(img, target);
		}
		catch (Exception e) 
		{
			System.out.println("File not found");
		}
	}
}
