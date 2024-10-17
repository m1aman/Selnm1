package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import All_generics.Baseclass_generic;

public class Pom_runner extends Baseclass_generic
{
@Test
void Test() throws InterruptedException
{
Pom p=new Pom(driver);
p.login2().click();;

Thread.sleep(2000);
driver.navigate().refresh();

Thread.sleep(2000);
p.login2().click();

Thread.sleep(2000);
}
}
