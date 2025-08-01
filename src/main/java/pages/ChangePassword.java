package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePassword {
	
	WebDriver driver;
	
	
	By currentPass = By.id("PasswordFrm_current_password");
	By newPass = By.id("PasswordFrm_password");
	By confirm = By.id("PasswordFrm_confirm");
	By click = By.cssSelector("button[title='Continue']");
	By successMsg = By.cssSelector(".alert-success");
	
	
	public ChangePassword(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void changePassword(String cpass , String npass , String con) {
		
		driver.findElement(currentPass).sendKeys(cpass);
		driver.findElement(newPass).sendKeys(npass);
		driver.findElement(confirm).sendKeys(con);
		driver.findElement(click).click();
		
	}
	
	public String getSuccsessMsg() {
		return driver.findElement(successMsg).getText();
	}
	

}
