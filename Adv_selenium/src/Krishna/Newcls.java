package Krishna;

import org.testng.annotations.Test;

public class Newcls extends Generic_Script{
	@Test
	public void demo1()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void demo2()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}
