package mExpanse.Pages.Implementation;
import mExpance.Library.Operations;
import mExpanse.Pages.ObjectRepository.AllReportOR;
import mExpanse.Pages.ObjectRepository.NewExpanseOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AllReport_Impl {

//    NewExpanse_Impl newExpanse = new NewExpanse_Impl();
//    NewReport_Impl newReport=new NewReport_Impl();
//    SubmitReport_Impl submitReport = new SubmitReport_Impl();

    public void navigateToApprovals(WebDriver driver){
        Operations.click(NewExpanseOR.locator.myView,driver);
        Operations.click(AllReportOR.Locator.Approvals,driver);
        Operations.click(AllReportOR.Locator.AllReportList,driver);
    }

    public void guiVerificationOfAllReports(WebDriver driver) throws InterruptedException {

        //All Reports Pages guiVerification
        Thread.sleep(10);
        Operations.click(AllReportOR.Locator.ClickAllReport,driver);
        Operations.click(AllReportOR.Locator.CLickAllReportOption, driver);

        // Verifying Table Headers of All Reports Filtered Table
        Operations.matchText(AllReportOR.Locator.CLickAllReportOption,AllReportOR.UIElementConstant.AllReportsText, driver);
        Operations.matchText(AllReportOR.Locator.ClickApprovedOptionFilter,AllReportOR.UIElementConstant.ApproveText, driver);
        Operations.matchText(AllReportOR.Locator.RejectedOptionText,AllReportOR.UIElementConstant.RejectedOptionText, driver);
        Operations.matchText(AllReportOR.Locator.ReimbursedOptionText,AllReportOR.UIElementConstant.ReimburseOptionText, driver);

        Operations.matchText(AllReportOR.Locator.SubmitterColumn,AllReportOR.UIElementConstant.SubmitterColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportColumn,AllReportOR.UIElementConstant.ReportColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportNameColumn,AllReportOR.UIElementConstant.ReportNameColumnText,driver);
        Operations.matchText(AllReportOR.Locator.StatusColumn,AllReportOR.UIElementConstant.StatusColumnText,driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn, AllReportOR.UIElementConstant.CurrentApproverColumnText, driver);
        Operations.scrollIntoElement(AllReportOR.Locator.ToBeReimburesed,driver);
        Operations.matchText(AllReportOR.Locator.TotalColum,AllReportOR.UIElementConstant.TotalColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ToBeReimburesed,AllReportOR.UIElementConstant.ReimbursedText,driver);

        String StatusOnTheList = Operations.findElement(AllReportOR.Locator.Status,driver).getText();
        System.out.println("Status on the All report list: "+StatusOnTheList);
        String CurrentApproversName = Operations.findElement(AllReportOR.Locator.currentApproversName, driver).getText();
        System.out.println("Current Approver Name the All report list: "+CurrentApproversName);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn,AllReportOR.UIElementConstant.CurrentApproverColumnText,driver);

        Operations.sleep(30000);
        Operations.click(AllReportOR.Locator.PageSizeArrow,driver);
        Operations.waitUntilElementIsVisible(AllReportOR.Locator.PageSize10,driver);
        Operations.matchText(AllReportOR.Locator.PageSize10,AllReportOR.UIElementConstant.PageSize10Text,driver);
        Operations.matchText(AllReportOR.Locator.PageSize15,AllReportOR.UIElementConstant.PageSize15Text,driver);
        Operations.matchText(AllReportOR.Locator.PageSize25,AllReportOR.UIElementConstant.PageSize25Text,driver);

        //Approved Pages guiVerification
        Operations.click(AllReportOR.Locator.ClickAllReport,driver);
        Operations.click(AllReportOR.Locator.ClickApprovedOptionFilter, driver);

        Operations.sleep(10000);
        // Verifying Table Headers of Approved Filtered Table
        Operations.matchText(AllReportOR.Locator.SubmitterColumn,AllReportOR.UIElementConstant.SubmitterColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportColumn,AllReportOR.UIElementConstant.ReportColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportNameColumn,AllReportOR.UIElementConstant.ReportNameColumnText,driver);
        Operations.matchText(AllReportOR.Locator.StatusColumn,AllReportOR.UIElementConstant.StatusColumnText,driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn, AllReportOR.UIElementConstant.CurrentApproverColumnText, driver);
        Operations.scrollIntoElement(AllReportOR.Locator.ToBeReimburesed,driver);
        Operations.matchText(AllReportOR.Locator.TotalColum,AllReportOR.UIElementConstant.TotalColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ToBeReimburesed,AllReportOR.UIElementConstant.ReimbursedText,driver);

        //Reading first Approved Row's Status and Approvals Name
        Operations.matchText(AllReportOR.Locator.StatusApproved,AllReportOR.UIElementConstant.StatusTextOfApproved,driver);
        Operations.matchText(AllReportOR.Locator.currentApproversName,AllReportOR.UIElementConstant.ApproverUserName,driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn,AllReportOR.UIElementConstant.CurrentApproverColumnText,driver);

        Operations.click(AllReportOR.Locator.PageSizeArrowApproved,driver);
        Operations.waitUntilElementIsVisible(AllReportOR.Locator.PageSize10,driver);
        Operations.matchText(AllReportOR.Locator.PageSize10,AllReportOR.UIElementConstant.PageSize10Text,driver);
        Operations.matchText(AllReportOR.Locator.PageSize15,AllReportOR.UIElementConstant.PageSize15Text,driver);
        Operations.matchText(AllReportOR.Locator.PageSize25,AllReportOR.UIElementConstant.PageSize25Text,driver);


        // Rejected table guiVerification
        Operations.click(AllReportOR.Locator.ClickApproved,driver);
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.ClickReject, driver);

        Operations.sleep(10000);
        // Verifying Table Headers of Rejected Filtered Table
        Operations.matchText(AllReportOR.Locator.SubmitterColumn,AllReportOR.UIElementConstant.SubmitterColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportColumn,AllReportOR.UIElementConstant.ReportColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportNameColumn,AllReportOR.UIElementConstant.ReportNameColumnText,driver);
        Operations.matchText(AllReportOR.Locator.StatusColumn,AllReportOR.UIElementConstant.StatusColumnText,driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn, AllReportOR.UIElementConstant.CurrentApproverColumnText, driver);
        Operations.scrollIntoElement(AllReportOR.Locator.ToBeReimburesed,driver);
        Operations.matchText(AllReportOR.Locator.TotalColum,AllReportOR.UIElementConstant.TotalColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ToBeReimburesed,AllReportOR.UIElementConstant.ReimbursedText,driver);

        Operations.matchText(AllReportOR.Locator.StatusRejectedPage,AllReportOR.UIElementConstant.StatusText,driver);
        String CurrentApproverName = Operations.findElement(AllReportOR.Locator.currentApproversName,driver).getText();
        System.out.println("Current Approvers name after filtering by Rejected : "+CurrentApproverName);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn,AllReportOR.UIElementConstant.CurrentApproverColumnText,driver);


        // Reimbursed table guiVerification
        Operations.click(AllReportOR.Locator.ClickFilterReject, driver);
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.ClickReimbursedFilter, driver);

        Operations.sleep(10000);
        // Verifying Table Headers of Reimbursed Filtered Table
        Operations.matchText(AllReportOR.Locator.SubmitterColumn,AllReportOR.UIElementConstant.SubmitterColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportColumn,AllReportOR.UIElementConstant.ReportColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ReportNameColumn,AllReportOR.UIElementConstant.ReportNameColumnText,driver);
        Operations.matchText(AllReportOR.Locator.StatusColumn,AllReportOR.UIElementConstant.StatusColumnText,driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn, AllReportOR.UIElementConstant.CurrentApproverColumnText, driver);
        Operations.scrollIntoElement(AllReportOR.Locator.ToBeReimburesed,driver);
        Operations.matchText(AllReportOR.Locator.TotalColum,AllReportOR.UIElementConstant.TotalColumnText,driver);
        Operations.matchText(AllReportOR.Locator.ToBeReimburesed,AllReportOR.UIElementConstant.ReimbursedText,driver);

        String StatusReimbursedPage = Operations.findElement(AllReportOR.Locator.StatusReimbursedPage,driver).getText();
        System.out.println("Status of Reimbursed : "+StatusReimbursedPage);
        String CurrentApproverNameReimbursed = Operations.findElement(AllReportOR.Locator.currentApproversName,driver).getText();
        System.out.println("Current Approvers name after filtering by Approved : "+CurrentApproverNameReimbursed);
        Operations.matchText(AllReportOR.Locator.CurrentApproverColumn,AllReportOR.UIElementConstant.CurrentApproverColumnText,driver);
    }
    public void paginationVerification(WebDriver driver) throws InterruptedException {

        // Navigating to All Reports Page
        Operations.sleep(30000);
        Operations.click(AllReportOR.Locator.ClickReimbursed, driver);
        Operations.sleep(20000);
        Operations.click(AllReportOR.Locator.CLickAllReportOption, driver);

        // Navigating to Page 25
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.PageSizeArrowApproved,driver);
        Operations.waitUntilElementIsVisible(AllReportOR.Locator.PageSize10,driver);
        Operations.sleep(20000);
        Operations.scrollIntoElement(AllReportOR.Locator.sizeOptionpanel,driver);
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.PageSize25,driver);

        // Getting the Table Size through table's row count
        Operations.sleep(10000);
        int size=Operations.tableSize(AllReportOR.Locator.tableXpath,driver);
        if(size<=25){
            System.out.println(size);
        }
        else{
            System.out.println("page size is not working");
        }

        // Navigating to the forwarding Pages for table data per page 25
        if(Operations.verifyElementIsPresent(AllReportOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(10000);
                Operations.click(AllReportOR.Locator.PaginationRightActive, driver);
            }
            // Navigating to the previous Pages for table data per page 25
            Operations.sleep(10000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationLeft, driver) == true) {
                Operations.sleep(10000);
                Operations.click(AllReportOR.Locator.PaginationLeft, driver);
            }
        }
        else {
            //Checking whether the Right or next page button is inactive for table data per page 25
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationRightInActive, driver) == true) {
                Operations.sleep(10000);
                Operations.click(AllReportOR.Locator.PaginationRightActive, driver);
            }

            //Checking whether the Left or next page button is inactive for table data per page 25
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationLeft, driver) == true) {
                Operations.sleep(10000);
                Operations.click(AllReportOR.Locator.PaginationLeft, driver);
            }
        }

        // Navigating to data per page- 15
        Operations.sleep(20000);
        Operations.click(AllReportOR.Locator.PageSizeArrow,driver);
        Operations.scrollIntoElement(AllReportOR.Locator.sizeOptionpanel,driver);
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.PageSize15,driver);
        Operations.sleep(20000);

        // Getting the Table Size through table's row count
        int size2=Operations.tableSize(AllReportOR.Locator.tableXpath,driver);

        if(size2<=15){
            System.out.println(size2);
        }
        else{
            System.out.println("page size is not working");
        }

        // Navigating to the forwarding Pages for table data per page 15
        if(Operations.verifyElementIsPresent(AllReportOR.Locator.secondPage,driver)==true) {
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationRightActive15, driver) == true) {
                Operations.sleep(8000);
                Operations.click(AllReportOR.Locator.PaginationRightActive15, driver);
            }
            // Navigating to the previous Pages for table data per page 15
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationLeft15, driver) == true) {
                Operations.sleep(8000);
                Operations.click(AllReportOR.Locator.PaginationLeft15, driver);
            }
        }

        else {
            //Checking whether the Right or next page button is inactive for table data per page 15
            Operations.sleep(8000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationRightInActive15, driver) == true) {
                Operations.sleep(8000);
                Operations.click(AllReportOR.Locator.PaginationRightActive15, driver);
            }
            //Checking whether the left or previous page button is inactive for table data per page 15
            Operations.sleep(8000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationLeft15, driver) == true) {
                Operations.sleep(8000);
                Operations.click(AllReportOR.Locator.PaginationLeft15, driver);
            }

        }
        // Navigating to data per page- 10
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.PageSizeArrow,driver);
        Operations.scrollIntoElement(AllReportOR.Locator.sizeOptionpanel,driver);
        Operations.sleep(10000);
        Operations.click(AllReportOR.Locator.PageSize10,driver);
        Operations.sleep(10000);
        // Getting the Table Size through table's row count
        int size3=Operations.tableSize(AllReportOR.Locator.tableXpath,driver);
        if(size3<=10){
            System.out.println(size3);
        }
        else{
            System.out.println("page size is not working");
        }

        // Navigating to the forwarding Pages for table data per page 10
        if(Operations.verifyElementIsPresent(AllReportOR.Locator.secondPage,driver)==true) {
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationRightActive10, driver) == true) {
                Operations.sleep(4000);
                Operations.click(AllReportOR.Locator.PaginationRightActive10, driver);
            }
            // Navigating to the previous Pages for table data per page 10
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationLeft10, driver) == true) {
                Operations.sleep(4000);
                Operations.click(AllReportOR.Locator.PaginationLeft10, driver);
            }
        }
        else{
            //Checking whether the Right or next page button is inactive for table data per page 10
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationRightInActive10, driver) == true) {
                Operations.sleep(4000);
                Operations.click(AllReportOR.Locator.PaginationRightActive10, driver);
            }
            //Checking whether the left or previous page button is inactive for table data per page 15
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(AllReportOR.Locator.PaginationLeft10, driver) == true) {
                Operations.sleep(4000);
                Operations.click(AllReportOR.Locator.PaginationLeft10, driver);
            }
        }


    }

    public void navigateToPending(WebDriver driver) {
        Operations.click(NewExpanseOR.locator.myView,driver);
        Operations.click(AllReportOR.Locator.Approvals,driver);
        Operations.click(AllReportOR.Locator.pendingApprovalList,driver);
    }

    public void ApprovingReport(WebDriver driver) throws InterruptedException {

        // Verifying Pending pages first row data
        String StatusOnList = Operations.findElement(AllReportOR.Locator.StatusOnList, driver).getText();
        String SubmitterName = Operations.findElement(AllReportOR.Locator.SubmitterNameFromList, driver).getText();
        String ReportNoList = Operations.findElement(AllReportOR.Locator.ReportNoList, driver).getText();
        String ReportNameList = Operations.findElement(AllReportOR.Locator.ReportNameList, driver).getText();
        String CurrentApproverNameList = Operations.findElement(AllReportOR.Locator.CurrentApproverNameList, driver).getText();
        String TotalOnList = Operations.findElement(AllReportOR.Locator.TotalOnList, driver).getText();
        String ToBeReimbursedList = Operations.findElement(AllReportOR.Locator.ToBeReimbursedList, driver).getText();
        System.out.println("Status on the list is: "+StatusOnList);
        System.out.println("Submitter Name on the list is: "+SubmitterName);
        System.out.println("Report No on the list is: "+ReportNoList);
        System.out.println("Report Name on the list is: "+ReportNameList);
        System.out.println("Current Approver NameList on the list is: "+CurrentApproverNameList);
        System.out.println("Total on the list is: "+TotalOnList);
        System.out.println("To be Reimbursed on the list is: "+ToBeReimbursedList);

        // Navigating to the pending Report details page's gui
        Operations.sleep(4000);
        Operations.click(AllReportOR.Locator.ClickReportName, driver);
        Operations.matchText(AllReportOR.Locator.VfyPendingApprovalbadge,StatusOnList , driver);
        Operations.matchText(AllReportOR.Locator.Submittername, SubmitterName, driver);
        Operations.matchText(AllReportOR.Locator.ReportNo, ReportNoList, driver);
        Operations.matchText(AllReportOR.Locator.ReportName, ReportNameList, driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverNameD, CurrentApproverNameList, driver);
        String Duration = Operations.findElement(AllReportOR.Locator.DurationLabelD, driver).getText();
        String DurationDate = Operations.findElement(AllReportOR.Locator.DurationDate, driver).getText();
        String Total = Operations.findElement(AllReportOR.Locator.Total,driver).getText();
        String ToBeReimbursed = Operations.findElement(AllReportOR.Locator.ToBeReimbursed,driver).getText();
        System.out.println("Total on the Details page is: "+Total);
        System.out.println("To Be Reimbursed on the Details page is: "+ToBeReimbursed);
        System.out.println("Duration on the Details Page : "+Duration);
        System.out.println("Duration Date on the Details Page : "+DurationDate);

        // Approve button modal check
        Operations.click(AllReportOR.Locator.ApproveBtn, driver);

        WebElement CancelBtn = Operations.findElement(AllReportOR.Locator.CancelBtn, driver);
        System.out.print(CancelBtn.isEnabled());
        WebElement ApproveBtnPopUp = Operations.findElement(AllReportOR.Locator.ApproveBtnPopUp, driver);
        System.out.print(ApproveBtnPopUp.isEnabled());
        Operations.sleep(4000);
        Operations.click(AllReportOR.Locator.ApproveBtnPopUp, driver);

        // Verifying Approved report's success message
        Operations.sleep(1000);
        String successfullyApprovedMsg =  Operations.findElement(AllReportOR.Locator.SuccessfullyApprovedMsg, driver ).getText();
        System.out.println("Successfully Approved Success message :"+successfullyApprovedMsg);

        // verifying that the status and current approver has been updated on the Details page
        Operations.matchText(AllReportOR.Locator.VfyPendingApprovalbadge,AllReportOR.UIElementConstant.StatusafterApproving , driver);
        Operations.matchText(AllReportOR.Locator.CurrentApproverNameD,AllReportOR.UIElementConstant.CurrentApprover2,driver);



    }
}

