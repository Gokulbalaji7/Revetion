package revetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task {


	public static void main(String[] args) throws Throwable {
		

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");
// chrome	

	ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		
// edge
		
//		EdgeOptions option = new EdgeOptions();
//		option.addArguments("--remote-allow-Origins=*");
//		WebDriver driver = new EdgeDriver(option);

		
		
		
		
		//System.setProperty("webDriver.gecko.driver","C:\\Users\\gokul\\eclipse-workspace\\Revetion\\brower\\geckodriver.exe");
// firefox
//		DesiredCapabilities de = new DesiredCapabilities.();
//		de.setCapability("marionette",true);
//		FirefoxOptions option = new FirefoxOptions();
//		option.addArguments("--remote-allow-Origins=*");
				//esiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setCapability("marionette", true);
    //    driver = new FirefoxDriver(capabilities);

//		WebDriver driver = new FirefoxDriver(option);
		
		
		
		
		
		
		driver.get("https://nationalgeneral.com/About/GMAC_News/03-01-10.asp");
	
	
		
		WebElement rvi = driver.findElement(By.xpath("//a[@id='nav_rvinsurance']"));
		rvi.click();
		
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		
		Actions act2 = new Actions(driver);
		act2.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		
		
		WebElement zp = driver.findElement(By.id("ZipCode"));
		zp.sendKeys("77777");
		
		WebElement lg = driver.findElement(By.xpath("//*[@id=\"zipcode_lookupNew\"]/div[2]/div[1]/a"));
		lg.click();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		Actions act3 = new Actions(driver);
		act3.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
