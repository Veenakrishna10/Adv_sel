package Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/mainpage1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("ABC");
		driver.findElement(By.xpath("//iframe[@id='f2']"));
		driver.switchTo().frame("f2");
		driver.findElement(By.id("pwd")).sendKeys("XYZ");
	}
}
