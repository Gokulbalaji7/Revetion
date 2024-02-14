package revetion;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class windowpopup {
	public static void main(String[] args) {
	      

		 EdgeOptions option = new EdgeOptions();
		 option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new EdgeDriver(option);
		
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-Origins=*");
//		
//		WebDriver driver = new ChromeDriver(option);
//	      
	      
	      String url = "https://secure.indeed.com/account/login";
	      driver.get(url);
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	      // store all window handles
	      Set<String> a = driver.getWindowHandles();
	      // iterate through handles
	      Iterator<String> it = a.iterator();
	      String chlwnd = it.next();
	      String pwnd = it.next();
	      // switch to child window
	      driver.switchTo().window(chlwnd);
	      System.out.println("Page title "+ driver.getTitle());
	      // switch to parent window
	      driver.switchTo().window(pwnd);
	      System.out.println("Page title "+ driver.getTitle());
	      driver.quit();
}}
