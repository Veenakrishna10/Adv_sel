package veena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//a[@title='Shop home products']"));
			String alt = ele.getAttribute("href");
			System.out.println(alt);
		// TODO Auto-generated method stub

	}

}
