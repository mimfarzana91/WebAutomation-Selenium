package mExpanse.Pages.Interface;
import org.openqa.selenium.WebDriver;

public interface ExpenseCategories_Interface {
        public void navigateToAdminViewExpenseCategory(WebDriver driver);
        public void navigateToNewCategory(WebDriver driver) throws InterruptedException;
        public void guiVerification(WebDriver driver) throws InterruptedException;
        public void verifyDrawerCloserButtonCategory(WebDriver driver);
        public void createValidNewCategory(WebDriver driver, boolean ignoreDescription) throws InterruptedException;
        public void createValidNewSubCategory(WebDriver driver) throws InterruptedException;
        public void verifyMandatoryFieldAlert(WebDriver driver) throws InterruptedException;
        public void verifyAlertMessageAfterAddingCategory(WebDriver driver) throws InterruptedException;
        public void verifySuccessfulAlertMessageAfterEditingCategory(WebDriver driver) throws InterruptedException;
        public void verifyAlertMessageColor(WebDriver driver) throws InterruptedException;
        public void verifyEditParentCategory(WebDriver driver) throws InterruptedException;
        public void verifyEditSubCategory(WebDriver driver) throws InterruptedException;
        public void verifyDisableParentCategory(WebDriver driver) throws InterruptedException;
        public void verifyEnableParentCategory(WebDriver driver) throws InterruptedException;
        public void verifyDeleteParentCategory (WebDriver driver) throws InterruptedException;








}
