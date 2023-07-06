import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///E:/selenium/3links.html");
		driver.findElement(By.id("a1")).click();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.amazon.com");
		// TODO Auto-generated method stub

	}

}
