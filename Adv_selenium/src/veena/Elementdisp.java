package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementdisp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/id.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("element not displayed");
		}
		driver.close();
		// TODO Auto-generated method stub

	}

}
