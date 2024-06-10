package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.EditOrganization_Interface;
import mExpanse.Pages.ObjectRepository.EditOrganizationOR;
import org.openqa.selenium.WebDriver;

public class EditOrganization_Impl implements EditOrganization_Interface {

    public void navigateToEditOrganizationForm(WebDriver driver, String organizationName) {

        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.click(EditOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.MyOrganizationListLabel, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.ManageOrganizationButton, driver);
        Operations.click(EditOrganizationOR.Locator.ManageOrganizationButton, driver);
        Operations.click(EditOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.verifyElementIsDisplayed(Operations.modificationXpath("span","ant-typography OrganizationList_listOrgName__3IHwO",organizationName), driver);
        Operations.click(Operations.modificationXpath("span","ant-typography OrganizationList_listOrgName__3IHwO",organizationName), driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.FirstOrganizationTooltipButton, driver);
        Operations.click(EditOrganizationOR.Locator.FirstOrganizationTooltipButton, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.EditOrganizationButton, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.DefaultOrganizationSelectionButton, driver);
        Operations.verifyElementIsEnabled(EditOrganizationOR.Locator.DefaultOrganizationSelectionButton, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.DeleteOrganizationButton, driver);
        Operations.click(EditOrganizationOR.Locator.EditOrganizationButton, driver);

    }

    public void guiVerification(WebDriver driver) {

        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.EditOrganizationFormLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.EditOrganizationFormLabel, EditOrganizationOR.UIElementsConstant.CreateOrganizationFormTitleText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationNameLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationNameLabel, EditOrganizationOR.UIElementsConstant.OrganizationNameLabelText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationCountryLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationCountryLabel, EditOrganizationOR.UIElementsConstant.OrganizationCountryLabelText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationCurrencyLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationCurrencyLabel, EditOrganizationOR.UIElementsConstant.OrganizationCurrencyLabelText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationAddressLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationAddressLabel, EditOrganizationOR.UIElementsConstant.OrganizationAddressLabelText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationMobileLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationMobileLabel, EditOrganizationOR.UIElementsConstant.OrganizationMobileLabelText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.EditOrganizationSaveButton, driver);
        Operations.matchText(EditOrganizationOR.Locator.EditOrganizationSaveButton, EditOrganizationOR.UIElementsConstant.SaveButtonText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.EditOrganizationCancelButton, driver);
        Operations.matchText(EditOrganizationOR.Locator.EditOrganizationCancelButton, EditOrganizationOR.UIElementsConstant.CancelButtonText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.EditOrganizationCrossButton, driver);

    }

    public void mandatoryFieldCheck(WebDriver driver) {

        Operations.click(EditOrganizationOR.Locator.EditOrganizationSaveButton, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationAddressMandatoryLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationAddressMandatoryLabel, EditOrganizationOR.UIElementsConstant.OrganizationAddressMandatoryLabelText, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationMobileMandatoryLabel, driver);
        Operations.matchText(EditOrganizationOR.Locator.OrganizationMobileMandatoryLabel, EditOrganizationOR.UIElementsConstant.OrganizationMobileMandatoryLabelText, driver);

    }

    public String editOrganization(WebDriver driver) throws InterruptedException {

        LoremIpsum ipsum = new LoremIpsum();
        String editOrganizationName = ipsum.getName() +" Org Edited";
        String editOrganizationAddress = ipsum.getCity();

        Operations.click(EditOrganizationOR.Locator.OrganizationNameField, driver);
        Operations.sendText(EditOrganizationOR.Locator.OrganizationNameField, editOrganizationName, driver);
        Operations.click(EditOrganizationOR.Locator.OrganizationAddressField, driver);
        Operations.sendText(EditOrganizationOR.Locator.OrganizationAddressField, editOrganizationAddress, driver);
        Operations.click(EditOrganizationOR.Locator.OrganizationMobileField, driver);
        Operations.randomMobileNumber(EditOrganizationOR.Locator.OrganizationMobileField, driver);
        Operations.click(EditOrganizationOR.Locator.EditOrganizationSaveButton, driver);
        Operations.verifyElementIsDisplayed(EditOrganizationOR.Locator.OrganizationEditSuccessMessage, driver);

        return editOrganizationName;

    }
}
