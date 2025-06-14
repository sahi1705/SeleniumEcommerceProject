package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest {

	
	 @Test
	    public void checkoutTest() throws InterruptedException {
		 driver.get("https://automationteststore.com/index.php?rt=account/login");

	      
	        LoginPage login = new LoginPage(driver);
	        login.login("sahilshirale123", "sahil@123456");

	        Thread.sleep(2000);

	       
	        driver.get("https://automationteststore.com/");

	       
	        ProductPage productPage = new ProductPage(driver);
	        productPage.addFirstProductToCart();

	        Thread.sleep(2000);
	        
	        CheckoutPage checkout = new CheckoutPage(driver);
	        checkout.goToCart();
	        checkout.proceedToCheckout();

	        Thread.sleep(2000);
	        Assert.assertTrue(checkout.isCheckoutPageDisplayed(), "Checkout page did not load.");
	        
	        Thread.sleep(2000);
	        
	    }
}
