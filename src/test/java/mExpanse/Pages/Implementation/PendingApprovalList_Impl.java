package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.ObjectRepository.NewExpanseOR;
import mExpanse.Pages.ObjectRepository.NewReportOR;
import mExpanse.Pages.ObjectRepository.PendingApprovalListOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PendingApprovalList_Impl {
    NewExpanse_Impl newExpanse = new NewExpanse_Impl();
    NewReport_Impl newReport=new NewReport_Impl();
    SubmitReport_Impl submitReport = new SubmitReport_Impl();

    public void navigateToApprovals(WebDriver driver) throws InterruptedException {
        Operations.click(NewExpanseOR.locator.myView,driver);
        Operations.click(PendingApprovalListOR.Locator.Approvals,driver);
        Operations.click(PendingApprovalListOR.Locator.pendingApprovalList,driver);
    }

    public void guiVerification(WebDriver driver){
        Operations.matchText(PendingApprovalListOR.Locator.Approvals,PendingApprovalListOR.UIElementConstant.ApprovalsText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.pendingApprovalList,PendingApprovalListOR.UIElementConstant.PendingApprovalText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.SubmitterColumn,PendingApprovalListOR.UIElementConstant.SubmitterColumnText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.ReportColumn,PendingApprovalListOR.UIElementConstant.ReportColumnText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.ReportNameColumn,PendingApprovalListOR.UIElementConstant.ReportNameColumnText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.StatusColumn,PendingApprovalListOR.UIElementConstant.StatusColumnText,driver);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.ToBeReimburesed,driver);
        Operations.matchText(PendingApprovalListOR.Locator.TotalColum,PendingApprovalListOR.UIElementConstant.TotalColumnText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.ToBeReimburesed,PendingApprovalListOR.UIElementConstant.ReimbursedText,driver);
        Operations.matchText(PendingApprovalListOR.Locator.Status,PendingApprovalListOR.UIElementConstant.StatusText,driver);
        String userName=Operations.findElement(PendingApprovalListOR.Locator.userName,driver).getText();
        Operations.matchText(PendingApprovalListOR.Locator.currentApproverName,userName,driver);
        Operations.matchText(PendingApprovalListOR.Locator.CurrentApproverColumn,PendingApprovalListOR.UIElementConstant.CurrentApproverColumnText,driver);
        Operations.click(PendingApprovalListOR.Locator.PageSizeArrow,driver);
        Operations.waitUntilElementIsVisible(PendingApprovalListOR.Locator.PageSize10,driver);
        Operations.matchText(PendingApprovalListOR.Locator.PageSize10,PendingApprovalListOR.UIElementConstant.PageSize10Text,driver);
        Operations.matchText(PendingApprovalListOR.Locator.PageSize15,PendingApprovalListOR.UIElementConstant.PageSize15Text,driver);
        Operations.matchText(PendingApprovalListOR.Locator.PageSize25,PendingApprovalListOR.UIElementConstant.PageSize25Text,driver);

    }

    public void paginationVerification(WebDriver driver) throws InterruptedException {
        //Operations.waitUntilElementIsVisible(PendingApprovalListOR.Locator.PageSizeArrow,driver);
        //Operations.click(PendingApprovalListOR.Locator.PageSizeArrow,driver);
        //Operations.waitUntilElementIsClickable(PendingApprovalListOR.Locator.PageSize25,driver);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.sizeOptionpanel,driver);
        Operations.click(PendingApprovalListOR.Locator.PageSize25,driver);
        //Operations.waitUntilElementIsVisible(PendingApprovalListOR.Locator.tableXpath,driver);
        Operations.sleep(20000);
        int size=Operations.tableSize(PendingApprovalListOR.Locator.tableXpath,driver);
        if(size<=25){
            System.out.println(size);
        }
        else{
            System.out.println("page size is not working");
        }

        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
            Operations.sleep(4000);
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationLeft, driver);
            }
        }
        else {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightInActive, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }

            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationLeft, driver);
            }
        }

        Operations.click(PendingApprovalListOR.Locator.PageSizeArrow,driver);
        //Operations.waitUntilElementIsClickable(PendingApprovalListOR.Locator.PageSize15,driver);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.sizeOptionpanel,driver);
        Operations.click(PendingApprovalListOR.Locator.PageSize15,driver);
        Operations.sleep(20000);
        int size2=Operations.tableSize(PendingApprovalListOR.Locator.tableXpath,driver);

        if(size2<=15){
            System.out.println(size2);
        }
        else{
            System.out.println("page size is not working");
        }


      if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
          while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
              Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
          }
          Operations.sleep(4000);
          while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft, driver) == true) {
              Operations.click(PendingApprovalListOR.Locator.PaginationLeft, driver);
          }
      }
      else {
          while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightInActive, driver) == true) {
              Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
          }
          while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft, driver) == true) {
              Operations.click(PendingApprovalListOR.Locator.PaginationLeft, driver);
          }

      }
          Operations.click(PendingApprovalListOR.Locator.PageSizeArrow,driver);
        //Operations.waitUntilElementIsClickable(PendingApprovalListOR.Locator.PageSize10,driver);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.sizeOptionpanel,driver);
        Operations.click(PendingApprovalListOR.Locator.PageSize10,driver);
        Operations.sleep(20000);
        int size3=Operations.tableSize(PendingApprovalListOR.Locator.tableXpath,driver);
        if(size3<=10){
            System.out.println(size3);
        }
        else{
            System.out.println("page size is not working");
        }

        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
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

    public void sortingVerification(WebDriver driver)throws InterruptedException{

        Operations.sleep(20000);
        String firstName=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterName,driver).getText();
        System.out.println(firstName);
        Operations.click(PendingApprovalListOR.Locator.PageSizeArrow,driver);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.sizeOptionpanel,driver);
        Operations.click(PendingApprovalListOR.Locator.PageSize10,driver);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        By lastNameXpath=Operations.modifiedTableXpath(PendingApprovalListOR.Locator.tableXpath,driver,1);
        String lastName=Operations.findElement(lastNameXpath,driver).getText();
        System.out.println(lastName);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(20000);
        Operations.click(PendingApprovalListOR.Locator.SubmitterColumn,driver);
        Operations.sleep(10000);
        String firstName2=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterName,driver).getText();
        System.out.println(firstName2);
        Assert.assertEquals(firstName2,lastName);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {

                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);

            }
        }
        Operations.sleep(6000);
        Operations.scrollBarDown(driver);

        String lastName2=Operations.findElement(lastNameXpath,driver).getText();
        System.out.println(lastName2);
        Assert.assertEquals(lastName2, firstName);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.SubmitterColumn,driver);
        Operations.sleep(6000);
        Operations.click(PendingApprovalListOR.Locator.SubmitterColumn,driver);
        Operations.sleep(10000);
        String fistName3=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterName,driver).getText();
        System.out.println(fistName3);
        Assert.assertEquals(fistName3, firstName);

        //reportNo
        String FirstReportNo1=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterReportNo,driver).getText();
        System.out.println(FirstReportNo1);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        By lastReportXpath=Operations.modifiedTableXpath(PendingApprovalListOR.Locator.tableXpath,driver,2);
        String lastReportNo1=Operations.findElement(lastReportXpath,driver).getText();
        System.out.println(lastReportNo1);

        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.ReportColumn,driver);
        Operations.sleep(10000);
        String FirstReportNo2=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterReportNo,driver).getText();
        System.out.println(FirstReportNo2);
        Assert.assertEquals(lastReportNo1, FirstReportNo2);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        String lastReportNo2=Operations.findElement(lastReportXpath,driver).getText();
        System.out.println(lastReportNo2);
        Assert.assertEquals(FirstReportNo1, lastReportNo2);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.ReportColumn,driver);
        Operations.sleep(10000);
        String fistReportNo3=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterReportNo,driver).getText();
        System.out.println(fistReportNo3);
        Assert.assertEquals(FirstReportNo1, fistReportNo3);

        //reportName
        String FirstReportName1=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterReportName,driver).getText();
        System.out.println(FirstReportName1);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        By lastReportNameXpath=Operations.modifiedTableXpath(PendingApprovalListOR.Locator.tableXpath,driver,3);
        String lastReportName1=Operations.findElement(lastReportNameXpath,driver).getText();
        System.out.println(lastReportName1);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.ReportNameColumn,driver);
        Operations.sleep(10000);
        String FirstReportName2=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterReportName,driver).getText();
        System.out.println(FirstReportName2);
        Assert.assertEquals(lastReportName1, FirstReportName2);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        String lastReportName2=Operations.findElement(lastReportNameXpath,driver).getText();
        System.out.println(lastReportName2);
        Assert.assertEquals(FirstReportName1, lastReportName2);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.ReportNameColumn,driver);
        Operations.sleep(10000);
        String fistReportName3=Operations.findElement(PendingApprovalListOR.Locator.firstSubmitterReportName,driver).getText();
        System.out.println(fistReportName3);
        Assert.assertEquals(FirstReportName1, fistReportName3);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.ToBeReimburesed,driver);

        //TotalSorting
        Operations.click(PendingApprovalListOR.Locator.TotalColum,driver);
        Operations.sleep(10000);
        String FirstTotal1=Operations.findElement(PendingApprovalListOR.Locator.firstTotal,driver).getText();
        System.out.println(FirstTotal1);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.sleep(4000);
        Operations.scrollIntoElement(PendingApprovalListOR.Locator.ToBeReimburesed,driver);
        Operations.scrollBarDown(driver);
        By lastTotalXpath=Operations.modifiedTableXpath(PendingApprovalListOR.Locator.tableXpath,driver,6);

        String lastTotal1=Operations.findElement(lastTotalXpath,driver).getText();
        System.out.println(lastTotal1);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.TotalColum,driver);
        Operations.sleep(10000);
        String FirstTotal2=Operations.findElement(PendingApprovalListOR.Locator.firstTotal,driver).getText();
        System.out.println(FirstTotal2);
        Assert.assertEquals(lastTotal1, FirstTotal2);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        String lastTotal2=Operations.findElement(lastTotalXpath,driver).getText();
        System.out.println(lastTotal2);
        Assert.assertEquals(lastTotal2,FirstTotal1 );
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.TotalColum,driver);
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.TotalColum,driver);//extra command for total sorting issue
        Operations.sleep(10000);
        String fistTotal3=Operations.findElement(PendingApprovalListOR.Locator.firstTotal,driver).getText();
        System.out.println(fistTotal3);
        Assert.assertEquals(FirstTotal1, fistTotal3);

        //ToBe Reimbursed
        Operations.click(PendingApprovalListOR.Locator.TotalColum,driver);
        Operations.sleep(10000);
        String FirstReimbursed1=Operations.findElement(PendingApprovalListOR.Locator.firstToBeReimursed,driver).getText();
        System.out.println(FirstReimbursed1);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        By lastReimbursedXpath=Operations.modifiedTableXpath(PendingApprovalListOR.Locator.tableXpath,driver,7);
        String lastTReimbursed1=Operations.findElement(lastReimbursedXpath,driver).getText();
        System.out.println(lastTReimbursed1);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.ToBeReimburesed,driver);
        Operations.sleep(10000);
        String FirstReimbursed2=Operations.findElement(PendingApprovalListOR.Locator.firstToBeReimursed,driver).getText();
        System.out.println(FirstReimbursed2);
        Assert.assertEquals(lastTReimbursed1, FirstReimbursed2);
        if(Operations.verifyElementIsPresent(PendingApprovalListOR.Locator.secondPage,driver)==true) {
            while (Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationRightActive, driver) == true) {
                Operations.sleep(3000);
                Operations.click(PendingApprovalListOR.Locator.PaginationRightActive, driver);
            }
        }
        Operations.scrollBarDown(driver);
        String lastReimbursed2=Operations.findElement(lastReimbursedXpath,driver).getText();
        System.out.println(lastReimbursed2);
        Assert.assertEquals(FirstReimbursed1, lastReimbursed2);
        while( Operations.checkElementIsClickable(PendingApprovalListOR.Locator.PaginationLeft,driver)==true){
            Operations.click(PendingApprovalListOR.Locator.PaginationLeft,driver);
        }
        Operations.sleep(10000);
        Operations.click(PendingApprovalListOR.Locator.ToBeReimburesed,driver);
        Operations.sleep(10000);
        String fistReimbursed3=Operations.findElement(PendingApprovalListOR.Locator.firstToBeReimursed,driver).getText();
        System.out.println(fistReimbursed3);
        Assert.assertEquals(FirstReimbursed1, fistReimbursed3);




    }
    public void SubmittedReportVerification(WebDriver driver)throws InterruptedException{
        Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
        newReport.navigateToNewReport(driver);
        String reportName=newReport.createValidNewReport(driver);
        Operations.sleep(5000);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        String reportNumber=Operations.getText(NewReportOR.Locator.reportNo,driver);
        Operations.click(NewExpanseOR.locator.expanse,driver);
        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        newExpanse.createNewExpanseWithReimbursement(driver,reportNumber);
         Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
         Operations.sleep(5000);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        submitReport.submitValidReport(driver);
        Operations.click(PendingApprovalListOR.Locator.Approvals,driver);
        Operations.click(PendingApprovalListOR.Locator.pendingApprovalList,driver);
        Operations.waitUntilElementIsVisible(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName),driver);
        Operations.matchText(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName),reportName,driver);




    }

}
