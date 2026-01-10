package collectionframwork.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetPropertiesDemo {

	public static void main(String[] args) throws IOException{

		// Create Properties object to store key-value pairs
		Properties properties = new Properties();
		
		// Load existing data
		FileInputStream fis = new FileInputStream("C:\\Users\\pc\\Documents\\info.properties");
		properties.load(fis);
		
		// Add new key OR update existing key
		properties.setProperty("Age", "20");     //Update value
		properties.setProperty("Town", "Seondha"); //Add new Key-value pair
		properties.setProperty("Stream", "Science");
		
		
		// Save back to file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\pc\\Documents\\info.properties");
		properties.store(fos, "Update the new key and value");
		
		// Close the stream to release system resources and ensure data is written properly
		fis.close();
		fos.close();
		
	}

}
