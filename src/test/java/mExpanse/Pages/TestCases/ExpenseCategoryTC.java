package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.ExpenseCategories_Impl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExpenseCategoryTC extends BaseClass {
    LogIn_Impl logIn = new LogIn_Impl();
    ExpenseCategories_Impl ExpenseCategories = new ExpenseCategories_Impl();

    @BeforeClass
    public void setupDriver() {
        setUp();
    }

    @Test(priority = 1)
    public void verifyGuiElements() throws InterruptedException {
        logIn.correctMailCorrectPass(driver, getMail("adminEmail"), getPassword("adminPass"), "Admin");
        ExpenseCategories.navigateToAdminViewExpenseCategory(driver);
        ExpenseCategories.navigateToNewCategory(driver);
        ExpenseCategories.guiVerification(driver);
    }

    @Test(priority = 2)
    public void verifyDrawerCloserButtonCategory() {
        ExpenseCategories.verifyDrawerCloserButtonCategory(driver);
    }

    @Test(priority = 3)
    public void createValidCategory() throws InterruptedException {
        ExpenseCategories.navigateToNewCategory(driver);
        ExpenseCategories.createValidNewCategory(driver, false);
    }

    @Test(priority = 4)
    public void createValidSubCategory() throws InterruptedException {
        ExpenseCategories.navigateToNewCategory(driver);
        ExpenseCategories.createValidNewSubCategory(driver);
    }
    @Test(priority = 5)
    public void createExpenseCategoryWithoutInputtingOptionalField() throws InterruptedException {
        ExpenseCategories.navigateToNewCategory(driver);
        ExpenseCategories.createValidNewCategory(driver, true);
    }
    @Test(priority = 6)
    public void checkMandatoryFieldAlertMessages() throws InterruptedException {
        ExpenseCategories.navigateToNewCategory(driver);
        ExpenseCategories.verifyMandatoryFieldAlert(driver);
    }
    @Test(priority = 7)
    public void checkAlertMessageAfterAddingCategory() throws InterruptedException {
        ExpenseCategories.verifyAlertMessageAfterAddingCategory(driver);
    }

    @Test(priority = 8)
    public void verifyAlertMessageColor() throws InterruptedException {
        ExpenseCategories.verifyAlertMessageColor(driver);

    }

    @Test(priority = 9)
    public void checkEditParentCategory() throws InterruptedException {
        ExpenseCategories.verifyEditParentCategory(driver);

    }
    @Test(priority = 10)
    public void checkEditSubCategory() throws InterruptedException {
        ExpenseCategories.verifyEditSubCategory(driver);
    }

    @Test(priority = 11)
    public void checkDisableParentCategory() throws InterruptedException {
        ExpenseCategories.verifyDisableParentCategory(driver);
    }

    @Test(priority = 12)
    public void checkEnableParentCategory() throws InterruptedException {
        ExpenseCategories.verifyEnableParentCategory(driver);
    }

    @Test(priority = 13)
    public void checkDeleteParentCategory() throws InterruptedException {
        ExpenseCategories.verifyDeleteParentCategory(driver);
    }

}
