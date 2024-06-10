package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface CreateOrganization_Interface {

    void navigateToCreateOrganization (WebDriver driver) throws InterruptedException;
    void guiVerification (WebDriver driver) throws InterruptedException;
    void mandatoryFieldCheck (WebDriver driver) throws InterruptedException;
    String createOrganization (WebDriver driver) throws InterruptedException;
}
