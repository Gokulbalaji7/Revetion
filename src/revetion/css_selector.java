package revetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class css_selector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

				

		// css 

		WebElement sdb = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		sdb.sendKeys("samsung");
	
		
		// explicit wait 
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		wait.until(ExpectedConditions.elementToBeClickable(clk));
		clk.click();
		
		
		
	// id means #
	// class means .
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
