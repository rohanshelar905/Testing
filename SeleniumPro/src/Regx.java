




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Regx {
	public static void main(String args[])
	{
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.google.com/");
		
		WebElement we = driver.findElement(By.xpath("//*[@di='gbqfq']"));
		we.sendKeys("not able to see sponsored links on google search");
		driver.findElement(By.xpath("//*[@id='gbqfq']")).click();
//		//List <WebElement> allElements = driver.findElement(By.xpath("//h3/a"));
//		
//		for(WebElement element : allElements)
//		{
//			allElements.size();
//			System.out.println(element.getText());
//		}
	}
}
