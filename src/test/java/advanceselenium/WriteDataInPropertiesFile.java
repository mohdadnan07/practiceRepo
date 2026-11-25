package advanceselenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataInPropertiesFile {
	
	    public static void main(String[] args) throws IOException {

	        Properties prop = new Properties();

	        prop.setProperty("browser", "chrome");
	        prop.setProperty("url", "https://www.facebook.com");
	        prop.setProperty("username", "admin@gmail.com");
	        prop.setProperty("password", "admin123");

	        FileOutputStream fos = new FileOutputStream("C:\\Users\\Shivani\\Desktop\\prop.properties");

	        prop.store(fos, "Configuration Data");

	        fos.close();

	        System.out.println("Data written successfully");
	    }
	}
