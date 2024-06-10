package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class EditBasicInfoOR {

    public static class Locator{

        public static By EditButton = By.xpath("(//BUTTON[@type='button'])[3]");
        public static By EditFormTitle = By.xpath("//DIV[@class='ant-drawer-title'][text()='Edit User Info']");
        public static By EditFormCross = By.xpath("//span[@aria-label='close']//*[name()='svg']");
        public static By NameField = By.xpath("//label[normalize-space()='Name']");
        public static By Name = By.id("name");
        public static By NameError = By.xpath("//DIV[@role='alert'][text()='Please enter your name']");
        public static By NameErrorMaxChar = By.xpath("(//div[@role='alert'])[1]");
        public static By EmailField = By.xpath("//label[normalize-space()='Email Address']");
        public static By Email = By.id("username");
        public static By IDField = By.xpath("//label[normalize-space()='Employee ID']");
        public static By ID = By.id("employeeId");
        public static By MobileField = By.xpath("//label[normalize-space()='Mobile']");
        public static By Mobile = By.id("mobile");
        public static By DOJField = By.xpath("//label[normalize-space()='Date of Joining']");
        public static By DOJ = By.id("dateOfJoining");
        public static By DOBField = By.xpath("//label[normalize-space()='Date of Birth']");
        public static By DOB = By.id("dateOfBirth");
        public static By DatePicker = By.xpath("//div[@class='ant-picker-body']");
        public static By RoleField = By.xpath("//label[normalize-space()='Role Name']");
        public static By Role = By.id("role");
        public static By CancelButton = By.xpath("//span[normalize-space()='Cancel']");
        public static By SaveButton = By.xpath("//span[normalize-space()='Save']");
    }
    public static class UIElements{

        public static String EditFormTitle = "Edit User Info";
        public static String NameField = "NAME";
        public static String Name = "Test qa";
        public static String NameError = "Please enter your name";
        public static String NameErrorMaxChar = "Name can't be longer than 40 characters";
        public static String EmailField = "EMAIL ADDRESS";
        public static String Email = "mlbdqa@monstar-lab.com";
        public static String IDField = "EMPLOYEE ID";
        public static String ID = "EM-100";
        public static String MobileField = "MOBILE";
        public static String Mobile = "+8801912345169";
        public static String DOJField = "DATE OF JOINING";
        public static String DOJ = "2022-10-14";
        public static String DOBField = "DATE OF BIRTH";
        public static String DOB = "2022-10-01";
        public static String RoleField = "ROLE NAME";
        public static String Role = "Admin";
        public static String CancelButton = "Cancel";
        public static String SaveButton = "Save";

    }
}
