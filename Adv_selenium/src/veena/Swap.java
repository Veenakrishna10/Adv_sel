package veena;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///E:/selenium/swap.html");
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.id("a"));
			ele.sendKeys(Keys.CONTROL+"ax");
			Thread.sleep(2000);
			ele=driver.findElement(By.id("a2"));
			ele.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(2000);
			ele=driver.findElement(By.id("a1"));
			ele.sendKeys(Keys.CONTROL+"ax");
			Thread.sleep(2000);
			ele=driver.findElement(By.id("a"));
			ele.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(2000);
			ele=driver.findElement(By.id("a2"));
			ele.sendKeys(Keys.CONTROL+"ax");
			Thread.sleep(2000);
			ele=driver.findElement(By.id("a1"));
			ele.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(2000);
			driver.close();
		// TODO Auto-generated method stub

	}

}
