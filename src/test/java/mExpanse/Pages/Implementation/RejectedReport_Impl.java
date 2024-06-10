/**
 * Owner: Afrina Zahan Mithila
 * Ticket - no: Rejected Report details page
 * Reject Pending Approval Report
 */


package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.RejectedReport_Interface;
import mExpanse.Pages.ObjectRepository.PendingApprovalListOR;
import org.openqa.selenium.WebDriver;
import mExpanse.Pages.ObjectRepository.RejectedReportOR;

public class RejectedReport_Impl implements RejectedReport_Interface {


    @Override
    public void navigateToMyView(WebDriver driver) throws InterruptedException {
        Operations.click(PendingApprovalListOR.Locator.MyView, driver);
        Operations.click(PendingApprovalListOR.Locator.Approvals, driver);

    }

    @Override
    public void guiVerification(WebDriver driver) throws InterruptedException {
        Operations.matchText(RejectedReportOR.Locator.PendingApprovalStatus, RejectedReportOR.UIElementConstant.PendingApprovalText, driver);

    }

    @Override
    public void rejectFlow(WebDriver driver) throws InterruptedException {

        Operations.click(RejectedReportOR.Locator.ReportName, driver);
        Operations.click(RejectedReportOR.Locator.RejectButton, driver);
        Operations.waitUntilElementIsVisible(RejectedReportOR.Locator.RejectReportHeader,driver);

        Operations.matchText(RejectedReportOR.Locator.RejectReportHeader,RejectedReportOR.UIElementConstant.ReportText,driver);
        Operations.matchText(RejectedReportOR.Locator.RejectReasonTitle,RejectedReportOR.UIElementConstant.TitleText,driver);

        Operations.sendText(RejectedReportOR.Locator.RejectReason,"invalid report", driver);
        Operations.click(RejectedReportOR.Locator.RejectConfirm, driver);
        Thread.sleep(5000);
        Operations.matchText(RejectedReportOR.Locator.SuccessMessage,RejectedReportOR.UIElementConstant.SuccessMessageText,driver);
        Operations.waitUntilElementIsVisible(RejectedReportOR.Locator.RejectValidation, driver);

        Operations.matchText(RejectedReportOR.Locator.RejectValidation,RejectedReportOR.UIElementConstant.RejectValidationText,driver);
        Operations.matchText(RejectedReportOR.Locator.RejectReasonValidation,RejectedReportOR.UIElementConstant.RejectReasonText,driver);
        Operations.matchText(RejectedReportOR.Locator.RejectStatusView,RejectedReportOR.UIElementConstant.RejectStatusText,driver);

    }

    @Override
    public void rejectReasonBlankText(WebDriver driver) throws InterruptedException {
        Operations.click(PendingApprovalListOR.Locator.Approvals, driver);
        Operations.sleep(5000);
        Operations.waitUntilElementIsVisible(RejectedReportOR.Locator.ReportName, driver);
        Operations.click(RejectedReportOR.Locator.ReportName, driver);
        Operations.click(RejectedReportOR.Locator.RejectButton, driver);
        Operations.sleep(10000);
        Operations.click(RejectedReportOR.Locator.RejectConfirm, driver);
        Operations.sleep(10000);
        Operations.matchText(RejectedReportOR.Locator.AlertMassage,RejectedReportOR.UIElementConstant.AlertText,driver);


    }


}
