package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class LandingPageOR {

    public static class Locator{
        //Side Menu
        public static By Logo = By.xpath("//DIV[@class='NavLeftContent_logoContainer__2LLSY NavLeftContent_isSidebar__2iRrP']");
        public static By SideMenuArrow = By.xpath("//*[@id=\"root\"]/section/aside/div/span[1]");

        //My View Menu
        public static By MyView = By.xpath("(//DIV[@class='ant-collapse-extra'])[1]");
        public static By Expenses = By.xpath("//A[@href='/expenses'][text()='Expenses']");
        public static By Reports = By.xpath("//A[@href='/reports'][text()='Reports']");
        public static By Approvals = By.xpath("//A[@href='/approvals/reports'][text()='Approvals']");
        public static By MySettings = By.xpath("//A[@href='/my-settings'][text()='My Settings']");

        //Admin View Menu
        public static By AdminView = By.xpath("(//DIV[@class='ant-collapse-extra'])[2]");
        public static By Users = By.xpath("//A[@href='/users'][text()='Users']");
        public static By ExpenseCategories = By.xpath("//A[@href='/expense-categories'][text()='Expense Categories']");
        public static By AdminReports = By.xpath("//A[@href='/admin-reports'][text()='Reports']");
        public static By Merchants = By.xpath("//A[@href='/merchants'][text()='Merchants']");

        //Top Bar
        public static By OrgName = By.xpath("//*[@id=\"root\"]/section/section/div/div/div[1]/div/div");
        public static By OrgDropdown = By.xpath("//span[@class='anticon anticon-down OrganizationList_down__2mCev']//*[name()='svg']");
        public static By MyOrg = By.xpath("//div[normalize-space()='My Organizations']");
        public static By ManageButton = By.xpath("//a[@class='OrganizationList_orgMenuHeaderOption__3wp_r']");
        public static By OrgSearch = By.xpath("//span[@class='ant-input-affix-wrapper']");
        public static By OrgList = By.xpath("//button[@class='ant-btn ant-btn-link ant-btn-block OrganizationList_menuBtn__3rRsS']");
        public static By LangDropdown = By.xpath("//*[@id=\"root\"]/section/section/div/div/div[3]/div/div/span[2]");
        public static By LangList = By.xpath("//DIV[@class='ant-select-item-option-content'][text()='AR']");
        public static By NotificationIcon = By.xpath("(//BUTTON[@type='button'])[2]");
        public static By NotificationText = By.xpath("//div[@class='ant-drawer-title']");
        public static By NotificationCross = By.xpath("//span[@aria-label='close']//*[name()='svg']");
        public static By UserName = By.xpath("//*[@id=\"root\"]/section/section/div/div/div[4]/a");
        public static By UserRole = By.cssSelector("#root > section > section > div > div > div.SidebarLayoutHeader_NameWrapper__2DGrS > span");
        public static By UserDP = By.xpath("//*[@id=\"root\"]/section/section/div/div/span/span");
        public static By LogoutButton = By.xpath("//button[@class='ant-btn ant-btn-link ant-btn-block']");
        public static By WelcomeText = By.xpath("//h4[normalize-space()='Welcome to MExpense!']");

        //Main Section
        public static By BasicInfo = By.xpath("//DIV[@class='ant-card-head-title'][text()='Basic Information']");
        public static By EditButton = By.xpath("(//BUTTON[@type='button'])[3]");
        public static By PersonalDetails = By.xpath("//DIV[@class='ant-descriptions-title'][text()='Personal Details']");
        public static By NameField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Name']");
        public static By Name = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div/span[2]");
        public static By EmailField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Email Address']");
        public static By Email = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/div/span[2]");
        public static By IDField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Employee ID']");
        public static By ID = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/div/span[2]");
        public static By MobileField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Mobile']");
        public static By Mobile = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/span[2]");
        public static By DOJField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Date of Joining']");
        public static By DOJ = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/span[2]");
        public static By DOBField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Date of Birth']");
        public static By DOB = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[2]/td[3]/div/span[2]");
        public static By RoleField = By.xpath("//SPAN[@class='ant-descriptions-item-label'][text()='Role Name']");
        public static By Role = By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div/div[2]/table/tbody/tr[3]/td/div/span[2]");

    }

    public static class UIElements{
        //Side Menu
        //My View Menu
        public static String Expenses = "Expenses";
        public static String Reports = "Reports";
        public static String Approvals = "Approvals";
        public static String MySettings = "My Settings";

        //Admin View Menu
        public static String Users = "Users";
        public static String ExpenseCategories = "Expense Categories";
        public static String AdminReports = "Reports";
        public static String Merchants = "Merchants";

        //Top Bar
        public static String OrgName = "QA ORG 1";
        public static String NotificationText = "Notifications";
        public static String UserName = "Test qa";
        public static String UserRole = "Admin";
        public static String TempUserDP = String.valueOf(UserName.charAt(0));
        public static String UserDP = TempUserDP.toUpperCase();

        //Main Section
        public static String BasicInfo = "Basic Information";
        public static String PersonalDetails = "Personal Details";
        public static String NameField = "Name";
        public static String Name = "Test qa";
        public static String EmailField = "Email Address";
        public static String Email = "mlbdqa@monstar-lab.com";
        public static String IDField = "Employee ID";
        public static String ID = "EM-100";
        public static String MobileField = "Mobile";
        public static String Mobile = "+8801912345169";
        public static String DOJField = "Date of Joining";
        public static String DOJ = "1 Oct, 2022";
        public static String DOBField = "Date of Birth";
        public static String DOB = "1 Oct, 2022";
        public static String RoleField = "Role Name";
        public static String Role = "Admin";

    }
}