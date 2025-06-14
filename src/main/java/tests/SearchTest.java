package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class SearchTest  extends BaseTest  {

	
	 @Test
	    public void searchProduct() throws InterruptedException {
	        driver.get("https://automationteststore.com/");
	        HomePage home = new HomePage(driver);
	        home.search("Shampoo");
	   
	        Thread.sleep(3000);
	        
	        Assert.assertTrue(driver.getPageSource().contains("Shampoo"));
	    }
	
	
	
	
	
}
