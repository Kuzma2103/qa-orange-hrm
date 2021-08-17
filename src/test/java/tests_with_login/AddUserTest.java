package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.AdminPage;

import java.util.ArrayList;

public class AddUserTest extends BaseTestWithLogin {

    public AdminPage adminPage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void addUserTest() {
        adminPage = new AdminPage(driver);
        adminPage.addUser(userData);

        // test assertion
        try {
            adminPage.verifyAddUser();
            System.out.println("User is added successfully.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
