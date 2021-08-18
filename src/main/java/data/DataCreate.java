package data;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ArrayList;

public class DataCreate extends BasePage {

    public DataCreate(WebDriver driver) {
        super(driver);
    }

    public static ArrayList<String> createData(ArrayList<String> userData) {
        Faker faker = new Faker();

        // generate fake data for add user from admin page
        userData.add(faker.name().username()); // 0 Username
        userData.add(faker.internet().password()); // 1 Password

        // generate fake data for add job title
        userData.add(faker.funnyName().name()); // 2 Job Title
        userData.add(faker.chuckNorris().fact()); // 3 Job Description

        return userData;
    }
}
