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

    // login
    public LoginPage loginUser() {
        method = new LoginMethod(driver);
        method.login(
                PropertyManager.getInstance().getUsername(),
                PropertyManager.getInstance().getPassword()
        );
        return this;
    }

    // VERIFICATION METHODS

    public LoginPage verifyLoginUser() {
        method = new LoginMethod(driver);
        method.verifyLogin("Dashboard");
        return this;
    }
}
