package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\DemoAutomation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.imovirtual.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Post new ad')]")).click();
		driver.findElement(By.xpath("(//div[@id='cookiesBar']//a)[1]")).click();
		WebElement e1=driver.findElement(By.xpath("//span[text()='rooms']/.."));
		Actions act=new Actions(driver);
		act.moveToElement(e1).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='I will rent'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='a simplified form']")).click();
		driver.findElement(By.name("image[1]")).sendKeys("C:\\D-Drive\\Sample.png");
		//driver.findElement(By.xpath("(//a[@title='Add photo'])[1]")).sendKeys("C:\\D-Drive\\Sample.png");
		
	}

}
