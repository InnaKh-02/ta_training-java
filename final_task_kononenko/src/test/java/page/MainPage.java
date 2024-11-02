package page;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


@Slf4j
public class MainPage extends AbstractPage {
    private static String MAIN_URL="https://www.saucedemo.com/inventory.html";

    @FindBy(xpath = "//div[contains(text(),'Swag Labs')]")
    private static WebElement appLogo;

    @Override
    protected AbstractPage openPage() {
        driver.navigate().to(MAIN_URL);
        return this;
    }

    public MainPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public String getTitle() {
        String title = appLogo.getText();
        log.info("Validation of the title {}", title);
        return title;
    }
}
