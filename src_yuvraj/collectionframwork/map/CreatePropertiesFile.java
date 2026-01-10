package collectionframwork.map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertiesFile {

	public static void main(String[] args) throws IOException {

			// Create Properties object to store key-value pairs
			Properties properties = new Properties();

			// Add key-value pairs into Properties object
			properties.setProperty("yuvi21@gmail.com", "YUVI$I");
			properties.setProperty("ABC", "DEF");
			properties.setProperty("ATMPin","3243");

			// Create FileOutputStream
			// If file does not exist → it will be created
			FileOutputStream fos =
					new FileOutputStream("C:\\Users\\pc\\Documents\\Secrets.properties");

			// Store all key-value pairs into the properties file
			properties.store(fos, "Add new file with key-value pair");

			// Close the stream to release system resources and ensure data is written properly
			fos.close();
		}
	}