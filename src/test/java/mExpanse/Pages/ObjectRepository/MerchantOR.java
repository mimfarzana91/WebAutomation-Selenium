package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class MerchantOR {
    public static class Locator{
        public static By sideNavMenuAdminView =By.xpath("//body/div[@id='root']/section[1]/aside[1]/div[1]/div[2]/div[2]/div[1]/div[2]");
        public static By sideNavSubMenuMerchant =By.xpath("//a[contains(text(),'Merchants')]");
        public static By addMerchantCTA =By.xpath("//span[contains(text(),'Add Merchant')]");
        public static By drawerTitleAddMerchant =By.xpath("//div[contains(text(),'Add Merchant')]");
        public static By modalCloserBTN =By.xpath("/html/body/div[3]/div/div[2]/div/div/div[1]/div/button");
        public static By fieldTitleMerchantName =By.xpath("//label[contains(text(),'Merchant Name')]");
        public static By merchantNameTextBox =By.xpath("//input[@id='name']");
        public static By fieldMerchantNameErrorAlert =By.xpath("//div[contains(text(),'Please enter the merchant name')]");
        public static By fieldSameMerchantNameErrorAlert =By.xpath("//span[contains(text(),'Merchant name already exists')]");
        public static By fieldTitleMerchantCode =By.xpath("//label[contains(text(),'Merchant Code')]");
        public static By MerchantCodeTextBox =By.xpath("//input[@id='code']");
        public static By fieldSameMerchantCodeErrorAlert =By.xpath("//span[contains(text(),'Merchant code already exists')]");
        public static By saveButtonMerchant =By.xpath("//span[contains(text(),'Save')]");
        public static By cancelButtonMerchant =By.xpath("//span[contains(text(),'Cancel')]");
        public static By creationNewMerchantAlert =By.xpath("//span[contains(text(),'New merchant category added successfully')]");



    }
    public static class UIElementConstant{


        public static  String drawerTitleAddMerchant="Add Merchant";
        public static  String fieldTitleMerchantName="MERCHANT NAME";
        public static  String fieldTitleMerchantCode="MERCHANT CODE";
        public static  String merchantNameTextBox="Enter the merchant name";
        public static  String MerchantCodeTextBox="Enter the merchant code";

        public static  String saveButtonMerchant="Save";
        public static  String cancelButtonMerchant="Cancel";
        public static  String creationNewMerchantAlert="New merchant category added successfully";
        public static  String fieldMerchantNameErrorAlert="Please enter the merchant name";
        public static  String fieldSameMerchantNameErrorAlert="Merchant name already exists";
        public static  String fieldSameMerchantCodeErrorAlert="Merchant code already exists";




    }
}