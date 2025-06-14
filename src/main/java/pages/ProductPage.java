package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
         
	
	WebDriver driver;
	
	By product = By.xpath("(//a[@title=\'Skinsheen Bronzer Stick\'])[1]");
	By addtocartButton = By.xpath("//a[@class='cart']");
	

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
    	
    	driver.findElement(product).click();
    	driver.findElement(addtocartButton).click();
      
    }
	
}
