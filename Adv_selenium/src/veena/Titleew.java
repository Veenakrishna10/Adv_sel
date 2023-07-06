package veena;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Titleew {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys("veenapb55@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("veena@89");
			driver.findElement(By.name("login")).click();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains("Facebook"));
			String title=driver.getTitle();
			System.out.println(title);
			
			// TODO Auto-generated method stub

	}

}
