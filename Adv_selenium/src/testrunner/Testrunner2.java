package testrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericsript.GenericScript;
import pom.Pom2;

public class Testrunner2 extends GenericScript{
	@Test
	public void test1()
	{
		Pom2 p=new Pom2(driver);
		p.passUN("veena");
		p.passPwd("priya");
		p.btn();
}
	

}
