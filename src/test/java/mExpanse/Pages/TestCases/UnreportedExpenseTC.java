
package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.NewExpanse_Impl;
import mExpanse.Pages.Implementation.UnreportedExpense_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)

public class UnreportedExpenseTC extends BaseClass {

    LogIn_Impl login = new LogIn_Impl();
    NewExpanse_Impl newExpanse = new NewExpanse_Impl();
    UnreportedExpense_Impl unreportedExpense = new UnreportedExpense_Impl();


    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test(priority = 1)
    public void verifyNavigatesUnreportedExpense() {
        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPass1"),"Admin");
        unreportedExpense.navigateToUnreportedExpense(driver);
        //Operations.takeSnapShot(driver, "/Users/eftiarbd/Downloads/mexpense/mexpanse/build/Snapshots/test.png");

    }

    @Test(priority = 2)
    public void verifyGuiElements() {
        unreportedExpense.guiVerification(driver);

    }

    @Test(priority = 3)
    public void dataValidationUnreportedExpenses() throws InterruptedException {
        newExpanse.navigateToNewExpanse(driver);
        String categoryName = newExpanse.createNewExpanseWithoutReport(driver);
        Thread.sleep(3000);
        unreportedExpense.navigateToUnreportedExpense(driver);
        unreportedExpense.verifyCreatedUnreportedExpenseShownInTable(categoryName, driver);
    }

    @Test(priority = 4)
    public void verifyTableDataSorting() throws InterruptedException {
        unreportedExpense.tableSortingAndPagination(driver);
    }


    @AfterTest
    public void  testCaseTearDown() {
        tearDown();

    }
}

