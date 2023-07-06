package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testrunner 
{
@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Pom1 p=new Pom1(driver);
		p.cliickLogin();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		p.cliickLogin();
	}

}
