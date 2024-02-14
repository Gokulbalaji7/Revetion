package revetion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class scroll_up_down {

	public static void main(String[] args) throws Throwable {

		
	
//		EdgeOptions option = new EdgeOptions();
//		option.addArguments("--remote-allow-Origins=*");
//		WebDriver driver = new EdgeDriver(option);
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		WebElement sams = driver.findElement(By.id("twotabsearchtextbox"));
		sams.sendKeys("samsung");

		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();

		Thread.sleep(3000);

/*		
		
// scroll down
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		
// scroll up
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,-900)");
		Thread.sleep(5000);
		
		WebElement numthree = driver.findElement(By.xpath("//img[@data-image-index=3]/ancestor::div[@cel_widget_id='MAIN-SEARCH_RESULTS-5']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		numthree.click();
		Thread.sleep(3000);
	*/	
		
	}

}
