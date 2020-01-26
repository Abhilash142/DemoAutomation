package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSeachBox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Test");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("selenium");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'interview')]")));
        driver.findElement(By.xpath("//b[contains(text(),'interview')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Guru99')]")).click();
        driver.close();
	}

}
