package test;

import lombok.extern.slf4j.Slf4j;
import model.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import page.LoginPage;
import page.MainPage;
import service.UserCreator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class LoginTest extends DriverManipulator {

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void loginTest(User user){

        log.info("Begin test with {} and {}", user.getUsername(), user.getPassword());

        LoginPage l = new LoginPage(driver).openPage();
        l.login(user.getUsername(),user.getPassword());

        String actualStatus = "";
        try {
            actualStatus = l.getLoginStatus();
        } catch (Exception ignore) { }

        if(actualStatus.isEmpty()){
            MainPage mainPage = new MainPage(driver);
            String actualTitle = mainPage.getTitle();
            assertEquals(actualTitle, user.getStatus());
        }
        else{
            assertEquals(actualStatus, user.getStatus());
        }
        log.info("End of this test with {} and {}", user.getUsername(), user.getPassword());
    }

    static Object[][] dataProvider() {
        return new Object[][]{{UserCreator.getInfoUC1()},
                {UserCreator.getInfoUC2()},
                {UserCreator.getInfoUC3()}};
    }
}
