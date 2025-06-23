package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.LoginPage;
import pages.WishList;

public class WishListTest extends BaseTest {
      
	
	@Test
	public void addtoWLandCarttest() throws InterruptedException {
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		
		LoginPage login = new LoginPage(driver);
		login.login("sahilshirale123", "sahil@123456");
		
		 driver.get("https://automationteststore.com/");
		 
		 Thread.sleep(3000);
		 
		WishList WL = new WishList(driver);
		
		WL.selectandAddtowishlist();
		
		Thread.sleep(3000);
		
		WL.OpenaddtoCart();
		
		Thread.sleep(3000);
		
		 CheckoutPage checkout = new CheckoutPage(driver);
	        checkout.goToCart();
	        checkout.proceedToCheckout();

	        Thread.sleep(3000);
		
	     Assert.assertTrue(WL.isCheckoutFromWishlistDisplayed(), "Checkout page did not load.");
	     Thread.sleep(3000);
	}
		
}
