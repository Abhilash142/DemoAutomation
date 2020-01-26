package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleCheckPoint {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\D-Drive\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String Actual= "Google";
		String real=driver.getTitle();
		//System.out.println(real);
		
		if(real.equals(Actual))
		{
			System.out.println("Test Pass");
		}
		
		else
		{
			System.out.println("Test fail");
		}
		
		

	}

}
