package revetion;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webdriver_mthds_rev {
	

	public static void main(String[] args) throws Throwable {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);

		
		driver.get("https://www.pizzahut.co.in/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
	
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File designation = new File("C:\\Users\\gokul\\eclipse-workspace\\Revetion\\screenshot\\pizzaaaahut.png");
		Thread.sleep(3000);
		FileUtils.copyFile(sourcefile, designation);
		
	
}}





