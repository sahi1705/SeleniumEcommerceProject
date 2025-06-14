package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {


	 WebDriver driver;

	    public CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void goToCart() {
	        driver.findElement(By.xpath("//a[@id=\'cart_checkout1\']")).click();
	    }

	    public void proceedToCheckout() {
	        driver.findElement(By.xpath("//button[@id=\'checkout_btn\']")).click();
	    }

	    public boolean isCheckoutPageDisplayed() {
	        return driver.getTitle().contains("Your Order Has Been Processed!");
	    }
}
