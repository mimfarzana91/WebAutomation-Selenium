package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.ExpenseCategories_Interface;
import mExpanse.Pages.ObjectRepository.ExpenseCategoriesOR;
import org.openqa.selenium.WebDriver;


public class ExpenseCategories_Impl implements ExpenseCategories_Interface {

    public void navigateToAdminViewExpenseCategory(WebDriver driver) {
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.SidebarItemAdminView, driver);
        Operations.click(ExpenseCategoriesOR.Locator.SidebarItemAdminView, driver);
        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.SidebarItemExpenseCategories, driver);
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.SidebarItemExpenseCategories, driver);
        Operations.click(ExpenseCategoriesOR.Locator.SidebarItemExpenseCategories, driver);
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.NewCategoryButton, driver);
    }

    public void navigateToNewCategory(WebDriver driver) throws InterruptedException {
        Operations.sleep(3000);
        Operations.click(ExpenseCategoriesOR.Locator.NewCategoryButton, driver);
        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.DrawerNewCategoryTitle, driver);
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.DrawerNewCategoryTitle, driver);
    }

    public void guiVerification(WebDriver driver) throws InterruptedException {
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.DrawerNewCategoryTitle, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.DrawerNewCategoryTitle, ExpenseCategoriesOR.UIElementConstant.drawerNewCategoryTitle, driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.DrawerCloserButton, driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.CategoryNameFieldTitle, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.CategoryNameFieldTitle, ExpenseCategoriesOR.UIElementConstant.categoryNameFieldTitle, driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.CategoryNameField, driver);
        Operations.matchAttribute(ExpenseCategoriesOR.Locator.CategoryNameField, ExpenseCategoriesOR.UIElementConstant.categoryNameFieldPlaceholder, "placeholder", driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.SubCategoryCheckbox, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.SubCategoryCheckboxLabel, ExpenseCategoriesOR.UIElementConstant.subCategoryCheckboxLabel, driver);

        Operations.click(ExpenseCategoriesOR.Locator.SubCategoryCheckbox, driver);
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.ParentCategoryDropDownTitle, driver);
        Operations.sleep(1000);
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.ParentCategoryDropDown, driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.DescriptionFieldTitle, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.DescriptionFieldTitle, ExpenseCategoriesOR.UIElementConstant.descriptionFieldTitle, driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.DescriptionField, driver);
        Operations.matchAttribute(ExpenseCategoriesOR.Locator.DescriptionField, ExpenseCategoriesOR.UIElementConstant.descriptionPlaceholderText, "placeholder", driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.SaveButton, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.SaveButton, ExpenseCategoriesOR.UIElementConstant.saveButtonText, driver);

        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.CancelButton, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.CancelButton, ExpenseCategoriesOR.UIElementConstant.cancelButton, driver);
    }

    public void verifyDrawerCloserButtonCategory(WebDriver driver) {
        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.DrawerCloserButton, driver);
        Operations.verifyElementIsDisplayed(ExpenseCategoriesOR.Locator.DrawerCloserButton, driver);
        Operations.click(ExpenseCategoriesOR.Locator.DrawerCloserButton, driver);
    }

    private void categoryDrawerFields(String categoryName, String accountCode, String description, WebDriver driver) throws InterruptedException {
        Operations.sendText(ExpenseCategoriesOR.Locator.CategoryNameField, categoryName, driver);
        Operations.sendText(ExpenseCategoriesOR.Locator.AccountCodeField, accountCode, driver);
        Operations.sendText(ExpenseCategoriesOR.Locator.DescriptionField, description, driver);
        Operations.sleep(3000);
        Operations.click(ExpenseCategoriesOR.Locator.SaveButton, driver);
    }

    public void createValidNewCategory(WebDriver driver, boolean ignoreDescription) throws InterruptedException {
        LoremIpsum ipsum = new LoremIpsum();
        String categoryName = ipsum.getWords(2, 3);
        String accountCode = ipsum.getWords(1, 2);

        // check if description field is ignored.
        if (!ignoreDescription) {
            this.categoryDrawerFields(categoryName, accountCode, ipsum.getWords(2, 3), driver);
        } else {
            this.categoryDrawerFields(categoryName, accountCode, "", driver);
        }
    }

    public void createValidNewSubCategory(WebDriver driver) throws InterruptedException {
        LoremIpsum ipsum = new LoremIpsum();
        String categoryName = ipsum.getWords(4, 3);
        String accountCode = ipsum.getWords(2, 2);
        String description = ipsum.getWords(4, 4);

        Operations.sendText(ExpenseCategoriesOR.Locator.CategoryNameField, categoryName, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.SubCategoryCheckbox, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.ParentCategoryDropDown, driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(ExpenseCategoriesOR.Locator.ParentCategoryDropDown2, driver);
        Operations.sleep(1000);
        Operations.sendText(ExpenseCategoriesOR.Locator.AccountCodeField, accountCode, driver);
        Operations.sleep(1000);
        Operations.sendText(ExpenseCategoriesOR.Locator.DescriptionField, description, driver);
        Operations.sleep(3000);
        Operations.click(ExpenseCategoriesOR.Locator.SaveButton, driver);
    }

    public void verifyMandatoryFieldAlert(WebDriver driver) throws InterruptedException {
        Operations.click(ExpenseCategoriesOR.Locator.SubCategoryCheckbox, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.SaveButton, driver);

        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.CategoryNameErrorMessage, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.CategoryNameErrorMessage, ExpenseCategoriesOR.UIElementConstant.categoryNameErrorMessage, driver);

        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.ParentCategoryErrorMessage, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.ParentCategoryErrorMessage, ExpenseCategoriesOR.UIElementConstant.parentCategoryErrorMessage, driver);

        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.AccountCodeErrorMessage, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.AccountCodeErrorMessage, ExpenseCategoriesOR.UIElementConstant.accountCodeErrorMessage, driver);

        this.verifyDrawerCloserButtonCategory(driver);
    }

    public void verifyAlertMessageAfterAddingCategory(WebDriver driver) throws InterruptedException {
        LoremIpsum ipsum = new LoremIpsum();
        String categoryName = ipsum.getWords(2, 6);
        String accountCode = ipsum.getWords(1, 4);
        String description = ipsum.getWords(3, 6);

        // create new
        this.navigateToNewCategory(driver);
        this.categoryDrawerFields(categoryName, accountCode, description, driver);
        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.ExpenseCreatedSuccessfulMessage, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.ExpenseCreatedSuccessfulMessage, ExpenseCategoriesOR.UIElementConstant.expenseCreatedSuccessfulMessage, driver);

        // create duplicate with same data
        this.navigateToNewCategory(driver);
        this.categoryDrawerFields(categoryName, accountCode, description, driver);
        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.ExpenseDuplicateCategoryErrorMessage, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.ExpenseDuplicateCategoryErrorMessage, ExpenseCategoriesOR.UIElementConstant.expenseDuplicateCategoryNameError, driver);

        this.verifyDrawerCloserButtonCategory(driver);
    }

    public void verifySuccessfulAlertMessageAfterEditingCategory(WebDriver driver) throws InterruptedException {
        this.verifyEditParentCategory(driver);
        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.ExpenseEditedSuccessfulMessage, driver);
        Operations.matchText(ExpenseCategoriesOR.Locator.ExpenseEditedSuccessfulMessage, ExpenseCategoriesOR.UIElementConstant.expnseCategoryEditSuccessMessage, driver);
    }

    public void verifyAlertMessageColor(WebDriver driver) throws InterruptedException {
        this.navigateToNewCategory(driver);
        Operations.click(ExpenseCategoriesOR.Locator.SubCategoryCheckbox, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.SaveButton, driver);

        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.CategoryNameErrorMessage, driver);
        Operations.matchColor(ExpenseCategoriesOR.Locator.CategoryNameErrorMessage, "#ff4d4f", "color", driver);

        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.ParentCategoryErrorMessage, driver);
        Operations.matchColor(ExpenseCategoriesOR.Locator.ParentCategoryErrorMessage, "#ff4d4f", "color", driver);

        Operations.waitUntilElementIsVisible(ExpenseCategoriesOR.Locator.AccountCodeErrorMessage, driver);
        Operations.matchColor(ExpenseCategoriesOR.Locator.AccountCodeErrorMessage, "#ff4d4f", "color", driver);

        this.verifyDrawerCloserButtonCategory(driver);
    }

    public void verifyEditParentCategory(WebDriver driver) throws InterruptedException {
        Operations.click(ExpenseCategoriesOR.Locator.EllipsisButton, driver);
        Operations.click(ExpenseCategoriesOR.Locator.EditButton, driver);

        LoremIpsum ipsum = new LoremIpsum();
        String categoryName = ipsum.getWords(2, 3);
        String accountCode = ipsum.getWords(1, 2);
        String description = ipsum.getWords(3, 4);

        Operations.sleep(1000);
        Operations.sendText(ExpenseCategoriesOR.Locator.CategoryNameField, "Edit Name", driver);
        Operations.sendText(ExpenseCategoriesOR.Locator.AccountCodeField, "Edit Code", driver);
        Operations.sendText(ExpenseCategoriesOR.Locator.DescriptionField, "Edit Description", driver);

        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.SaveButton, driver);
    }

    public void verifyEditSubCategory(WebDriver driver) throws InterruptedException {
        Operations.click(ExpenseCategoriesOR.Locator.EllipsisButton, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.EditButton, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.SubCategoryCheckbox, driver);
        Operations.sleep(2000);
        Operations.click(ExpenseCategoriesOR.Locator.ParentCategoryDropDown, driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(ExpenseCategoriesOR.Locator.ParentCategoryDropDown2, driver);
        Operations.sleep(1000);

        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.SaveButton, driver);
    }

    public void verifyDisableParentCategory(WebDriver driver) throws InterruptedException {
        Operations.sleep(3000);
        Operations.click(ExpenseCategoriesOR.Locator.EllipsisButton, driver);

        Operations.waitUntilElementIsVisible((ExpenseCategoriesOR.Locator.DisableButton), driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.DisableButton, driver);

    }

    public void verifyEnableParentCategory(WebDriver driver) throws InterruptedException {
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.EllipsisButton, driver);

        Operations.waitUntilElementIsVisible((ExpenseCategoriesOR.Locator.EnableButton), driver);
        Operations.click(ExpenseCategoriesOR.Locator.EnableButton, driver);
    }

    public void verifyDeleteParentCategory(WebDriver driver) throws InterruptedException {
        this.verifyDisableParentCategory(driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.EllipsisButton, driver);
        Operations.waitUntilElementIsVisible((ExpenseCategoriesOR.Locator.DeleteButton), driver);

        Operations.click(ExpenseCategoriesOR.Locator.DeleteButton, driver);
        Operations.sleep(1000);
        Operations.click(ExpenseCategoriesOR.Locator.DeleteButton2, driver);
    }
}