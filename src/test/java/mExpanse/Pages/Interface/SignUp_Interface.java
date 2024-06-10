package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface SignUp_Interface {

    public void guiVerification(WebDriver driver)throws InterruptedException;
    public void alertVerification(WebDriver driver)throws InterruptedException;
    public void alreadyRegisteredEmailVerification(WebDriver driver)throws InterruptedException;

    public String[] validRegistration(WebDriver driver)throws InterruptedException;
    public void passwordAlerts(WebDriver driver)throws InterruptedException;

}
