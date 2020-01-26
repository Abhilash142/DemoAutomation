package demoPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DivPopup {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\D-Drive\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/samsung-galaxy-a50-black-64-gb/p/itmfe4csknzx2kcs?pid=MOBFE4CS3FDSGEZR&lid=LSTMOBFE4CS3FDSGEZRX2POEW&marketplace=FLIPKART&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=b9ae18a3-8313-485b-a931-bae16c080fcd.MOBFE4CS3FDSGEZR.SEARCH&ppt=sp&ppn=sp&ssid=hu7q6pgia80000001577124101154&qH=ac9c5ddfddf27056");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("(//span[text()='?'])[1]")).click();
        
        String PopupText1=driver.findElement(By.xpath("(//span[text()='?'])[1]//following::div/div")).getText();
        System.out.println(PopupText1);
        
        //driver.findElement(By.xpath("(//span[text()='?'])[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//span[text()='?'])[2]")).click();
        String PopupText2=driver.findElement(By.xpath("(//span[text()='?'])[2]//following::div/div")).getText();
        System.out.println(PopupText2);
        driver.close();
	}

}
