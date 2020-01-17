import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.exec.util.*;
import org.apache.commons.io.FileUtils;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class selwebdriver {
	
	private static String fileWithPath;
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
//		
//		
//		//Login
//		driver.get("https://github.com/login/");
//		WebElement username=driver.findElement(By.id("login_field"));
//		username.sendKeys("lab5deloittemumbai");
//		WebElement password=driver.findElement(By.id("password"));
//		password.sendKeys("qwerty@2048");
//		driver.findElement(By.className("btn-primary")).click();
//		
		//CheckBox
//		driver.get("https://github.com/new/");
//		WebElement checkBox = driver.findElement(By.id("repository_auto_init"));
//		checkBox.click();
//		if(checkBox.isSelected())
//		{
//			System.out.println("Checkbox is Selected!!");
//		}
//		else
//		{
//			System.out.println("Checkbox is Not Selected!!");
//		}
//		
//		//RadioButton
//		WebElement radioButton = driver.findElement(By.id("repository_visibility_private"));
//		radioButton.click();
//		if(radioButton.isSelected())
//		{
//			System.out.println("RadioButton is Selected!!");
//		}
//		else
//		{
//			System.out.println("RadioButton is Not Selected!!");
//		}
//		
//		//DropDownBox
//		driver.get("https://github.com/settings/profile");
//		WebElement dropDown = driver.findElement(By.id("user_profile_spoken_language_preference_code"));
//		Select lang = new Select(dropDown);
//		lang.selectByVisibleText("Marathi");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("error.png"));
	}
}
 