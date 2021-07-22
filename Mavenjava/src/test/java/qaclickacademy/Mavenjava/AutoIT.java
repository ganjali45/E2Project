package qaclickacademy.Mavenjava;


import java.io.IOException;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
public class AutoIT {
	public static void main(String[] args) throws IOException {								
	    WebDriver driver=new FirefoxDriver();			
	    driver.get("http://demo.guru99.com/test/autoit.html");			
	    driver.findElement(By.id("postjob")).click();			

	    driver.findElement(By.id("input_3")).sendKeys("Gaurav");                                 					
	    driver.findElement(By.id("id_4")).sendKeys("test.test@gmail.com");					
	    driver.findElement(By.id("input_4")).click();			
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");		
	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    driver.findElement(By.id("input_2")).click();
	    driver.close();
	     }
}
		
