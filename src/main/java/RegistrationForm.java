import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {
    public RegistrationForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void completeRegistrationForm() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(Locators.TEXT_FIELD_FIRST_NAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_FIELD_LAST_NAME).sendKeys(Data.lastName);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(Locators.TEXT_FIELD_JOB_TITLE).sendKeys(Data.jobTitle);
        driver.findElement(Locators.TEXT_FIELD_ENGLISH_LEVEL).sendKeys(Data.englishLevel);
        driver.findElement(Locators.TEXT_FIELD_LEARN_QA).sendKeys(Data.learnQA);
    }

}
