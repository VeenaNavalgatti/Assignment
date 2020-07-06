package RETC_089;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class propertyDetail {

	public static void main(String[] args) throws InterruptedException {
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
		
		//move mouse on property and select first element
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]"))).perform();
		driver.findElement(By.linkText("All Properties")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vc_license-activation-notice\"]/button")).click();
		
		
		
		
		
		
		
		
		
		
		//Click on regions
		driver.findElement(By.linkText("Regions")).click();
		//Regions page with Add New Region module displayed.
		
		System.out.println(driver.findElement(By.cssSelector("#col-left > div > div > h2")).getText());
		
		// Enter Valid Credentials in Name textbox
		driver.findElement(By.id("tag-name")).sendKeys("Kormangala");
		
		// Enter Valid Credentials in Slug textbox
		driver.findElement(By.id("tag-slug")).sendKeys("North");
		
		
		// Click on Parent Region dropdown and  Select Valid credentials in Parent Region list box asBangalore
		Select dropdwParentRg=new Select(driver.findElement(By.id("parent")));
		//dropdwParentRg.selectByValue("CentralBangalore")
		dropdwParentRg.selectByIndex(1);
		//dropdwParentRg.selectByValue("1348;");
		
		// Enter Valid Credentials in Description textbox
		driver.findElement(By.id("tag-description")).sendKeys("kormangala east");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		//driver.findElement(By.xpath("//input[@Class='button button-primary']")).click();
		//driver.findElement(By.className("submit")).click();
		//driver.findElement(By.cssSelector("#submit")).click();
		
		Thread.sleep(4000);
			
		driver.navigate().refresh();
		
//		
		// Click on Add new link of Properties section
		driver.findElement(By.linkText("Add New")).click();
		
		//System.out.println(driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//driver.findElement(By.linkText("notice-dismiss vc-notice-dismiss")).click();
				
		driver.findElement(By.id("title")).sendKeys("shantiniketan");
		
		driver.findElement(By.id("content")).sendKeys("flat");
		
		driver.findElement(By.id("in-region-1348")).click();
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//driver.findElement(By.id("publish")).click();
		//driver.findElement(By.className("button button-primary button-large")).click();
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).submit();
		
		
		//driver.findElement(By.partialLinkText("Post published.").linkText("View post"));
		
//		// Refresh web page to add in frame is below method we need to declare
//		//public void fresh()
//		//{
//	//		driver.navigate().refresh();
//	//	}
//		
//		//driver.close();
//		
//		
//		
//		
//		
}
//
}
