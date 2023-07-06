package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bvm234");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("veenapriya");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		// TODO Auto-generated method stub

	}

}
