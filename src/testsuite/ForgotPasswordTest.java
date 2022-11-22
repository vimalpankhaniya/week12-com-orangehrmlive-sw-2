package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNotNavigateToForgotPasswordPageSuccessfully(){
        clickOnElement(By.xpath("/p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String expectedMessage="Reset Password";
        Assert.assertEquals(expectedMessage,getTextFromElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")));
    }
    }

