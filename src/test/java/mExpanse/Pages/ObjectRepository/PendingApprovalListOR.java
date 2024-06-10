package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class PendingApprovalListOR {

    public static class Locator{

        //public static By MyView =By.xpath("//span[contains(text(),'My View')]");
        public static By MyView =By.xpath("/html/body/div[1]/section/aside/div/div[2]/div/div[1]/div[2]");
        public static By Approvals=By.xpath("//span[@class='ant-menu-title-content']//a[contains(text(),'Approvals')]");
        public static By pendingApprovalList=By.xpath("//div[@class='ant-tabs-tab-btn']//span[contains(text(),'Pending Reports')]");
        public static By SubmitterColumn=By.xpath("//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Submitter')]");
        public static By ReportColumn=By.xpath("//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Report#')]");
        public static By ReportNameColumn=By.xpath("//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Report Name')]");
        public static By StatusColumn=By.xpath("//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Status')]");
        public static By CurrentApproverColumn=By.xpath("//div[@class='ant-table-column-sorters']//span[@class='ant-table-column-title'][contains(text(),'Current Approver')]");
        public static By TotalColum=By.xpath("//span[contains(text(),'Total')]");
        public static By ToBeReimburesed=By.xpath("//span[contains(text(),'To be Reimbursed')]");
        public static By currentApproverName=By.xpath("//tbody/tr[2]/td[5]/span[1]");
        public static By firstSubmitterName=By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/h4[1]/span[1]");
        public static By firstSubmitterDate=By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[1]/span[1]]");
        //public static By lastSubmitterDate=By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[13]/td[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
        public static By  firstSubmitterReportNo=By.xpath("//tbody/tr[2]/td[2]/span");
        //public static By lastReportNo=By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/span[1]");
        public static By firstSubmitterReportName=By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/h4[1]/div[1]");
       // public static By lastReportName=By.cssSelector("section.ant-layout.ant-layout-has-sider section.ant-layout main.ant-layout-content section.ant-layout.ContentLayout_container__gM2EI main.ant-layout-content.ContentLayout_content__29Vo3 div.ant-tabs.ant-tabs-top div.ant-tabs-content-holder div.ant-tabs-content.ant-tabs-content-top div.ant-tabs-tabpane.ant-tabs-tabpane-active:nth-child(1) div.ant-table-wrapper div.ant-spin-nested-loading div.ant-spin-container div.ant-table.ant-table-ping-right.ant-table-fixed-header.ant-table-scroll-horizontal div.ant-table-container div.ant-table-body tbody.ant-table-tbody:nth-child(2) tr.ant-table-row.ant-table-row-level-0:nth-child(3) td.ant-table-cell.ant-table-column-sort.ant-table-cell-ellipsis:nth-child(3) div.ant-list-item-meta.ReportsTable_dataCell_200__ZJ6ze div.ant-list-item-meta-content h4.ant-list-item-meta-title div.ant-space.ant-space-horizontal.ant-space-align-center div.ant-space-item > a.ReportsTable_dataCell_200__ZJ6ze.ReportsTable_dataCell_ellipsis__sleh4");
        public static By Status=By.xpath("//span[@class='ant-tag ant-tag-orange ReportsTable_statusTag__2hska'][contains(text(),'PENDING APPROVAL')]");
        public static By CurrentApproverName=By.xpath("//tbody/tr[2]/td[5]/span[1]");
        public static By SortArrowIcon=By.xpath("//thead/tr[1]/th[1]/div[1]/span[2]");
        public static By reportNoSortArrow=By.xpath("//thead/tr[1]/th[2]/div[1]/span[2]/span[1]");
        public static By reportNameSortArrow=By.xpath("//thead/tr[1]/th[3]/div[1]/span[2]/span[1]");
        public static By TotalSortArrow=By.xpath("//thead/tr[1]/th[6]/div[1]/span[2]/span[1]");
        public static By ToBeReimursedSort=By.xpath("//thead/tr[1]/th[7]/div[1]/span[2]/span[1]");
        public static By firstTotal=By.xpath("//tbody/tr[2]/td[6]/span[1]");
        public static By firstToBeReimursed=By.xpath("//tbody/tr[2]/td[7]/span[1]");
        public static By tableXpath=By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']");
        public static By PaginationLeft=By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]");
        public static By PaginationRightInActive=By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/button[1]");
        public static By PageSizeArrow=By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]");
        public static By PageSize10=By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'10')]");
        public static By PageSize15=By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'15')]");
        public static By PageSize25=By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'25')]");
        public static By sizeOptionpanel=By.xpath("//div[@class='rc-virtual-list-holder']");
        public static By userName=By.xpath("//a[@class='SidebarLayoutHeader_name__O4bEY']");
        public static By secondPage=By.xpath("//li[@title='2'][@class='ant-pagination-item ant-pagination-item-2']//div[@title='2']");

        public static By PaginationRightActive=By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/button[1]");
    }

    public static class UIElementConstant{
        public static String ApprovalsText="Approvals";
        public static String PendingApprovalText="Pending Reports";
        public static String SubmitterColumnText="Submitter";
        public static String ReportColumnText="Report#";
        public static String ReportNameColumnText="Report Name";
        public static String StatusColumnText="Status";
        public static String CurrentApproverColumnText="Current Approver";
        public static String PageSize10Text="10 / page";
        public static String PageSize15Text="15 / page";
        public static String PageSize25Text="25 / page";
        public static String StatusText="PENDING APPROVAL";
        public static String TotalColumnText="Total";
        public static String ReimbursedText="To be Reimbursed";

    }


}
