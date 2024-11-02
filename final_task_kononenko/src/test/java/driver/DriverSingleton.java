package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

@Slf4j
public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton(){
    }

    public static WebDriver getDriver(){
        if (driver == null){
            switch (System.getProperty("browser")){
                case "chrome": {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                }
                case "edge": {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                }
                default: {
                    log.error("Source browser is not supported. Use 'chrome' or 'edge'");
                    throw new RuntimeException("Source browser is not supported. Use 'chrome' or 'edge'");
                }
            }

            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
