package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleardata {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/clearvv.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).clear();
		Thread.sleep(2000);
		driver.close();
		// TODO Auto-generated method stub

	}
}
