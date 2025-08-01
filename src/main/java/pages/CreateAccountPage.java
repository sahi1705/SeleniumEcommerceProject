package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	   WebDriver driver;

	    public CreateAccountPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void fillRegistrationForm(String firstName, String lastName, String email, String username, String password) {
	        driver.findElement(By.id("AccountFrm_firstname")).sendKeys(firstName);
	        driver.findElement(By.id("AccountFrm_lastname")).sendKeys(lastName);
	        driver.findElement(By.id("AccountFrm_email")).sendKeys(email);
	        driver.findElement(By.id("AccountFrm_loginname")).sendKeys(username);
	        driver.findElement(By.id("AccountFrm_password")).sendKeys(password);
	        driver.findElement(By.id("AccountFrm_confirm")).sendKeys(password);
	    }

	    public void fillAddressDetails() {
	        driver.findElement(By.id("AccountFrm_address_1")).sendKeys("Thane, Maharashtra");
	        driver.findElement(By.id("AccountFrm_city")).sendKeys("Thane");
            
	        Select region = new Select(driver.findElement(By.id("AccountFrm_zone_id")));
	        region.selectByIndex(5);

	        driver.findElement(By.id("AccountFrm_postcode")).sendKeys("400601");

	        Select country = new Select(driver.findElement(By.id("AccountFrm_country_id")));
	        country.selectByValue("13");

	        driver.findElement(By.id("AccountFrm_agree")).click(); 
	    }

	    public void submitForm() {
	        driver.findElement(By.xpath("//button[@title='Continue']")).click();
	    }

	    public String getErrorMessage() {
	        return driver.findElement(By.cssSelector(".alert.alert-error.alert-danger")).getText();
	    }
	
	
		
	
}
