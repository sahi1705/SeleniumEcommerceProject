package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductPage;

public class AddToCartTest extends BaseTest {
         
	
	
	 @Test
	    public void addToCartTest() {
	        driver.get("https://automationteststore.com/");
	        ProductPage product = new ProductPage(driver);
	        product.addFirstProductToCart();
	        Assert.assertTrue(driver.getPageSource().contains("Success: You have added"));
	    }
	
}
