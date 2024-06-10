package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class GmailOR {
    public static class Locator {
        public static By EmailInput = By.xpath("//input[@id='identifierId']");
        public static By EmailNext = By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span");

        public static By PasswordInput = By.xpath("//input[@name='Passwd']");

        public static By PasswordNext = By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span");

       // public static By Gmail = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[6]/a/div[5]/span");

        public static By GmailInbox = By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[8]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]/div/div/div/span/span");

      //  public static By Reply = By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tr[1]/td[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/span[1]");

        public static By MsgExpand = By.className("ajT");

        public static By Sentlink = By.linkText("here");

        public static By InvalidMail = By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td/div[2]/div[2]/div/div[3]/div[13]/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/span/span");
    }

}



