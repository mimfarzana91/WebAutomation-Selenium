package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface OrganizationListView_Interface {

    void guiVerification (WebDriver driver);
    void verifyCreatedOrganization (WebDriver driver, String organizationName) throws InterruptedException;
}
