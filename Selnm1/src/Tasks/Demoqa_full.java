package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa_full 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@ placeholder='First Name']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@ placeholder='Last Name']")).sendKeys("def");
		driver.findElement(By.xpath("//input[@ placeholder='name@example.com']")).sendKeys("abc@gmail.com");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.xpath("//input[@ placeholder='Mobile Number']")).sendKeys("9999988888");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ id='dateOfBirthInput']")).click();
		Thread.sleep(1000);
		WebElement yr = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s= new Select(yr);
		s.selectByVisibleText("1994");
		Thread.sleep(2000);
		WebElement mt = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s1= new Select(mt);
		s1.selectByVisibleText("January");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label ='Choose Wednesday, January 26th, 1994']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id ='subjectsInput']")).sendKeys("Maths",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[. ='Sports']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id ='uploadPicture']")).sendKeys("C:\\Users\\Nagendra Kr Ojha\\Desktop\\Z\\Turtle MSedge.jfif");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("abcabc1");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Select State']")).sendKeys("Haryana");
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[.='Submit']")).click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
