package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeValue {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\D-Drive\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.xpath("//a[text()='Google']"));
		
		String hrefValue=e.getAttribute("href");
		System.out.println(hrefValue);
		System.out.println(e.getAttribute("class"));
		driver.close();

	}

}
