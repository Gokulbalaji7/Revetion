package revetion;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Third_productclick_Xpath_Axis {

	public static void main(String[] args) throws Throwable {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\chromedriver\\chromedriver.exe");	
//
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-Origins=*");
//		WebDriver driver = new ChromeDriver(option);

		WebDriver driver = new EdgeDriver();


		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		//Thread.sleep(5000);
		
// implicit wait		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

    	//	 x path axis

		WebElement sams = driver.findElement(By.id("twotabsearchtextbox"));
		sams.sendKeys("samsung");

		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();

		Thread.sleep(3000);

		
		WebElement numthree = driver.findElement(By.xpath("//img[@data-image-index=3]/ancestor::div[@cel_widget_id='MAIN-SEARCH_RESULTS-5']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		numthree.click();
		Thread.sleep(3000);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		
    
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		
		for (String secwindow : child) {
			
			if (!parent.equals(secwindow)) { // if not equal not given means it goes to parent window
				
				driver.switchTo().window(secwindow);
				WebElement samss = driver.findElement(By.id("twotabsearchtextbox"));
				samss.clear();
				samss.sendKeys("bags");
				
				WebElement clkk = driver.findElement(By.id("nav-search-submit-button"));
				Thread.sleep(3000);
				clkk.click();
				

				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,900)");
				Thread.sleep(5000);
				
				WebElement numthreee = driver.findElement(By.xpath("//img[@data-image-index=3]/ancestor::div[@cel_widget_id='MAIN-SEARCH_RESULTS-5']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
				numthreee.click();
				Thread.sleep(3000);
			}
		}


































	}

}
