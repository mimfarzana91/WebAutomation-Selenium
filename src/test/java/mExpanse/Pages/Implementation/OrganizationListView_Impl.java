package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.OrganizationListView_Interface;
import mExpanse.Pages.ObjectRepository.OrganizationListViewOR;
import org.openqa.selenium.WebDriver;

public class OrganizationListView_Impl implements OrganizationListView_Interface {


    public void guiVerification(WebDriver driver) {

        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.OrganizationNavBarListButton, driver);
        Operations.click(OrganizationListViewOR.Locator.OrganizationNavBarListButton, driver);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.ManageOrganizationButton, driver);
        Operations.click(OrganizationListViewOR.Locator.ManageOrganizationButton, driver);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.NewOrganiationButton, driver);
        Operations.matchText(OrganizationListViewOR.Locator.NewOrganiationButton, OrganizationListViewOR.UIElementsConstant.NewOrganizationButtonText, driver);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.OrganizationIDLabel, driver);
        Operations.matchText(OrganizationListViewOR.Locator.OrganizationIDLabel, OrganizationListViewOR.UIElementsConstant.OrganizationIDLabelText, driver);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.UserRoleLabel, driver);
        Operations.matchText(OrganizationListViewOR.Locator.UserRoleLabel, OrganizationListViewOR.UIElementsConstant.UserRoleLabelText, driver);

    }

    public void verifyCreatedOrganization(WebDriver driver, String organizationName) throws InterruptedException {

        Operations.verifyElementIsDisplayed(Operations.modificationXpath("h4", "ant-typography OrganizationsScreen_orgName__oGJd1", organizationName), driver);
        Operations.click(OrganizationListViewOR.Locator.OrganizationNavBarListButton, driver);
        Operations.sleep(3000);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.OrganizationNavBarListLabel, driver);
        Operations.matchText(OrganizationListViewOR.Locator.OrganizationNavBarListLabel, OrganizationListViewOR.UIElementsConstant.OrganizationNavBarListLabelTitle, driver);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.SearchOrganizationField, driver);
        Operations.verifyElementIsDisplayed(OrganizationListViewOR.Locator.ManageOrganizationButton, driver);
        Operations.click(OrganizationListViewOR.Locator.SearchOrganizationField, driver);
        Operations.sendText(OrganizationListViewOR.Locator.SearchOrganizationField, organizationName, driver);
        Operations.verifyElementIsDisplayed(Operations.modificationXpath("span", "ant-typography OrganizationList_listOrgName__3IHwO", organizationName), driver);


    }
}
