package veena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.collections4.list.TreeList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	for(int i=0; i<3; i++)
	{
	js.executeScript("Window.ScrollBy(0,500)");
	Thread.sleep(2000);
	}
	for(int j=0; j<3; j++)
	{
	js.executeScript("Window.ScrollBy(0,500)");
	Thread.sleep(2000);
	}
	
		
	}
}