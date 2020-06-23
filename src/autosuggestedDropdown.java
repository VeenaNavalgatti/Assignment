import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		//javascript DOM can extract hidden elements
		//bcz selenium cannot identify hidden elements -(Ajax implimentation)
		//investigate properties of object if it have any hidden text
		// use JavascriptExecutor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script="return document.getElementById(\"fromPlaceName\").value;";
		
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
	}

}
