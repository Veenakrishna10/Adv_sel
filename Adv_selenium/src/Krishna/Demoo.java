package Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoo {
	@Test
	public void disp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("veena@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("veena");
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	@Test
	public void disp1()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("veena@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("veena");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}

