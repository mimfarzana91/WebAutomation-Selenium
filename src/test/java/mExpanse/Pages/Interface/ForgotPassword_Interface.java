package mExpanse.Pages.Interface;
import org.openqa.selenium.WebDriver;

public interface ForgotPassword_Interface {
    public void guiVerification(WebDriver driver)throws InterruptedException;
    public void blankEmailValidation(WebDriver driver)throws InterruptedException;

    public void invalidEmailValidation(WebDriver driver)throws InterruptedException;

    void nonUserEmailVerification(WebDriver driver) throws InterruptedException;

    public void validEmailResetPassword(WebDriver driver, String mail)throws InterruptedException;

    public void resetPassword(String newPass, WebDriver driver)throws InterruptedException;

    public void invalidPassword(WebDriver driver) throws InterruptedException;

    public void invalidLink(WebDriver driver) throws InterruptedException;

    void notResetPassword(String newPass, WebDriver driver) throws InterruptedException;
}

