/**
 * 
 */
package Interview;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author suraj
 *
 */
public class gmailAutomaion
	{
		static WebDriver driver;
		
		@SuppressWarnings("deprecation")
		@BeforeMethod
		public void initDriver()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		}
		
		@Test
		public void gmailTest() throws InterruptedException
		{
			driver.navigate().to("https://www.google.com/");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("gmail"+Keys.ENTER);
			driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("identifierId")).sendKeys("suraj.kathare98@gmail.com");
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			String expectedMessage = "Couldn’t sign you in";
			String actualMessage=	driver.findElement(By.xpath("//*[text()='Couldn’t sign you in']")).getText();
			Thread.sleep(3000);
			
			System.out.println(actualMessage);
			
			assertEquals(actualMessage, expectedMessage);
			
			/*if(acceptedMessage.contains(messageString))
				{
					System.out.println(messageString);
				}
			
			else
			{
				System.out.println("Your accepted message and actual message is not matching");
			}
			*/
			//driver.findElement(By.name("password")).sendKeys("1234567898");
			//driver.findElement(By.xpath("//*[text()='Next']")).click();
			
			
		}
		
		//@AfterMethod
		public void tearDown()
		{
			driver.close();
		}
		
	}
