package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class EmptyPasswordLoginTest extends BaseTest {

    public LoginPage loginPage;

    @Test
    public void emptyPasswordLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.loginWithUsername();

        // test assertion
        try {
            loginPage.verifyLoginWithUsername();
            System.out.println("User is not logged in. Password field is empty.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
