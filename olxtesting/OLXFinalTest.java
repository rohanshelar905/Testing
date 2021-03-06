package olxtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OLXFinalTest {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Login
		driver.get("https://accounts.craigslist.org/login?rt=L&rp=%2Flogin%2Fhome");

		WebElement email = driver.findElement(By.id("inputEmailHandle"));
		email.sendKeys("lab5deloittemumbai@gmail.com");

		WebElement password = driver.findElement(By.id("inputPassword"));
		password.sendKeys("seed@2048#");
		driver.findElement(By.id("login")).click();
		
		// List
		driver.get("https://mumbai.craigslist.org/search/hhh");
		List<WebElement> list = driver.findElements(By.className("result-info"));
		
		// Add to Favourites
		for (int i = 0; i < 5; i++) {
			list.get(i).findElement(By.className("icon-star")).click();
		}
		
		//Location Change
		Select select = new Select(driver.findElement(By.id("areaAbb")));
		select.selectByVisibleText("pune");
		
		// Post Add
		driver.get("http://www.craigslist.org");
		driver.findElement(By.id("post")).click();		
		driver.findElement(By.xpath("//input[@value='so']")).click();
		driver.findElement(By.xpath("//input[@value='76']")).click();
		
		WebElement PostingTitle= driver.findElement(By.id("PostingTitle"));
		PostingTitle.sendKeys("Computer Repairing");
		
		WebElement GeographicArea= driver.findElement(By.id("GeographicArea"));
		GeographicArea.sendKeys("Mumbai");
		
		WebElement postal_code= driver.findElement(By.id("postal_code"));
		postal_code.sendKeys("400072");
		
		WebElement PostingBody= driver.findElement(By.id("PostingBody"));
		PostingBody.sendKeys("Computer Repairing");
		
		
		driver.findElement(By.xpath("//button[@value='continue']")).click();
		driver.findElement(By.xpath("//button[@value='Done with Images']")).click();
		driver.findElement(By.xpath("//button[@value='Continue']")).click();
		
		
	}
}
