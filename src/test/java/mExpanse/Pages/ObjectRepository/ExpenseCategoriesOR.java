package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class ExpenseCategoriesOR {

    public static class Locator {
        public static By SidebarItemAdminView = By.xpath("//body/div[@id='root']/section[1]/aside[1]/div[1]/div[2]/div[2]/div[1]/div[2]");
        public static By SidebarItemExpenseCategories = By.xpath("//a[contains(text(),'Expense Categories')]");
        public static By NewCategoryButton = By.xpath("//span[contains(text(),'New Category')]");
        public static By DrawerNewCategoryTitle = By.xpath("//div[contains(text(),'New Category')]");
        public static By DrawerCloserButton = By.cssSelector("button.ant-drawer-close");
        public static By CategoryNameFieldTitle = By.xpath("//label[contains(text(),'Category Name')]");
        public static By CategoryNameField = By.xpath("(//input[@id='name'])[1]");
        public static By CategoryNameField2 = By.xpath("(//input[@id='name'])[2]");
        public static By SubCategoryCheckbox = By.xpath("(//input[@id='isSubCategory'])[1]");
        public static By SubCategoryCheckbox2 = By.xpath("(//input[@id='isSubCategory'])[2]");
        public static By SubCategoryCheckboxLabel = By.xpath("//span[contains(text(),'Make this a sub-category')]");
        public static By CategoryNameErrorMessage = By.xpath("//div[contains(text(),'Please enter the category name')]");
        public static By ParentCategoryErrorMessage = By.xpath("//div[contains(text(),'Please select the parent category')]");
        public static By AccountCodeErrorMessage = By.xpath("//div[contains(text(),'Please provide account code')]");
        public static By ParentCategoryDropDownTitle = By.xpath("//label[contains(text(),'Parent Category')]");
        public static By ParentCategoryDropDown = By.xpath("//input[@id='parentExpenseCategoryId']");
        public static By ParentCategoryDropDown2 = By.cssSelector(".ant-select-item-option-content");
        public static By AccountCodeField = By.xpath("(//input[@id='accountCode'])[1]");
        public static By AccountCodeField2 = By.xpath("(//input[@id='accountCode'])[2]");
        public static By DescriptionFieldTitle = By.xpath("//label[contains(text(),'Description')]");
        public static By DescriptionField = By.xpath("(//textarea[@id='description'])[1]");
        public static By DescriptionField2 = By.xpath("(//textarea[@id='description'])[2]");
        public static By SaveButton = By.xpath("(//span[contains(text(),'Save')])[1]");
        public static By SaveButton2 = By.xpath("(//span[contains(text(),'Save')])[2]");
        public static By CancelButton = By.xpath("//span[contains(text(),'Cancel')]");
        public static By EllipsisButton = By.cssSelector(".ant-table-row-level-0 .ant-btn.ant-btn-ghost.ant-btn-icon-only");

        public static By ExpenseCreatedSuccessfulMessage = By.xpath("//span[contains(text(), 'New expense category added successfully')]");
        public static By ExpenseEditedSuccessfulMessage = By.xpath("//span[contains(text(), 'Expense category edited successfully')]");
        public static By ExpenseDuplicateCategoryErrorMessage = By.xpath("//span[contains(text(), 'Duplicate Category Name')]");
        public static By EditButton = By.xpath("//span[contains(text(),'Edit')]");

        public static By DisableButton = By.xpath("//span[contains(text(),'Disable')]");
        public static By EnableButton = By.xpath("//span[contains(text(),'Enable')]");
        public static By DeleteButton = By.xpath("(//span[contains(text(),'Delete')])[1]");
        public static By DeleteButton2 = By.xpath("(//span[contains(text(),'Delete')])[2]");

    }

    public static class UIElementConstant {
        public static String drawerNewCategoryTitle = "New Category";
        public static String categoryNameFieldTitle = "CATEGORY NAME";
        public static String subCategoryCheckboxLabel = "Make this a sub-category";
        public static String saveButtonText = "Save";
        public static String cancelButton = "Cancel";
        public static String categoryNameFieldPlaceholder = "Enter the category name";
        public static String descriptionPlaceholderText = "Enter Description";
        public static String descriptionFieldTitle = "DESCRIPTION";
        public static String expenseCreatedSuccessfulMessage = "New expense category added successfully";

        public static String expenseDuplicateCategoryNameError = "Duplicate Category Name";

        public static String expnseCategoryEditSuccessMessage = "Expense category edited successfully";
        public static String categoryNameErrorMessage = "Please enter the category name";
        public static String parentCategoryErrorMessage = "Please select the parent category";
        public static String accountCodeErrorMessage = "Please provide account code";
    }
}

