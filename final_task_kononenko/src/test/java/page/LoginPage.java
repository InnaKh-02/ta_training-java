package page;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class LoginPage extends AbstractPage {

    private static String URL = "https://www.saucedemo.com/";

    @FindBy(xpath = "//input[@id='user-name']")
    private static WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private static WebElement passwordInput ;

    @FindBy(xpath = "//input[@id='login-button']")
    private static WebElement buttonSubmit;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    @FindBy(xpath = "//input[@id='testWeb']")
    private WebElement test;

    @Override
    public LoginPage openPage() {
        driver.navigate().to(URL);
        log.info("Login page opened");
        return this;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getLoginStatus() {
        return errorMessage.getText();
    }

    public void login(String username,String password)
    {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        buttonSubmit.click();
        log.info("Login performed");
    }
}