import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickRegistrationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.REGISTRATION_BUTTON));
        driver.findElements(Locators.REGISTRATION_BUTTON).get(0).click();
    }

    public void swithToChatIframe() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CHAT_IFRAME_LOCATOR));
        WebElement chatIframe = driver.findElement(Locators.CHAT_IFRAME_LOCATOR);
        driver.switchTo().frame(chatIframe);
    }

    public void clickChatButton() {
        driver.findElement(Locators.LETS_CHAT_BUTTON).click();
    }
}
