package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginMethod extends BasePage {

    public LoginMethod(WebDriver driver) {
        super(driver);
    }

    // element references
    By usernameBy = By.id("txtUsername");
    By passwordBy = By.id("txtPassword");

    // buttons
    By loginButtonBy = By.id("btnLogin");

    // assertion element references
    By titleBy = By.xpath("//div[@class='head']//h1");
    By spanMessageBy = By.id("spanMessage");

    // INTERACTION METHODS

    // login
    public LoginMethod login(String username, String password) {
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    // login with empty password field
    public LoginMethod loginWithUsername(String username) {
        writeText(usernameBy, username);
        click(loginButtonBy);
        return this;
    }

    // login with empty username field
    public LoginMethod loginWithPassword(String password) {
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    // asertion methods
    public LoginMethod verifyLogin(String expectedText) {
        String element = readText(titleBy);
        assertStringsEqual(element, expectedText);
        return this;
    }

    public LoginMethod verifyInvalidLogin(String expectedText) {
        String message = readText(spanMessageBy);
        assertStringsEqual(message, expectedText);
        return this;
    }
}
