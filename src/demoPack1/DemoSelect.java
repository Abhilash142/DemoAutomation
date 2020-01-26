package demoPack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\D-Drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Select element from single select dropdown
		WebElement e=driver.findElement(By.id("city"));
		Select s=new Select(e);
		s.selectByIndex(2);
		Thread.sleep(3000);
        s.selectByValue("4");
        Thread.sleep(3000);
        s.selectByVisibleText("Chennai");
        
        
        //Select element from multiselect dropdown
        WebElement e1=driver.findElement(By.id("cities"));
        Select s1=new Select(e1);
        s1.selectByIndex(2);
        Thread.sleep(3000);
        s1.selectByValue("4");
        Thread.sleep(3000);
        s1.selectByVisibleText("Bangalore");
        
        
       //deselect of multidropdown
        s1.deselectByIndex(3);
        
        //get all elements from single select dropdown
        List<WebElement> l1=s.getOptions();
        
          for(int i=0; i<l1.size();i++)
          {
            WebElement li=l1.get(i);
            String str=li.getText();
            System.out.println(str);
          }
          
          //get all elements from multiselect dropdown
          List<WebElement> l2= s1.getOptions();
          for (int j=0;j<l2.size();j++)
          {
        	  System.out.println(l2.get(j).getText());
          }
          
        //get only selected element from single select dropdown
          List<WebElement> l3=s.getAllSelectedOptions();
          
          for (int k=0;k<l3.size();k++)
          {
        	  System.out.println(l3.get(k).getText());
          }
          
        //get only selected element from single select dropdown
          List<WebElement> l4=s1.getAllSelectedOptions();
          
          for (int x=0;x<l4.size();x++)
          {
        	  System.out.println(l4.get(x).getText());
          }
          
          
          
	}

}
