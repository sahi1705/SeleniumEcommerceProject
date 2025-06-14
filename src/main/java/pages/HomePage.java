package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
   
	
	
	 WebDriver driver;
	    By searchBox = By.xpath("//input[@placeholder='Search Keywords']");
	    
//	    By searchButton = By.xpath("//div[@class=\'button-in-search\']");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void search(String keyword) {
	        driver.findElement(searchBox).sendKeys(keyword + Keys.ENTER);
	        
//	        driver.findElement(searchButton).click();
	    }
	
	
	
	
	
	
	
}
