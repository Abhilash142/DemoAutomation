package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.imovirtual.com/en/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("my_account")).click();
		driver.findElement(By.xpath("//a[contains(@class,'icon-close')]")).click();
		driver.findElement(By.id("login")).sendKeys("abhilash@sunfra.in");
		driver.findElement(By.id("password")).sendKeys("sunfra");
		/*WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));*/
		driver.findElement(By.id("submit-login-2fa")).click();
		//driver.close();

	}

}
