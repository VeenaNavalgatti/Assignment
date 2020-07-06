package RETC_90;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		//URL to launch
		driver.get("http://realty-real-estatem1.upskills.in/admin");
		//Login admin credentials
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		//Sign in button
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/form/p[3]/input")).click();
		
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]"))).perform();
		driver.findElement(By.linkText("All Properties")).click();
		
		// Click on Add new link of Properties section
				driver.findElement(By.linkText("Add New")).click();
				
				driver.findElement(By.id("title")).sendKeys("shantiniketan");
				
				driver.findElement(By.id("content")).sendKeys("flat");
				
				//to enter price
				driver.findElement(By.id("_price")).sendKeys("90000");
				
				
				driver.findElement(By.id("_price_per")).sendKeys("3000");
				
				// Click on Main Details tab
				
				driver.findElement(By.partialLinkText("Main Details")).click();
				
				// Enter valid credentials in Status textbox
				driver.findElement(By.id("_status")).sendKeys("New");
				
				// Enter valid credentials in Location textbox
				driver.findElement(By.id("_location")).sendKeys("Kormangala");
				
				// Enter valid credentials in Possession textbox
				driver.findElement(By.id("_possession")).sendKeys("ready to occupy");
				
				// Click on Location tab
				driver.findElement(By.partialLinkText("Location")).click();
				
				// Enter valid credentials in Address textbox
				driver.findElement(By.id("_friendly_address")).sendKeys("Kormangala");
				
				// Enter valid credentials in Google Maps Address textbox
				driver.findElement(By.xpath("//*[@id=\"_address\"]")).sendKeys("Kormangala");
				
				// Enter valid credentials in Latitude textbox
				driver.findElement(By.id("_geolocation_lat")).sendKeys("120");
				
				// Enter valid credentials in Longitude textbox
				
				driver.findElement(By.id("_geolocation_long")).sendKeys("12");
				
				// Click on Details tab

				
				driver.findElement(By.id("ui-id-4")).click();
				
				// Enter valid credentials in Storage Room textbox

				driver.findElement(By.id("_storage_room")).sendKeys("2");
				
				// Click on Central Bangalore Checkbox
				
				// driver.findElement(By.id("in-region-1348")).click();
				//driver.findElement(By.xpath("//*[@id=\"in-region-1348\"]")).click();
				
				
				WebElement element = driver.findElement(By.id("in-region-1348"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				
				// Click on checkbox beside  Feature of Features section
				driver.findElement(By.id("in-property_feature-1366")).click();
				
				// Click on checkbox beside  Region of Regions section
				WebElement ele = driver.findElement(By.id("in-region-1352"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", ele);
				
				
				//driver.findElement(By.id("in-region-1352")).isSelected();
				driver.findElement(By.id("publish")).submit();
				
				
				
				

	}

}
