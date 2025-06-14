package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
		
	 WebDriver driver;

		    By username = By.id("loginFrm_loginname");
		    By password = By.id ("loginFrm_password");
		    By loginButton = By.xpath("//button[@title='Login']");

		    public LoginPage(WebDriver driver) {
		        this.driver = driver;
		    }

		    public void login(String uname, String pwd) {
		        driver.findElement(username).sendKeys(uname);
		        
		        try { Thread.sleep(1000); } catch (Exception e) {}
		        
		        driver.findElement(password).sendKeys(pwd);
		        driver.findElement(loginButton).click();

		        try { Thread.sleep(1000); } catch (Exception e) {}
}
}
