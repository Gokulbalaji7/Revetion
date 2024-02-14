package revetion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brokenlinks_revition {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");	

	ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));


		// Iterating each link and checking the response status
		for (WebElement link : links) {
		String url = link.getAttribute("href");
		verifyLink(url);
		}


		driver.quit();
		}


		public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
