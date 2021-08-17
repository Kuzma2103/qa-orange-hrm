package tests_with_login;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTestWithLogin {

    public WebDriver driver;
    public ChromeOptions options;
    public LoginPage loginPage;

    @Before
    public void setup() {
        options = new ChromeOptions();
        // disable notification pop ups
        options.addArguments("--disable-notifications");
        // start maximized chrome window
        options.addArguments("--start-maximized");

        // set driver paths for chrome and gecko exe in lib folder
        System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getChromeDriverPath()); // chrome
        System.setProperty("webdriver.gecko.driver", PropertyManager.getInstance().getFirefoxDriverPath()); // firefox

        // load chrome browser for tests - change this method if you want firefox browser
        loadChrome();

        loginPage = new LoginPage(driver);

        // implicit wait setup
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // enter url
        driver.get(PropertyManager.getInstance().getUrl());

        loginPage.loginUser();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    // chrome and firefox methods
    private void loadChrome() {
        driver = new ChromeDriver(options);
    }

    private void loadFirefox() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize(); // maximize the window
    }
}
