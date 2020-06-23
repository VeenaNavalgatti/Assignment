import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		//below code by using own Xpath
		
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("My own xpath");
		
		// below code for using own CSS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("My first Css ");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
			
	}

}
