package Krishna;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner_Script extends Generic_Script{
	@Test
	public void validlogin() throws InterruptedException
	{
	//	driver.findElement(By.xpath("//button[text()='X']")).click();
		//Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
