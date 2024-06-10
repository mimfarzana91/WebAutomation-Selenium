package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.EditExpanse_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.NewExpanse_Impl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class EditExpanseTC extends BaseClass {

    LogIn_Impl login= new LogIn_Impl();
    EditExpanse_Impl editExpanse = new EditExpanse_Impl();
    NewExpanse_Impl newExpanse = new NewExpanse_Impl();

    @BeforeClass
    public void setupDriver(){

        setUp();
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {
        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");

    }

    @Test(priority = 2)
    public void navigateToNewExpanse() throws InterruptedException {
        newExpanse.navigateToNewExpanse(driver);
    }

    @Test(priority = 3)
    public void createdUnreportedExpanse() throws InterruptedException {
        editExpanse.createUnreportedExpanse(driver);
    }

    @Test(priority = 4)
    public void openUnreportedExpanse() throws InterruptedException {
        editExpanse.openEditUnreportedExpanse(driver);
    }

    @Test(priority = 5)
    public void editExpanse() throws InterruptedException {
        editExpanse.editExpanse(driver);
    }





}
