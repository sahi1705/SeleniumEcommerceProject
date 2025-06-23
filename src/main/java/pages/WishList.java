package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishList {
     
	WebDriver driver;     
	
	public WishList(WebDriver driver) {
		
		this.driver = driver;
		
	}
	By productImage = By.xpath("//a[@title=\'New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals\']");
	By addtowishlist = By.xpath("//a[@class=\'wishlist_add btn btn-large\']");
    By welcomeUser = By.xpath("(//a[@class='top menu_account'])[1]");
	By secondOption = By.xpath("(//ul[@class=\"sub_menu dropdown-menu\"]//a)[2]");
	By ATC = By.xpath("//a[@class=\'btn btn-sm btn-primary\']");
	By SelectSize = By.xpath("//input[@id=\'option344749\']");
	By OATC = By.xpath("//a[@class=\"cart\"]");
	
	
	public void selectandAddtowishlist(){
		
		driver.findElement(productImage).click();
		
		driver.findElement(addtowishlist).click();
		
	}
	
	public void OpenaddtoCart() {
		
		 WebElement hoverElement = driver.findElement(welcomeUser);
	        Actions actions = new Actions(driver);
	        actions.moveToElement(hoverElement).perform();

	        // Wait and click second option ("Wish List")
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(secondOption));
	        driver.findElement(secondOption).click();
		     
		      driver.findElement(ATC).click();
		      driver.findElement(SelectSize).click();
		      
		      driver.findElement(OATC).click();
		    
	}
	public boolean isCheckoutFromWishlistDisplayed() {
	    return driver.getTitle().contains("Your Order Has Been Processed!"); 
	}
}
