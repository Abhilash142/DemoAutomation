package demoPack1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\D-Drive\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		
		//Open alert and accept it
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
        driver.switchTo().alert().accept();
       
       //Open confirm box, accept it
       driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
       Thread.sleep(3000);
       TargetLocator tl=driver.switchTo();
       Alert a=tl.alert();
       
       
      // a.accept();
      // driver.close();
	}

}
