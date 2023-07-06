package Krishna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertcontains {
	@Test
	public void veri() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.id("email")).sendKeys("veenapb55@gmail.com");		
		//driver.findElement(By.id("pass")).sendKeys("veena@89");
		//driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getCurrentUrl();
		Assert.assertTrue(title.contains("flipkart"));
		System.out.println("1");
}
}
