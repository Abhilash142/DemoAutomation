package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.gecko.driver","C:\\D-Drive\\DemoAutomation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.standvirtual.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("topLoginLink")).click();
		driver.findElement(By.xpath("(//input[@id='userEmail'])[1]")).sendKeys("claudia.rosado@fixeads.com");
		driver.findElement(By.xpath("(//input[@id='userPass'])[1]")).sendKeys("Fixeads123");
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Anúncios' and @id='se_accountAds']")).click();
		if(driver.findElement(By.xpath("")).isDisplayed())
		{
			System.out.println("Hi");
			System.out.println("Hello");
		}
		 
		driver.findElement(By.xpath("//span[@class='icon-zamknij']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'8057118590')]/../../../../..//span[text()='Opções']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@title='Ficha do veículo']")).click();
		
		
		

	}

}
