package revetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stale_element_exception {

	public static void main(String[] args) throws Throwable {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement findElement1 = driver.findElement(By.id("email"));
		findElement1.sendKeys("gok");

		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("123");

		WebElement findElement3 = driver.findElement(By.xpath("//button[text()='Log in']"));
		findElement3.click();

		Thread.sleep(3000);

//				findElement1.sendKeys("gok");   // we want stale element exection means give it this line

		try {
			findElement1.sendKeys("gok");
		} catch (Exception e) {
			System.out.println(e.getMessage()+ " ---> exception will be catched");
		}

	}

}
