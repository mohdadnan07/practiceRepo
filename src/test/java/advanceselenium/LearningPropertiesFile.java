package advanceselenium;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class LearningPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Shivani\\Desktop\\data\\commondata.properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);
		
		String url = pObj.getProperty("url");
		String browser = pObj.getProperty("browser");
		String username = pObj.getProperty("username");
		String password = pObj.getProperty("password");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		

	}

}
