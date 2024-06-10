package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface UnreportedExpense_Interface {

    void navigateToUnreportedExpense(WebDriver driver)throws InterruptedException;

    void guiVerification(WebDriver driver)throws InterruptedException;

    void verifyCreatedUnreportedExpenseShownInTable(String categoryName, WebDriver driver)throws InterruptedException;

    void tableSortingAndPagination(WebDriver driver) throws InterruptedException;

}