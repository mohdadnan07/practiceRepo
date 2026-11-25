package advanceselenium;

import java.awt.List;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboAutomateCalender {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&utm_term=!SEM!DF!G!Brand!RSA&cmp=SEM|D|DF|G|Google-CPC-Brand|DF-Brand-EM|Goibibo-Flight|RSA%3e&gad_source=1&gad_campaignid=108599293&gbraid=0AAAAADrlxCfBK3S4rEWW2yweLSMIZWq7D&gclid=CjwKCAiA5Y_YBhBbEiwAK5Dl7fJ4Yb6fhp3rO6cbwR_9bM6Or7tvHKbHHsYCN4jQWRKJf7x8GW_gjhoCh2cQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
//		 List<WebElement> popup = driver.findElements(By.xpath("//button[@aria-label='Close']"));
//
//		        if (popup.size() > 0) {
//		            popup.get(0).click();
//		            System.out.println("Popup closed");
//		        } else {
//		            System.out.println("Popup not displayed");
//		        }
		List<WebElement> popup = driver.findElements(
	            By.xpath("//button[@aria-label='Close']")
	        );

	        if (!popup.isEmpty()) {
	            popup.get(0).click();
	            System.out.println("Login popup closed");
	        }

	        System.out.println("Continue with website");
		driver.quit();
	}

}
