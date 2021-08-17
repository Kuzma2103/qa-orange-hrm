package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    // setup instances
    private static String chromeDriverPath;
    private static String firefoxDriverPath;
    private static String url;

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

        chromeDriverPath = properties.getProperty("chromeDriverPath");
        firefoxDriverPath = properties.getProperty("firefoxDriverPath");
        url = properties.getProperty("url");

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
}
