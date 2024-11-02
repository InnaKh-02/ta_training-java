package test;

import driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import util.TestListener;

@ExtendWith(TestListener.class)
public class DriverManipulator {
    protected static WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = DriverSingleton.getDriver();
    }
    @AfterEach
    public void stopBrowser(){
        DriverSingleton.closeDriver();
    }
}
