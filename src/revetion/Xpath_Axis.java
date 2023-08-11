package revetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Axis {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");	

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);



		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		//Thread.sleep(1000);
		
          

	
// implicit wait		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		


		




	//	 x path

		WebElement sdb = driver.findElement(By.id("twotabsearchtextbox"));
		sdb.sendKeys("samsung");

		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();


		WebElement numthree = driver.findElement(By.xpath("//img[@data-image-index=3]/ancestor::div[@cel_widget_id='MAIN-SEARCH_RESULTS-5']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		numthree.click();
		Thread.sleep(2000);






		 


































	}

}
