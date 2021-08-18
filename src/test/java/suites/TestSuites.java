package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.EmptyPasswordLoginTest;
import tests.EmptyUsernameLoginTest;
import tests.LoginTest;
import tests.LoginWithWrongUserDataTest;
import tests_with_login.AddJobTitleTest;
import tests_with_login.AddUserTest;
import tests_with_login.LogoutTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LoginTest.class,
        LoginWithWrongUserDataTest.class,
        EmptyPasswordLoginTest.class,
        EmptyUsernameLoginTest.class,
        LogoutTest.class,
        AddUserTest.class,
        AddJobTitleTest.class
})

public class TestSuites {
}
