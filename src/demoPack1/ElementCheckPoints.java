package demoPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCheckPoints {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imovirtual.com/en/conta/?ref%5B0%5D%5Blocation%5D=0&ref%5B0%5D%5Bdistrict%5D=0&ref%5B0%5D%5Baction%5D=myaccount&ref%5B0%5D%5Bmethod%5D=index");
        Boolean b=driver.findElement(By.xpath("//input[@id='checkbox-remember-me']")).isSelected();
        System.out.println(b);
        driver.close();
	}

}
