package revetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {
public static void main(String[] args) {
	

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\chromedriver\\chromedriver.exe");
//chrome	

ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-Origins=*");
	WebDriver driver = new ChromeDriver(option);
	
	
	
	
	driver.get("https://www.amazon.in/");
	
	WebElement td = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
	
	td.click();
	
	List<WebElement> findElements = driver.findElements(By.xpath("//a[contains(text(),'Deals')]"));
	
	
	
	
	
	
	
	
	
	
	
}}
