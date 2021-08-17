package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LogoutMethod extends BasePage {

    public LogoutMethod(WebDriver driver) {
        super(driver);
    }

    // element references
    By welcomeLinkBy = By.id("welcome");
    By logoutLinkBy = By.xpath("//div[@id='welcome-menu']//li//a[text()='Logout']");

    // assertion element references
    By loginPanelBy = By.id("logInPanelHeading");

    // INTERACTION METHODS

    // logout
    public LogoutMethod logout() {
        click(welcomeLinkBy);
        click(logoutLinkBy);
        return this;
    }

    // ASSERTION METHODS
    public LogoutMethod verifyLogout(String expectedText) {
        String elementText = readText(loginPanelBy);
        assertStringsEqual(elementText, expectedText);
        return this;
    }
}
