/**
 * 
 */
package linkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author suraj
 *
 */
public class AmazonWatchSearch
{

	static WebDriver driver;

	@BeforeTest
	public static void initDriver()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	@Test
	public static void searchWatchWithFilter() throws InterruptedException
		{
			//Navigate to amazon site
			driver.navigate().to("https://www.amazon.in");
			Thread.sleep(5000);
			
			//Search for Wrist Watches
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
			Thread.sleep(2000);
			
			//Click on search button
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(5000);
			
			//Click on analogue checkbox
			driver.findElement(By.xpath("//*[text()='Analogue']")).click();
			Thread.sleep(5000);
			
			//Click on leather checkbox
			driver.findElement(By.xpath("//*[text()='Leather']")).click();
			Thread.sleep(5000);
			
			//Click on Titan brand check box
			driver.findElement(By.xpath("//li[@aria-label='Titan']")).click();
			Thread.sleep(5000);
			
			//Click on discount link
			driver.findElement(By.xpath("//*[text()='25% Off or more']")).click();
			Thread.sleep(5000);
			
			//Get the fifth result and click on it.
			driver.findElement(By.xpath("//div[@data-index='6']")).click();
			
		}
}
