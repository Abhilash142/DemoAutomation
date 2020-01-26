package demoPack1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\DemoAutomation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.standvirtual.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@target='_blank' and contains(@href,'pecas')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='icon-zamknij']")).click();
		Thread.sleep(5000);
		//WebDriverWait w= new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Descarregar da Play Store']")));
		driver.findElement(By.xpath("//a[@title='Descarregar da Play Store']")).click();
	
		
		
		Thread.sleep(5000);
		
		Set<String> str=driver.getWindowHandles();
		
		Iterator<String> itr=str.iterator();
		String homePage=itr.next();
		String partsPage=itr.next();
		String playStore=itr.next();
		
		System.out.println(homePage);
		System.out.println(partsPage);
		System.out.println(playStore);

		Thread.sleep(3000);
		driver.close();
	}

}
