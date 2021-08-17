package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class EmptyUsernameLoginTest extends BaseTest {

    public LoginPage loginPage;

    @Test
    public void emptyUsernameLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.loginWithPassword();

        // test assertion
        try {
            loginPage.verifyLoginWithPassword();
            System.out.println("User is not logged in. Username field is empty.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
