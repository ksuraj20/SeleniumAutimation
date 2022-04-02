/**
 * 
 */
package auto;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author suraj
 *
 */
public class BrokenLinks
{
	static WebDriver driver;

	@Test
	public void brokenLinks()
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions cp = new ChromeOptions();
			cp.addArguments("--headless");
			driver=new ChromeDriver(cp);

			driver.navigate().to("https://www.softwaretestingmaterial.com");

			List<WebElement> links = driver.findElements(By.tagName("a")); 
			System.out.println("Total number of links is "+links.size());

			for(int i=0; i<links.size();i++)
				{
					WebElement E1= links.get(i);
					String url= E1.getAttribute("href");
					isLinkBroken(url);
				}

		}

	public static void isLinkBroken(String inputURL)
		{
			try {
				URL url = new URL(inputURL);
				HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
				connection.setConnectTimeout(5000);
				connection.connect();

				if (connection.getResponseCode() >=404)
					{

						System.out.println(inputURL +" "+ connection.getResponseMessage()+" is broken link");
					}
				else
					{
						System.out.println(inputURL +" "+ connection.getResponseMessage());
					}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

}
