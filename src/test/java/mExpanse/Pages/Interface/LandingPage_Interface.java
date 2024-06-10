package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface LandingPage_Interface {

    public void guiValidationForNewUser(WebDriver driver)throws InterruptedException;
    public void guiValidationForExistingUser(WebDriver driver)throws InterruptedException;
    public void verifySideMenuArrowClick(WebDriver driver)throws InterruptedException;
    public void verifyOrgDropdown(WebDriver driver)throws InterruptedException;
    public void verifyLanguageDropdown(WebDriver driver)throws InterruptedException;
    public void verifyNotificationPanel(WebDriver driver)throws InterruptedException;
    public void verifyLogout(WebDriver driver)throws InterruptedException;
}
