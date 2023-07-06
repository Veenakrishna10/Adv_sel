package Krishna;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbddt {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./Excel/DTT Excel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String value=c.toString();
		System.out.println(value);
		Row r1 = sh.getRow(0);
		Cell c1 = r1.getCell(1);
		String value1=c1.toString();
		System.out.println(value1);
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(value);
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys(value1);
		Thread.sleep(2000);
		driver.close();
		// TODO Auto-generated method stub

	}

}
