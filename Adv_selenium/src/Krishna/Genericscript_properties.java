package Krishna;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Genericscript_properties {
	public void test2(String path, String key) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String u=p.getProperty(key);
		System.out.println(u);
	}
	}

