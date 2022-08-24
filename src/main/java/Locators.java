import org.openqa.selenium.By;

public class Locators {
    //Registration
    public static final By REGISTRATION_BUTTON = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    public static final By TEXT_FIELD_FIRST_NAME = By.cssSelector("input[name='first-name']");
    public static final By TEXT_FIELD_LAST_NAME = By.cssSelector("input[name='last-name']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[id='input_comp-k7ngtbdt1']");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='phone']");
    public static final By TEXT_FIELD_JOB_TITLE = By.xpath("//input[@name='your-job title ']");
    public static final By TEXT_FIELD_ENGLISH_LEVEL = By.xpath("//input[@name='english-level']");
    public static final By TEXT_FIELD_LEARN_QA = By.xpath("//input[@name='why-do you want to learn automation?']");

    //ChatIframe
    public static final By CHAT_IFRAME_LOCATOR = By.xpath("//iframe[@aria-label='Wix Chat']");
    public static final By LETS_CHAT_BUTTON =By.xpath("//button[@data-hook='minimized-chat']");
}
