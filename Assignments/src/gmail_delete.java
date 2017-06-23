

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Script for deleting mail from the Gmail-ID
 * @author nachiketatripathi
 *
 */
public class gmail_delete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/nachiketatripathi/Downloads/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("nachiketatripathi111qait@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("nachi111.");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[text()='How are you?']/ancestor::tr//div[@role='checkbox']")).click();
	Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ar9.T-I-J3.J-J5-Ji")).click();

	}

}
