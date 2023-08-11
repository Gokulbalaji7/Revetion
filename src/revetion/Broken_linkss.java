package revetion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broken_linkss {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");	

	ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		HttpURLConnection huc = null;
		
//		int responcecodeis = 400;
		
		List<WebElement> findelmts = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < findelmts.size() ; i++) {           // click for loop index array
			WebElement wbelmt = findelmts.get(i);
			String atrbt = wbelmt.getAttribute("href");
			try {
				
				huc = (HttpURLConnection)(new URL(atrbt).openConnection());      //click url string spec, we only typy this syntax
			    huc.setRequestMethod("HEAD");
			    huc.connect();
			    int rspncecode = huc.getResponseCode();
			    
			    if (rspncecode>=400) {
					System.err.println(atrbt + "is broken links");
				} else {

					System.out.println(atrbt + "is not a broken links");
				}
			
			} catch (Exception e) {
			System.out.println("is a exception");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
