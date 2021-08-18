package pages;

import methods.AddJobTitleMethod;
import methods.AddUserMethod;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class AdminPage extends BasePage {

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public AddUserMethod addUserMethod;
    public AddJobTitleMethod addJobTitleMethod;

    // TEST METHODS

    // add user from admin page
    public AdminPage addUser(ArrayList<String> userData) {
        addUserMethod = new AddUserMethod(driver);
        addUserMethod.addUser(userData);
        return this;
    }

    // add job title from admin page
    public AdminPage addJobTitle(ArrayList<String> userData) {
        addJobTitleMethod = new AddJobTitleMethod(driver);
        addJobTitleMethod.addJobTitle(userData);
        return this;
    }

    // VERIFICATION METHODS
    public AdminPage verifyAdd() {
        addUserMethod = new AddUserMethod(driver);
        addUserMethod.verifyAdd("Successfully Saved");
        return this;
    }

}
