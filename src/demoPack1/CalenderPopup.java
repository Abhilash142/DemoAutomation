package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPopup {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(@class, 'onward')]")).click();
		driver.findElement(By.xpath("(//td[text()=14])[2]")).click();
		
		
		//driver.close();

	}

}
