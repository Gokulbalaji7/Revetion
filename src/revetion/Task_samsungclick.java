package revetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_samsungclick {

	public static void main(String[] args) {

		
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver\\chromedriver.exe");	

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);



		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		

		WebElement one = driver.findElement(By.id("twotabsearchtextbox"));
		one.sendKeys("i phone");
		
		WebElement second = driver.findElement(By.id("nav-search-submit-button"));
		second.click();
		
		WebElement nillkin = driver.findElement(By.xpath("//ul[@data-csa-c-content-id=\"3837712031\"]/child::span[@data-csa-c-content-id=\"p_89/Nillkin\"]/descendant::span/child::a/child::span"));
		nillkin.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
