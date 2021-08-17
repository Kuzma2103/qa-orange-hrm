package pages;

import methods.AddUserMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class AdminPage extends BasePage {

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public AddUserMethod addUserMethod;

    // TEST METHODS

    // add user from admin page
    public AdminPage addUser(ArrayList<String> userData) {
        addUserMethod = new AddUserMethod(driver);
        addUserMethod.addUser(userData);
        return this;
    }

    // VERIFICATION METHODS
    public AdminPage verifyAddUser() {
        addUserMethod = new AddUserMethod(driver);
        addUserMethod.verifyAddUser("Successfully Saved");
        return this;
    }
}
