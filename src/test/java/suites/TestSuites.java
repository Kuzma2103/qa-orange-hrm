package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.EmptyPasswordLoginTest;
import tests.EmptyUsernameLoginTest;
import tests.LoginTest;
import tests.LoginWithWrongUserDataTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LoginTest.class,
        LoginWithWrongUserDataTest.class,
        EmptyPasswordLoginTest.class,
        EmptyUsernameLoginTest.class
})

public class TestSuites {
}
