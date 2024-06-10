package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class AllReportOR {

    public static class Locator{
        public static By MyView =By.xpath("//span[contains(text(),'My View')]");
        public static By Approvals=By.xpath("//span[@class='ant-menu-title-content']//a[contains(text(),'Approvals')]");
        public static By pendingApprovalList=By.xpath("//div[@class='ant-tabs-tab-btn']//span[contains(text(),'Pending Reports')]");

        //---->> Getting text for matching elements from the list with pending report details page
        public static By SubmitterNameFromList = By.xpath("(//span[@class='ant-typography ReportsTable_dataCell_150__AMKGR ReportsTable_dataCell_ellipsis__sleh4'])[1]");
        public static By ReportNoList = By.xpath("(//span[@class='ant-typography'])[2]");
        public static By ReportNameList = By.xpath("(//a[@class='ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4'])[1]");
        public static By CurrentApproverNameList = By.xpath("(//span[@class='ant-typography ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4'])[1]");

        public static By StatusOnList = By.xpath("(//span[@class='ant-tag ant-tag-orange ReportsTable_statusTag__2hska'])[1]");
        public static By TotalOnList = By.xpath("(//span[@class='ant-typography'])[4]");
        public static By ToBeReimbursedList = By.xpath("(//span[@class='ant-typography'])[5]");


        // --------------> Pending Report Detail page
        public static By VfyPendingApprovalbadge = By.xpath("//span[@class='ant-tag ant-tag-orange']");
        public static By Submittername = By.xpath("//span[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line ReportDetailsScreen_NameText__12IVC']");
        public static By ReportNo = By.xpath("//span[@class='ant-typography ReportDetailsScreen_dataCell_ellipsis__sH4iQ ReportDetailsScreen_reportId__f4RfA']");
        public static By ReportName = By.xpath("//div[@class='ant-descriptions-title']");
        public static By CurrentApproverNameD = By.xpath("(//span[@class='ant-typography'])[4]");
        public static By DurationLabelD = By.xpath("//label[@title='Duration']");
        public static By DurationDate = By.xpath("(//div[@class='ant-form-item-control-input-content'])[1]");
        public static By Total = By.xpath("(//div[@class='ant-form-item-control-input'])[5]");
        public static By ToBeReimbursed = By.xpath("(//div[@class='ant-form-item-control-input'])[6]");
        public static By ApproveBtn = By.xpath("//button[@class='ant-btn ant-btn-primary ReportDetailsScreen_mobileHidden__12xMY']");
        public static By CancelBtn = By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-sm']");
        public static By ApproveBtnPopUp = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']");
        public static By SuccessfullyApprovedMsg = By.xpath("//span[contains(text(),'Report approved successfully')]");


        //------>> All Reports Page
        public static By ClickReportName = By.xpath("(//a[@class='ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4'])[1]");

        // ------>> OR of Filter Options

        public static By ClickAllReport = By.xpath("//span[@title='All Reports']");
        public static By ClickApproved = By.xpath("//span[@title='Approved']");
        public static By ClickReject = By.xpath("//div[@title='Rejected']");
        public static By ClickReimbursed = By.xpath("//span[@title='Reimbursed']");
        public static By CLickAllReportOption = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'All Reports')]");
        public static By ClickApprovedOptionFilter = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Approved')]");
        public static By ClickReimbursedFilter = By.xpath("//div[@title='Reimbursed']");
        public static By ClickFilterReject = By.xpath("//span[@title='Rejected']");


        // ------>> Verifying Filter option Text
        public static By RejectedOptionText = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Rejected')]");
        public static By ReimbursedOptionText = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Reimbursed')]");
        public static By AllReportList=By.xpath("//div[@class='ant-tabs-tab-btn']//span[contains(text(),'All Reports')]");

        // -------->> Verifying Table Headers, submitter and Current Approver Text
        public static By SubmitterColumn=By.xpath("(//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Submitter')])[2]");
        public static By ReportColumn=By.xpath("(//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Report#')])[2]");
        public static By ReportNameColumn=By.xpath("(//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Report Name')])[2]");
        public static By StatusColumn=By.xpath("(//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Status')])[2]");
        public static By CurrentApproverColumn=By.xpath("(//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Current Approver')])[2]");
        public static By TotalColum=By.xpath("(//span[contains(text(),'Total')])[2]");
        public static By ToBeReimburesed=By.xpath("(//span[contains(text(),'To be Reimbursed')])[2]");
        public static By currentApproversName=By.xpath("(//tbody/tr[2]/td[5]/span[1])[2]");

        public static By lastNameXpath2 = By.xpath("(//span[@class='ant-typography ReportsTable_dataCell_150__AMKGR ReportsTable_dataCell_ellipsis__sleh4'])[6]");
        public static By Status=By.xpath("(//td[@class='ant-table-cell']/span[@class='ant-tag ant-tag-success ReportsTable_statusTag__2hska'])[2]");
        public static By StatusRejectedPage = By.xpath("(//span[@class='ant-tag ant-tag-error ReportsTable_statusTag__2hska'])[11]");
        public static By StatusReimbursedPage = By.xpath("(//td/span[@class='ant-tag ant-tag-has-color ReportsTable_statusTag__2hska'])[8]");
        public static By StatusApproved=By.xpath("(//span[@class='ant-tag ant-tag-success ReportsTable_statusTag__2hska'][contains(text(),'APPROVED')])[11]");

        // ------->> OR of Pagination Tests
        public static By tableXpath=By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']");
        public static By PaginationLeft=By.xpath("(//button[@class='ant-pagination-item-link'])[7]");
        public static By PaginationLeft15 = By.xpath("(//button[@class='ant-pagination-item-link'])[7]");
        public static By PaginationLeft10=By.xpath("(//button[@class='ant-pagination-item-link'])[7]");
        public static By PaginationRightInActive=By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/button[1]");
        public static By PageSizeArrow=By.xpath("(//span[@class='ant-select-selection-item'])[6]");
        public static By PageSizeArrowApproved = By.xpath("(//div[@class='ant-select TableView_pagesSelect__1znXS ant-select-single ant-select-show-arrow'])[2]");
        public static By PageSize10=By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'10')]");
        public static By PageSize15=By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'15')]");
        public static By PageSize25=By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'25')]");
        public static By sizeOptionpanel=By.xpath("//div[@class='rc-virtual-list-holder']");
        public static By secondPage=By.xpath("(//li[@title='2'][@class='ant-pagination-item ant-pagination-item-2']//div[@title='2'])[2]");

        public static By PaginationRightActive=By.xpath("(//button[@class='ant-pagination-item-link'])[8]");
        public static By PaginationRightActive15 = By.xpath("(//button[@class='ant-pagination-item-link'])[8]");
        public static By PaginationRightInActive15 = By.xpath("(//button[@class='ant-pagination-item-link'])[8]");
        public static By PaginationRightActive10 = By.xpath("(//button[@class='ant-pagination-item-link'])[8]");
        public static By PaginationRightInActive10 = By.xpath("(//button[@class='ant-pagination-item-link'])[8]");
    }

    public static class UIElementConstant{
        public static String AllReportsText="All Reports";
        public static String ApproveText = "Approved";
        public static String RejectedOptionText = "Rejected";
        public static String ReimburseOptionText = "Reimbursed";
        public static String SubmitterColumnText="Submitter";
        public static String ReportColumnText="Report#";
        public static String ReportNameColumnText="Report Name";
        public static String StatusColumnText="Status";
        public static String CurrentApproverColumnText="Current Approver";
        public static String PageSize10Text="10 / page";
        public static String PageSize15Text="15 / page";
        public static String PageSize25Text="25 / page";
        public static String StatusText="REJECTED";
        public static String StatusTextOfApproved="APPROVED";
        public static String ApproverUserName = "Approver role 2";
        public static String TotalColumnText="Total";
        public static String ReimbursedText="To be Reimbursed";
        public static String CurrentApprover2 = "Approver role 2";
        public static String StatusafterApproving = "AWAITING APPROVAL";


    }
}

