/**
 * Owner: Eftiar
 * Ticket-no:
 * Modifier-name:
 * Ticket-no:
 **/
package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.UnreportedExpense_Interface;
import mExpanse.Pages.ObjectRepository.PendingApprovalListOR;
import mExpanse.Pages.ObjectRepository.UnreportedExpenseOR;
import org.openqa.selenium.WebDriver;

public class UnreportedExpense_Impl implements UnreportedExpense_Interface {

    public void guiVerification(WebDriver driver) {

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.unreportedExpenseTab, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.unreportedExpenseTab,UnreportedExpenseOR.UIElementConstant.unreportedExpenseText, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.allExpenseTab, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.allExpenseTab,UnreportedExpenseOR.UIElementConstant.allExpenseText, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.newExpenseCTA, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.newExpenseCTA,UnreportedExpenseOR.UIElementConstant.newExpenseBtnText, driver);
        Operations.verifyElementIsEnabled(UnreportedExpenseOR.Locator.newExpenseCTA, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails,UnreportedExpenseOR.UIElementConstant.tableHeaderExpenseDetailsText, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderMerchant, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderMerchant,UnreportedExpenseOR.UIElementConstant.tableHeaderMerchant, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderAmount, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderAmount,UnreportedExpenseOR.UIElementConstant.tableHeaderAmount, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderStatus, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderStatus,UnreportedExpenseOR.UIElementConstant.tableHeaderStatus, driver);

    }

    public void navigateToUnreportedExpense(WebDriver driver) {

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.sideNavMenuMyView, driver);
        Operations.click(UnreportedExpenseOR.Locator.sideNavMenuMyView, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.sideNavSubMenuExpenses, driver);
        Operations.click(UnreportedExpenseOR.Locator.sideNavSubMenuExpenses, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.unreportedExpenseTab, driver);

    }

    public void verifyCreatedUnreportedExpenseShownInTable(String categoryName,WebDriver driver) throws InterruptedException {

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableFirstDataExpenseName, driver);
        Thread.sleep(2000);
        Operations.matchText(UnreportedExpenseOR.Locator.tableFirstDataExpenseName, categoryName, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableFirstDataExpenseMerchant, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableFirstDataExpenseAmount, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableFirstDataExpenseStatus, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableFirstDataExpenseStatus, "UNREPORTED", driver);
    }

    public void tableSortingAndPagination(WebDriver driver) throws InterruptedException {
        Operations.mouseHoverOnElement(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails, driver);
        Operations.click(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails, driver);
        String text = Operations.getTooltipText(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails, UnreportedExpenseOR.Locator.TooltipAsc, driver);
        System.out.println(text);
        Operations.matchText(UnreportedExpenseOR.Locator.TooltipAsc, "Click to sort ascending", driver);
        Thread.sleep(7000);

        Operations.mouseHoverOnElement(UnreportedExpenseOR.Locator.tableHeaderMerchant, driver);
        Operations.click(UnreportedExpenseOR.Locator.tableHeaderMerchant, driver);
        String text2 = Operations.getTooltipText(UnreportedExpenseOR.Locator.tableHeaderMerchant, UnreportedExpenseOR.Locator.TooltipAsc, driver);
        System.out.println(text2);
        Operations.matchText(UnreportedExpenseOR.Locator.TooltipAsc, "Click to sort ascending", driver);
        Thread.sleep(7000);

        Operations.mouseHoverOnElement(UnreportedExpenseOR.Locator.tableHeaderAmount, driver);
        Operations.click(UnreportedExpenseOR.Locator.tableHeaderAmount, driver);
        String text3 = Operations.getTooltipText(UnreportedExpenseOR.Locator.tableHeaderAmount, UnreportedExpenseOR.Locator.TooltipAsc, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.TooltipAsc, "Click to sort ascending", driver);
        System.out.println(text3);

        if (Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage, driver) == true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Thread.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }

            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationLeft, driver);
            }
        }

        else{
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightInActive, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationLeft, driver);
            }
        }

    }
}


