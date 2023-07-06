package veena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Srtelmntdsndng {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
	    ArrayList<String> l=new ArrayList<String>();
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String text = we.getText();
			l.add(text);
		}
		Collections.sort(l,Collections.reverseOrder());
		
		for(String l1:l)
		{
		System.out.println(l1);
		}
		//to get all the text values in descending order
		}

	}

