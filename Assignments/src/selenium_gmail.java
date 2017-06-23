import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Script for sending mail from a Gmail-Id to another
 * @author nachiketatripathi
 *
 */
public class selenium_gmail {

	public static void main(String[] args) {
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
		 driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("nachiketatripathi111qait@gmail.com");

	        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("How are you?");
	        
	        driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Hello!! hows your day going on?");
	        driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
	        

	}

}
