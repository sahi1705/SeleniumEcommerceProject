package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
    public void loginTest() throws InterruptedException {
        driver.get("https://automationteststore.com/index.php?rt=account/login");
        LoginPage login = new LoginPage(driver);
        login.login("sahilshirale123", "sahil@123456");
        
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='My Account']")).isDisplayed());
        Thread.sleep(3000);
        
    }
	

}
