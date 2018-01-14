package com.Pages;

import Utiles.Utils.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sudhakar on 15/10/2017.
 */
public class HomePage extends BasePages {
    @FindBy(css = "a[title^='Log']")
    WebElement Login_bt;
    @FindBy(css = "button[title^='Create']")
    WebElement Create_an_account;
    @FindBy(xpath = "html/body/div[1]/div/div[1]/div[1]/div[1]/div/div/ul/li[2]/a")
    WebElement verifying_logo;
    @FindBy(css = "a[title^='Log']")WebElement Log_out;

    public String isInHome_page() {
        return driver.getCurrentUrl();
    }

    public void logininto() {
        Login_bt.click();
    }
    public void logout(){
        Log_out.click();
        driver.close();
    }

    public String isin_homepage() throws InterruptedException {
        Thread.sleep(200);
        Utilities.waitForElementToBeClickable(verifying_logo);
        System.out.println("printing --"+verifying_logo);

        return verifying_logo.getText();
    }
//    public String isinDshbordpage(){
//        Utilities.waitForElementToBeClickable(DashBoardWelcome);
//        System.out.println("printing --"+DashBoardWelcome);
//        return DashBoardWelcome.getText();

    public void newregister() {
        Create_an_account.click();
    }

}