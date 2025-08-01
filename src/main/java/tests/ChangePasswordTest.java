package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ChangePassword;
import pages.LoginPage;

public class ChangePasswordTest extends BaseTest {
	
	
	ChangePassword cPassword;
	@Test
	public void fillChangePassForm() throws InterruptedException {
		
		 driver.get("https://automationteststore.com/index.php?rt=account/login");
	        LoginPage login = new LoginPage(driver);
	        login.login("sahilshirale123", "sahil@123456");
				
		driver.get("https://automationteststore.com/index.php?rt=account/password");
		
		cPassword = new ChangePassword(driver);
		
		cPassword.changePassword("sahil@123456", "sonu@123456", "sonu@123456");
		
		 Thread.sleep(3000);
		 
		 String msg = cPassword.getSuccsessMsg();
		 Assert.assertTrue(msg.contains("Success"), "Change Password Faild");
		   
		
	}
	
	
	

}
