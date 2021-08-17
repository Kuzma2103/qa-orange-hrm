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

    // login with empty password field
    public LoginPage loginWithUsername() {
        method = new LoginMethod(driver);
        method.loginWithUsername(PropertyManager.getInstance().getUsername());
        return this;
    }

    // login with empty username field
    public LoginPage loginWithPassword() {
        method = new LoginMethod(driver);
        method.loginWithPassword(PropertyManager.getInstance().getPassword());
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

    public LoginPage verifyLoginWithUsername() {
        method = new LoginMethod(driver);
        method.verifyInvalidLogin("Password cannot be empty");
        return this;
    }

    public LoginPage verifyLoginWithPassword() {
        method = new LoginMethod(driver);
        method.verifyInvalidLogin("Username cannot be empty");
        return this;
    }
}
