package mExpanse.Pages.Implementation;


import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Merchant_Interface;
import mExpanse.Pages.ObjectRepository.MerchantOR;

import org.openqa.selenium.WebDriver;

public class Merchant_Impl implements Merchant_Interface {
    @Override
    public void navigateToAdminViewMerchant(WebDriver driver) {

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.sideNavMenuAdminView, driver);
        Operations.click(MerchantOR.Locator.sideNavMenuAdminView, driver);
        Operations.waitUntilElementIsVisible(MerchantOR.Locator.sideNavSubMenuMerchant, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.sideNavSubMenuMerchant, driver);
        Operations.click(MerchantOR.Locator.sideNavSubMenuMerchant, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.addMerchantCTA, driver);
    }
    @Override
    public void navigateToAddMerchant(WebDriver driver) {

        Operations.click(MerchantOR.Locator.addMerchantCTA, driver);
        Operations.waitUntilElementIsVisible(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.drawerTitleAddMerchant, driver);

    }


    @Override
    public void guiVerification(WebDriver driver) {
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.matchText(MerchantOR.Locator.drawerTitleAddMerchant,MerchantOR.UIElementConstant.drawerTitleAddMerchant, driver);

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.modalCloserBTN, driver);

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.fieldTitleMerchantName, driver);
        Operations.matchText(MerchantOR.Locator.fieldTitleMerchantName,MerchantOR.UIElementConstant.fieldTitleMerchantName, driver);

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.merchantNameTextBox, driver);
        Operations.matchAttribute(MerchantOR.Locator.merchantNameTextBox,MerchantOR.UIElementConstant.merchantNameTextBox,"placeholder", driver);

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.fieldTitleMerchantCode, driver);
        Operations.matchText(MerchantOR.Locator.fieldTitleMerchantCode,MerchantOR.UIElementConstant.fieldTitleMerchantCode, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.MerchantCodeTextBox, driver);
        Operations.matchAttribute(MerchantOR.Locator.MerchantCodeTextBox,MerchantOR.UIElementConstant.MerchantCodeTextBox,"placeholder", driver);

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.saveButtonMerchant, driver);
        Operations.matchText(MerchantOR.Locator.saveButtonMerchant,MerchantOR.UIElementConstant.saveButtonMerchant, driver);

        Operations.verifyElementIsDisplayed(MerchantOR.Locator.cancelButtonMerchant, driver);
        Operations.matchText(MerchantOR.Locator.cancelButtonMerchant,MerchantOR.UIElementConstant.cancelButtonMerchant, driver);

    }

    @Override
    public void verifyCancelButtonMerchant(WebDriver driver) {
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.modalCloserBTN, driver);
        Operations.click(MerchantOR.Locator.modalCloserBTN, driver);

    }


    public  void createValidNewMerchant(WebDriver driver){
        LoremIpsum ipsum = new LoremIpsum();
        String merchantName = ipsum.getWords(2,3);
        String merchantCOde = ipsum.getWords(1,2);
        int randomMerchantCode = Operations.createRandomIntBetween(1000,4000);

        Operations.waitUntilElementIsVisible(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.drawerTitleAddMerchant, driver);

        Operations.click(MerchantOR.Locator.merchantNameTextBox, driver);
        Operations.sendText(MerchantOR.Locator.merchantNameTextBox, merchantName, driver);

        Operations.click(MerchantOR.Locator.MerchantCodeTextBox, driver);
        //Operations.sendText(MerchantOR.Locator.MerchantCodeTextBox, merchantCOde, driver);
        Operations.sendText(MerchantOR.Locator.MerchantCodeTextBox,String.valueOf(randomMerchantCode), driver);

        Operations.click(MerchantOR.Locator.saveButtonMerchant, driver);

        Operations.waitUntilElementIsVisible(MerchantOR.Locator.creationNewMerchantAlert, driver);
        Operations.matchText(MerchantOR.Locator.creationNewMerchantAlert,MerchantOR.UIElementConstant.creationNewMerchantAlert, driver);
    }
    public  void verifyCancelCreatingMerchant(WebDriver driver){
        LoremIpsum ipsum = new LoremIpsum();
        String merchantName = ipsum.getWords(3,4);
        String merchantCOde = ipsum.getWords(2,3);

        Operations.waitUntilElementIsVisible(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.click(MerchantOR.Locator.merchantNameTextBox, driver);
        Operations.sendText(MerchantOR.Locator.merchantNameTextBox, merchantName, driver);
        Operations.click(MerchantOR.Locator.MerchantCodeTextBox, driver);
        Operations.sendText(MerchantOR.Locator.MerchantCodeTextBox, merchantCOde, driver);
        Operations.click(MerchantOR.Locator.cancelButtonMerchant, driver);

    }
    public  void verifyMandatoryFieldAlert(WebDriver driver){
        Operations.waitUntilElementIsVisible(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.verifyElementIsDisplayed(MerchantOR.Locator.drawerTitleAddMerchant, driver);
        Operations.click(MerchantOR.Locator.saveButtonMerchant, driver);
        Operations.waitUntilElementIsVisible(MerchantOR.Locator.fieldMerchantNameErrorAlert, driver);
        Operations.matchText(MerchantOR.Locator.fieldMerchantNameErrorAlert,MerchantOR.UIElementConstant.fieldMerchantNameErrorAlert , driver);
        Operations.click(MerchantOR.Locator.cancelButtonMerchant, driver);

    }
}