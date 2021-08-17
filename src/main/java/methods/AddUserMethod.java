package methods;

import data.DataCreate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utilities.PropertyManager;

import java.util.ArrayList;

public class AddUserMethod extends BasePage {

    public AddUserMethod(WebDriver driver) {
        super(driver);
    }

    // element references
    By adminLinkBy = By.id("menu_admin_viewAdminModule");
    By employeeNameBy = By.id("systemUser_employeeName_empName");
    By usernameBy = By.id("systemUser_userName");
    By passwordBy = By.id("systemUser_password");
    By confirmPasswordBy = By.id("systemUser_confirmPassword");

    // button references
    By addButtonBy = By.id("btnAdd");
    By saveButtonBy = By.id("btnSave");

    // asertion element references
    By successBodyEditBy = By.id("successBodyEdit");

    // INTERACTION METHODS

    // Add user from admin page
    public AddUserMethod addUser(ArrayList<String> userData) {
        DataCreate.createData(userData);
        click(adminLinkBy);
        click(addButtonBy);
        writeText(employeeNameBy, PropertyManager.getInstance().getEmployeeName());
        writeText(usernameBy, userData.get(0));
        writeText(passwordBy, userData.get(1));
        writeText(confirmPasswordBy, userData.get(1));
        click(saveButtonBy);
        return this;
    }

    // ASSERTION METHODS
    public AddUserMethod verifyAddUser(String expectedText) {
        if (checkVisibility(successBodyEditBy)){
            String elementText = readText(successBodyEditBy);
            assertStringsEqual(elementText, expectedText);
        }
        return this;
    }
}
