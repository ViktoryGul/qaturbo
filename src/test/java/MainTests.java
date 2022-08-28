import org.testng.annotations.Test;

public class MainTests extends BaseUI {

    @Test
    public void mainPageTest() {
        mainPage.clickRegistrationButton();
        registrationForm.completeRegistrationForm();
    }

    @Test
    public void iframeTest() {
        mainPage.swithToChatIframe();
        mainPage.clickChatButton();
    }
}

