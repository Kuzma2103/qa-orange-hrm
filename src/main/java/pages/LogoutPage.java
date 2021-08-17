package pages;

import methods.LogoutMethod;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public LogoutMethod method;

    // TEST METHODS

    // logout
    public LogoutPage logoutUser() {
        method = new LogoutMethod(driver);
        method.logout();
        return this;
    }

    // VERIFICATION METHODS
    public LogoutPage verifyLogoutUser() {
        method = new LogoutMethod(driver);
        method.verifyLogout("LOGIN Panel");
        return this;
    }
}
