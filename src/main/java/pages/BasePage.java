package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    // INTERACTION METHODS

    // wait method
    public void visibilityWait(By elementRef) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementRef));
    }

    // click method
    public void click(By elementRef) {
        visibilityWait(elementRef);
        driver.findElement(elementRef).click();
    }

    // read from element
    public String readText(By elementRef) {
        visibilityWait(elementRef);
        return driver.findElement(elementRef).getText();
    }

    // write to element
    public void writeText(By elementRef, String text) {
        visibilityWait(elementRef);
        driver.findElement(elementRef).sendKeys(text);
    }

    // compare two equal strings for assertions
    public void assertStringsEqual(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }
}
