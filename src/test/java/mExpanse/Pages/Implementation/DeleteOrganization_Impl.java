package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.DeleteOrganization_Interface;
import mExpanse.Pages.ObjectRepository.DeleteOrganizationOR;
import org.openqa.selenium.WebDriver;

public class DeleteOrganization_Impl implements DeleteOrganization_Interface {

    public void navigateToDeleteOrganization(WebDriver driver) {

        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.click(DeleteOrganizationOR.Locator.OrganizationListButton, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.ManageOrganizationButton, driver);
        Operations.click(DeleteOrganizationOR.Locator.ManageOrganizationButton, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.FirstOrganizationTooltipButton, driver);
        Operations.click(DeleteOrganizationOR.Locator.FirstOrganizationTooltipButton, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DefaultOrganizationSelectionButton, driver);
        Operations.matchText(DeleteOrganizationOR.Locator.DefaultOrganizationSelectionButton, DeleteOrganizationOR.UIElementsConstant.DefaultOrganizationButtonText, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DeleteOrganizationButton, driver);
        Operations.matchText(DeleteOrganizationOR.Locator.DeleteOrganizationButton, DeleteOrganizationOR.UIElementsConstant.DeleteOrganizationButtonText, driver);
        Operations.click(DeleteOrganizationOR.Locator.DeleteOrganizationButton, driver);

    }

    public void deleteOrganization(WebDriver driver) {

        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DeleteOrganizationModalTitle, driver);

        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DeleteExpenseCountTitle, driver);
        Operations.matchText(DeleteOrganizationOR.Locator.DeleteExpenseCountTitle, DeleteOrganizationOR.UIElementsConstant.ExpenseTitleText, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DeleteReportCountTitle, driver);
        Operations.matchText(DeleteOrganizationOR.Locator.DeleteReportCountTitle, DeleteOrganizationOR.UIElementsConstant.ReportTitleText, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.CancelButton, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DeleteButton, driver);
        Operations.click(DeleteOrganizationOR.Locator.DeleteButton, driver);
        Operations.verifyElementIsDisplayed(DeleteOrganizationOR.Locator.DeleteSuccessMessage, driver);
        Operations.matchText(DeleteOrganizationOR.Locator.DeleteSuccessMessage, DeleteOrganizationOR.UIElementsConstant.DeleteSuccessMessageText, driver);


    }
}
