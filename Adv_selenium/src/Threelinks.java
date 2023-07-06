import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threelinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///E:/selenium/threelinks.html");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count = ele.size();
		System.out.println(count);
		for(int i=0; i<=count; i++)
		{
			WebElement wh = ele.get(i);
			String[] links;
			String att = wh.getAttribute("href");
			System.out.println(att);
		}
		

	for(webElement wh=count)
	{
		
	}
}	
	
	
	
	
	
	
//private static String[] links = null;
private static int linksCount = 0;

driver.get("www.xyz.com");
List<WebElement> linksize = driver.findElements(By.tagName("a")); 
linksCount = linksize.size();
System.out.println("Total no of links Available: "+linksCount);
links= new String[linksCount];
System.out.println("List of links Available: ");  
// print all the links from webpage 
for(int i=0;i<linksCount;i++)
{
links[i] = linksize.get(i).getAttribute("href");
System.out.println(all_links_webpage.get(i).getAttribute("href"));
} 
// navigate to each Link on the webpage
for(int i=0;i<linksCount;i++)
{
driver.navigate().to(links[i]);
Thread.sleep(3000);
}