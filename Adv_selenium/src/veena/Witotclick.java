package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Witotclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/select.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		// TODO Auto-generated method stub

	}

}
