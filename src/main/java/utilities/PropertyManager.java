package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    // setup instances
    private static String chromeDriverPath;
    private static String firefoxDriverPath;
    private static String url;

    // user data instances
    private static String username;
    private static String password;
    private static String bad_username;
    private static String bad_password;
    private static String employee_name;

    public static PropertyManager getInstance() {

        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        // load configuration.properties file
        try {
            FileInputStream file = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // setup
        chromeDriverPath = properties.getProperty("chromeDriverPath");
        firefoxDriverPath = properties.getProperty("firefoxDriverPath");
        url = properties.getProperty("url");

        // user data
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        bad_username = properties.getProperty("bad_username");
        bad_password = properties.getProperty("bad_password");
        employee_name = properties.getProperty("employee_name");


        return instance;
    }

    // getters
    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getFirefoxDriverPath() {
        return firefoxDriverPath;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBadUsername() {
        return bad_username;
    }

    public String getBadPassword() {
        return bad_password;
    }

    public String getEmployeeName() {
        return employee_name;
    }
}
