package revetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseover_cursor_action {
	
//	public static WebDriver driver;
	public static void main(String[] args) {
		
	

	 EdgeOptions option = new EdgeOptions();
	 option.addArguments("--remote-allow-Origins=*");
	WebDriver driver = new EdgeDriver(option);
	
	 
//	
//	 ChromeOptions option = new ChromeOptions();
//	 option.addArguments("--remote-allow-Origins=*");
//	WebDriver driver = new ChromeDriver(option);


	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	
	
	WebElement fe = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(fe).perform();


}}
