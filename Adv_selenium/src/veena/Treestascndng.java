package veena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treestascndng {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
	    TreeSet<String> t=new TreeSet <String>(Collections.reverseOrder());
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String text = we.getText();
			t.add(text);
		}
		for(String t1:t)
		{
		System.out.println(t1);
		}
		// TODO Auto-generated method stub
		//to get all the text values in ascending order using tree set// combined reverse order also
		}
	
		// TODO Auto-generated method stub

	}

