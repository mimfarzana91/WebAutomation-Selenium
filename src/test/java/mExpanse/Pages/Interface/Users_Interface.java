package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface Users_Interface {

     void guiVerification(WebDriver driver) throws InterruptedException;
     void checkBlankMandatoryFields(WebDriver driver);
     void checkCancelButtonClosesDrawer(WebDriver driver);
     void checkCloseButtonClosesDrawer(WebDriver driver);
     void checkEmailWithIncorrectFormat(WebDriver driver) throws InterruptedException;
     void checkForSubmitterApprovesAndForwardsToNotDisplaying(WebDriver driver) throws InterruptedException;
     void addRandomUser(WebDriver driver, String Role) throws InterruptedException;
     void addNewAdmin(WebDriver driver) throws InterruptedException;
     void createNewDesignation(WebDriver driver, String Role) throws InterruptedException;
     void addUserForFutureDate(WebDriver driver, String Role) throws InterruptedException;
}
