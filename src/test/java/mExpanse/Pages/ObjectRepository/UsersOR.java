package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class UsersOR {
    public static class Locator{
        public static By AdminView = By.xpath("//span[@class='anticon anticon-unlock']");
        public static By Users = By.xpath("//a[contains(text(),'Users')]");
        public static By AddUserButton = By.xpath("//button[@class='ant-btn ant-btn-primary Button_button__1-zFo'][@type='button']");
        public static By NameLabel = By.xpath("//label[@class='ant-form-item-required'][@title='Name']");
        public static By NameRequireValidationAlert = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter user name')]");
        public static By NameTextBox = By.xpath("//input[@id='name']");
        public static By EmployeeIdLabel = By.xpath("//label[@for='employeeId'][@title='Employee id']");
        public static By EmployeeIDTextBox = By.xpath("//input[@id='employeeId']");
        public static By EmailLabel = By.xpath("//label[@class='ant-form-item-required'][@title='Email']");
        public static By EmailTextBox = By.xpath("//input[@id='email']");
        public static By EmailRequireValidationAlert = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter your email')]");
        public static By InvalidEmailValidationAlert = By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter a valid email address')]");
        public static By RoleLabel = By.xpath("//label[@class='ant-form-item-required'][@title='Role']");
        public static By RoleDropdown = By.xpath("//input[@id='role']");
        public static By RoleSubmitter = By.xpath("//span[@class='ant-select-selection-item'][@title='Submitter']");
        public static By RoleApprover = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Approver')]");
        public static By RoleAdmin = By.xpath("//div[@class='ant-select-item-option-content'][contains(text(),'Admin')]");
        public static By SubmitsToLabel = By.xpath("//label[@title='Submits to']");
        public static By SubmitsToDropdown = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-allow-clear ant-select-show-arrow ant-select-show-search']");
        public static By SubmitsToTextBox = By.xpath("//input[@id='submitsTo']");
        public static By DivDropdownList = By.xpath("//div[contains(@class,'ant-select-item ant-select-item-option')]");
        public static By DivDesignationList = By.xpath("//div[@class='ant-select-dropdown.ant-select-dropdown-placement-topLeft']");
        public static By DateOfJoiningLabel = By.xpath("//label[@title='Date of joining']");
        public static By DateOfJoiningDatePicker = By.xpath("//div[@class='ant-picker']");
        public static By DatePickerBody = By.xpath("//table[@class='ant-picker-content']");
        public static By SelectDate13th = By.xpath("//div[@class='ant-picker-cell-inner'][text()='13']");
        public static By DatePickerMonth = By.xpath("//button[@class='ant-picker-month-btn']");
        public static By DatePickerYear = By.xpath("//button[@class='ant-picker-header-super-next-btn']");
        public static By DesignationLabel = By.xpath("//label[@title='Designation']");
        public static By DesignationTextBox = By.xpath("//input[@id='designation']");
        public static By DesignationDropdownList = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-focused ant-select-single ant-select-show-arrow ant-select-open']");
        public static By AddDesignationTextBox = By.xpath("//input[@placeholder='Please enter item']");
        public static By AddDesignationButton = By.xpath("//button[@class='ant-btn ant-btn-text Button_button__1-zFo']");
        public static By SaveButton = By.xpath("//button[@class='ant-btn ant-btn-primary Button_button__1-zFo'][@type='submit']");
        public static By CancelButton = By.xpath("//button[@class='ant-btn ant-btn-default Button_button__1-zFo']");
        public static By DrawerCloseButton = By.xpath("//button[@class='ant-drawer-close']");
        public static By AddUserLabel = By.xpath("//div[@class='ant-drawer-title']");
        public static By ApprovesAndForwardsToLabel = By.xpath("//label[contains(text(),'Approves And Forwards To')]");
        public static By ApprovesAndForwardsToTextBox = By.xpath("//input[@id='forwardsTo']");
        public static By AdminTestQA = By.xpath("(//div[contains(@title,'Test qa')])[2]");
        public static By UserCreatedSuccessfullyMessage=By.xpath("//span[contains(text(),'User invited successfully')]");
        public static By UsersDrawerBody = By.xpath("//div[@class='ant-drawer-content']");
    }


    public static class UIElementConstant{
        public static  String AdminViewLinkText="Admin View";
        public static  String UsersLinkText="Users";
        public static  String AddUserButtonText="Add User";
        public static  String AddUserLabelText="Add User";
        public static  String NameLabelText="NAME";
        public static  String AddUserNamePlaceholder="Enter the user name";
        public static  String EmployeeIdLabelText="EMPLOYEE ID";
        public static  String EmployeeIdPlaceholder="Enter the employee Id";
        public static  String EmailLevelText="EMAIL";
        public static String EmailPlaceholder="Enter the user email";
        public static  String RoleLabelText="ROLE";
        public static  String SubmitsToLabelText="SUBMITS TO";
        public static  String SubmitsToPlaceholder="Select";
        public static  String DateOfJoiningLabelText="DATE OF JOINING";
        public static  String DesignationLabelText="DESIGNATION";
        public static  String NameRequireValidationText="Please enter user name";
        public static  String EmailRequireValidationText="Please enter your email";
        public static  String DesignationPlaceholder="Select";
        public static  String SaveButtonText="Save";
        public static  String CancelButtonText="Cancel";
        public static String UserCreatedSuccessMsgText="User invited successfully";
        public static String InvalidEmailValidationText="Please enter a valid email address";

    }
}
