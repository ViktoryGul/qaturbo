import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class IframeTest extends BaseUI {
    By chatIframeLocator = By.xpath("//iframe[@aria-label='Wix Chat']");
    By letsChatButton =By.xpath("//button[@data-hook='minimized-chat']");

    @Test
    public void iframeTest(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(chatIframeLocator));
        WebElement chatIframe = driver.findElement(chatIframeLocator);
        driver.switchTo().frame(chatIframe);
        driver.findElement(letsChatButton).click();
    }
}
