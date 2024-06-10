package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface EditOrganization_Interface {

    void navigateToEditOrganizationForm(WebDriver driver, String organizationName);
    void guiVerification(WebDriver driver);
    void mandatoryFieldCheck(WebDriver driver);
    String editOrganization(WebDriver driver) throws InterruptedException;
}
