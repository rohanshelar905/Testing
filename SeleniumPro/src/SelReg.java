import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelReg {

	public static void main(String args[])
	{
		/*String regx = "New World Order 2020 Vinmar";
		if(regx.matches("New [A-Z][a-z].* 202[0-9] V[a-z]...."))
			System.out.println("True");
		else
			System.out.println("False");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login/");
		
//		String regusername = "login_field";
//		if(regusername.matches("[a-z]\\_[a-z]"))
//		{	
			WebElement username=driver.findElement(By.id("login_field"));
			username.sendKeys("lab5deloittemumbai");
	//	}
	
		String regpassword = "password";
		if (regpassword.matches("p[a-z]*d")) {
//			WebElement password = driver.findElement(By.id("password"));
			WebElement password = driver.findElement(By.xpath("//*[@id='p[a-z]*']"));
			password.sendKeys("qwerty@2048");
		}
		driver.findElement(By.className("btn-primary")).click();
	
	}
}
