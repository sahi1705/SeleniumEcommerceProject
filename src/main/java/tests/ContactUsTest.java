package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {
     
	 @Test
	    public void contactForm() throws InterruptedException {
	        driver.get("https://automationteststore.com/index.php?rt=content/contact");
	        driver.findElement(By.id("ContactUsFrm_first_name")).sendKeys("Sahil");
	        driver.findElement(By.id("ContactUsFrm_email")).sendKeys("sahil@test.com");
	        driver.findElement(By.id("ContactUsFrm_enquiry")).sendKeys("This is a test enquiry");
	        driver.findElement(By.cssSelector("button[title='Submit']")).click();
	        Assert.assertTrue(driver.getPageSource().contains("Your enquiry has been successfully sent"));
	        
	        Thread.sleep(3000);
	    }
	
	
}
