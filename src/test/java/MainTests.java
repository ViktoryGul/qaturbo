import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;


public class MainTests extends BaseUI {
    By registrationButton = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    By textFieldFirstName = By.cssSelector("input[name='first-name']");
    By textFieldLastName = By.cssSelector("input[name='last-name']");
    By textFieldEmail = By.cssSelector("input[id='input_comp-k7ngtbdt1']");
    By textFieldPhone = By.cssSelector("input[name='phone']");
    By textFieldJobTitle = By.xpath("//input[@name='your-job title ']");
    By textFieldEnglishLevel = By.xpath("//input[@name='english-level']");
    By textFieldLearnQA = By.xpath("//input[@name='why-do you want to learn automation?']");
    By linkPricing = By.xpath("//p[text()='Pricing']");
    By linkHome = By.xpath("//p[text()='Home']");

    String firstName = "Qwer";
    String lastName = "Zxcvb";
    String email = "vikaTest@gmail.com";
    String phone = "+30123456987";
    String jobTitle = "junior";
    String englishLevel = "B1 Intermediate";
    String learnQA = "It is my future";

    @Test
    public void mainPageTest() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkPricing));
        driver.findElement(linkPricing).click();
        driver.findElement(linkHome).click();
        wait.until(ExpectedConditions.elementToBeClickable(registrationButton));
        driver.findElements(registrationButton).get(0).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(textFieldFirstName).sendKeys(firstName);
        driver.findElement(textFieldLastName).sendKeys(lastName);
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPhone).sendKeys(phone);
        driver.findElement(textFieldJobTitle).sendKeys(jobTitle);
        driver.findElement(textFieldEnglishLevel).sendKeys(englishLevel);
        driver.findElement(textFieldLearnQA).sendKeys(learnQA);
    }
}
