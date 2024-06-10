package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface Merchant_Interface {
    public void navigateToAdminViewMerchant(WebDriver driver);
    public void navigateToAddMerchant(WebDriver driver);
    public void guiVerification(WebDriver driver);
    public  void verifyCancelButtonMerchant(WebDriver driver);
    public  void createValidNewMerchant(WebDriver driver);
    public void verifyCancelCreatingMerchant(WebDriver driver);
    public void verifyMandatoryFieldAlert(WebDriver driver);
    //public void verifySameMerchantNameErrorAlertAlert(WebDriver driver);
    //public void verifySameMerchantCodeErrorAlertAlert(WebDriver driver);

}