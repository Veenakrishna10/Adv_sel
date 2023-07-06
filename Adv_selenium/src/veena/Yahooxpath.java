package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahooxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@ class='_yb_1bu8o'and text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("veenakrishna10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Agastya@21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("veenakrishna10@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("hi veena");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(2000);
		
		// TODO Auto-generated method stub

	}

}
