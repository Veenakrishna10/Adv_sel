package veena;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Script {
	public WebDriver driver;
	@BeforeMethod
	public void openApplcn()
	{
		System.setProperty("webdriver.chrome.driver", "/.softwares.chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@AfterMethod
public void closeApplcn()
{
	driver.close();
}
}
