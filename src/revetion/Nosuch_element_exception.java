package revetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nosuch_element_exception {

	public static void main(String[] args) {

		
//
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-Origins=*");
//		WebDriver driver = new ChromeDriver(option);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		WebElement findElement1 = driver.findElement(By.id("twotabsearchtextbox"));
		findElement1.sendKeys("samsung");
		
		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();

		WebElement findElement2= driver.findElement(By.xpath("//span[text()=' Galaxy A54 5G (Awesome Violet, 8GB, 256GB Storage) | 50 MP No Shake Cam (OIS) | IP67 | Gorilla Glass 5 | Voice Focus | Without ']"));
		findElement2.click();
		
		
		
		
		
		
	}

}
