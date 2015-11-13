package basicSelenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingStrategy 
{
	public static void main(String []args) throws InterruptedException
	{
        WebDriver driver =new FirefoxDriver();
        Thread.sleep(2000);
        driver.get("http://www.vogella.com/");
        Thread.sleep(2000);
        
 //locating by id
        
        driver.findElement(By.id("search_field")).sendKeys("git");
         driver.findElement(By.id("search_button")).click();
         Thread.sleep(2000);   
         
 
        
       
 //locating by linktext
         
       /* driver.findElement(By.linkText("Free tutorials")).click();
         Thread.sleep(2000); */
         
 //locating by partial linktext
         
         /*driver.findElement(By.partialLinkText("Plug-ins")).click();
         Thread.sleep(2000);  */
        
 //locating by xpath
     
        /*System.out.println(
       driver.findElement(By.xpath("//img[@alt='Eclipse, Android and Git training and development support']"))
        .getAttribute("src"));
          Thread.sleep(2000);  */
        
}	
}


