package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.AdminPage;

import java.util.ArrayList;

public class AddJobTitleTest extends BaseTestWithLogin {

    public AdminPage adminPage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void addJobTitleTest() {
        adminPage = new AdminPage(driver);
        adminPage.addJobTitle(userData);

        // test assertion
        try {
            adminPage.verifyAdd();
            System.out.println("User is added successfully.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
