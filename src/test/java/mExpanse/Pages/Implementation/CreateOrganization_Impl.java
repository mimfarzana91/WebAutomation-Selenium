package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.CreateOrganization_Interface;
import mExpanse.Pages.ObjectRepository.CreateOrganizationOR;
import org.openqa.selenium.WebDriver;

public class CreateOrganization_Impl implements CreateOrganization_Interface {

    public void navigateToCreateOrganization(WebDriver driver) throws InterruptedException {

        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.click(CreateOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.MyOrganizationListLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.MyOrganizationListLabel, CreateOrganizationOR.UIElementsConstant.MyOrganizationsText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.ManageOrganizationButton, driver);
        Operations.click(CreateOrganizationOR.Locator.ManageOrganizationButton, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.NewOrganiationButton, driver);
        Operations.matchText(CreateOrganizationOR.Locator.NewOrganiationButton, CreateOrganizationOR.UIElementsConstant.NewOrganizationButtonText, driver);
        Operations.click(CreateOrganizationOR.Locator.NewOrganiationButton, driver);
        Operations.sleep(3000);

    }

    public void guiVerification(WebDriver driver) throws InterruptedException {

        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.CreateOrganizationFormTitle, driver);
        Operations.matchText(CreateOrganizationOR.Locator.CreateOrganizationFormTitle, CreateOrganizationOR.UIElementsConstant.CreateOrganizationFormTitleText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationNameLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationNameLabel, CreateOrganizationOR.UIElementsConstant.OrganizationNameLabelText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationNameField, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCountryLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationCountryLabel, CreateOrganizationOR.UIElementsConstant.OrganizationCountryLabelText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCountryField, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCurrencyLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationCurrencyLabel, CreateOrganizationOR.UIElementsConstant.OrganizationCurrencyLabelText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCurrencyField, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.SaveButton, driver);
        Operations.matchText(CreateOrganizationOR.Locator.SaveButton, CreateOrganizationOR.UIElementsConstant.SaveButtonText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.CancelButton, driver);
        Operations.matchText(CreateOrganizationOR.Locator.CancelButton, CreateOrganizationOR.UIElementsConstant.CancelButtonText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.CrossButton, driver);
        Operations.sleep(3000);

    }

    public void mandatoryFieldCheck(WebDriver driver) throws InterruptedException {

        Operations.click(CreateOrganizationOR.Locator.SaveButton, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationNameMandatoryLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationNameMandatoryLabel, CreateOrganizationOR.UIElementsConstant.OrganizationNameMandatoryLabelText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCurrencyMandatoryLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationCurrencyMandatoryLabel, CreateOrganizationOR.UIElementsConstant.OrganizationCurrencyMandatoryLabelText, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCountryMandatoryLabel, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationCountryMandatoryLabel, CreateOrganizationOR.UIElementsConstant.OrganizationCountryMandatoryLabelText, driver);
        Operations.sleep(3000);
    }

    public String createOrganization(WebDriver driver) throws InterruptedException {

        LoremIpsum ipsum = new LoremIpsum();
        String organizationName = ipsum.getName() +" Org";

        Operations.click(CreateOrganizationOR.Locator.OrganizationNameField, driver);
        Operations.sendText(CreateOrganizationOR.Locator.OrganizationNameField, organizationName, driver);
        Operations.click(CreateOrganizationOR.Locator.OrganizationCountryField, driver);
        Operations.click(CreateOrganizationOR.Locator.SelectOrganizationCountry, driver);
        Operations.click(CreateOrganizationOR.Locator.OrganizationCurrencyField, driver);
        Operations.click(CreateOrganizationOR.Locator.SelectOrganizationCurrency, driver);
        Operations.click(CreateOrganizationOR.Locator.SaveButton, driver);
        Operations.verifyElementIsDisplayed(CreateOrganizationOR.Locator.OrganizationCreateSuccessMessage, driver);
        Operations.matchText(CreateOrganizationOR.Locator.OrganizationCreateSuccessMessage, CreateOrganizationOR.UIElementsConstant.OrganizationCreateSuccessMessageText, driver);
        Operations.sleep(3000);

        return organizationName;

    }
}
