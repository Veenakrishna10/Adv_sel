package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ytxpat {
				public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.youtube.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("kgf 2 trailer");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains(@class,'ytp-inline-preview-scrim')]")).click();
				Thread.sleep(2000);
		// TODO Auto-generated method stub

	}

}
