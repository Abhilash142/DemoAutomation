package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitlePopup {

	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.gecko.driver","C:\\D-Drive\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy())
		String title=driver.findElement(By.xpath("//img[contains(@src,'a71')]")).getAttribute("title");
        System.out.println("The tooltip is -"+title);
        driver.close();

	}

}
