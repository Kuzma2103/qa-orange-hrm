package pages;

import methods.LoginMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginMethod method;

    // TEST METHODS

    // valid login
    public LoginPage loginUser() {
        method = new LoginMethod(driver);
        method.login(
                PropertyManager.getInstance().getUsername(),
                PropertyManager.getInstance().getPassword()
        );
        return this;
    }

    // login with wrong user data
    public LoginPage wrongUserDataLogin() {
        method = new LoginMethod(driver);
        method.login(
                PropertyManager.getInstance().getBadUsername(),
                PropertyManager.getInstance().getBadPassword()
        );
        return this;
    }

    // VERIFICATION METHODS

    public LoginPage verifyLoginUser() {
        method = new LoginMethod(driver);
        method.verifyLogin("Dashboard");
        return this;
    }

    public LoginPage verifyWrongUserDataLogin() {
        method = new LoginMethod(driver);
        method.verifyInvalidLogin("Invalid credentials");
        return this;
    }
}
