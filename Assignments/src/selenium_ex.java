


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Learning the concepts of Selenium Web-Drover
 * @author nachiketatripathi
 *
 */

public class selenium_ex {
	public static void main(String args[])
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/nachiketatripathi/Downloads/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("Cricket");
		driver.findElement(By.id("_fZl")).click();
		driver.findElement(By.xpath(".//*[@id='rso']/div[3]/div/div[4]/div/div/h3/a")).click();
		/*WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("rcnt")));
	 List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rcnt']"));
	 String third_link = findElements.get(2).getAttribute("href");
	    driver.navigate().to(third_link);*/
		
	}

}
