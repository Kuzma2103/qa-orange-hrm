package methods;

import data.DataCreate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.ArrayList;

public class AddJobTitleMethod extends BasePage {

    public AddJobTitleMethod(WebDriver driver) {
        super(driver);
    }

    // element references
    By adminLinkBy = By.id("menu_admin_viewAdminModule");
    By jobLinkBy = By.id("menu_admin_Job");
    By jobTitleLinkBy = By.id("menu_admin_viewJobTitleList");
    By jobTitleInputBy = By.id("jobTitle_jobTitle");
    By jobDescriptionInputBy = By.id("jobTitle_jobDescription");
    By noteInputBy = By.id("jobTitle_note");

    // button references
    By addButtonBy = By.id("btnAdd");
    By saveButtonBy = By.id("btnSave");

    // INTERACTION METHODS

    // add job title
    public AddJobTitleMethod addJobTitle(ArrayList<String> userData) {
        click(adminLinkBy);
        mouseHoverAction(jobLinkBy, jobTitleLinkBy);
        click(addButtonBy);
        DataCreate.createData(userData);

        writeText(jobTitleInputBy, userData.get(2));
        writeText(jobDescriptionInputBy, userData.get(3));
        writeText(noteInputBy, userData.get(3));
        click(saveButtonBy);
        return this;
    }

}
