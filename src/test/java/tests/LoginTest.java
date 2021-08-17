package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);

        loginPage.loginUser();

        // test assertion
        try {
            loginPage.verifyLoginUser();
            System.out.println("User is logged in.");
        } catch (Exception e) {
            Assert.fail("Something went wrong");
        }
    }
}
