package collectionframwork.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\pc\\Documents\\info.properties");

		properties.load(fis);

		System.out.println(properties);
		
		//if you want get value according
		System.out.println(System.lineSeparator());
		System.out.println(properties.getProperty("Name"));
		System.out.println(properties.getProperty("Occupation"));
		System.out.println(properties.getProperty("Address"));
		System.out.println(properties.getProperty("Stream"));
		System.out.println(properties.getProperty("Town"));
		
		String s = properties.getProperty("Age");
		System.out.println(s);
		
	}

}
