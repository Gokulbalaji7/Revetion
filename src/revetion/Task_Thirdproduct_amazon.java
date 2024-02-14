package revetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_Thirdproduct_amazon {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");	

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);



		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		WebElement one = driver.findElement(By.id("twotabsearchtextbox"));
		one.sendKeys("voltas ac");
		
		WebElement second = driver.findElement(By.id("nav-search-submit-button"));
		second.click();
		
		Thread.sleep(2000);

		WebElement thirdproduct = driver.findElement(By.xpath("//img[@data-image-index=\"3\"]/ancestor::div[@class='sg-row']/descendant::a"));
		Thread.sleep(2000);

		thirdproduct.click();
		
		
		Thread.sleep(2000);
		
		WebElement onee = driver.findElement(By.id("twotabsearchtextbox"));
		onee.clear();
		onee.sendKeys("bluestar ac");
		
		WebElement secondd = driver.findElement(By.id("nav-search-submit-button"));
		secondd.click();
		
		Thread.sleep(2000);

		WebElement thirdproductt = driver.findElement(By.xpath("//img[@data-image-index=\"3\"]/ancestor::div[@class='sg-row']/descendant::a"));
		Thread.sleep(2000);

		thirdproductt.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
