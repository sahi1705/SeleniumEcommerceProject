package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CreateAccountPage;

public class CreateAccountTest extends BaseTest {

	 CreateAccountPage createAccountPage;

	    @Test
	    public void testCreateAccountWithExistingEmail() throws InterruptedException {
	        driver.get("https://automationteststore.com/index.php?rt=account/create");

	        createAccountPage = new CreateAccountPage(driver);
	        createAccountPage.fillRegistrationForm("Sahil", "Shirale", "sahilshirale324@gmail.com", "sahilshirale123", "sahil123456");
	        Thread.sleep(3000);
	        createAccountPage.fillAddressDetails();
	        Thread.sleep(3000);
	        createAccountPage.submitForm();

	        String errorMsg = createAccountPage.getErrorMessage();
	        Assert.assertEquals(errorMsg.trim(), "×\nError: E-Mail Address is already registered!");
	    }
}
