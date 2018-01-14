package com.Pages;

import Utiles.Utils.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sudhakar on 15/10/2017.
 */
public class RegisterPage extends BasePages {
    @FindBy(css = "#firstname")WebElement F_name;
    @FindBy(css = "#lastname")WebElement L_name;
    @FindBy(css = "#email_address")WebElement Email_ad;

    @FindBy(css = "#password")WebElement Password;

    @FindBy(css = "#confirmation")WebElement P_Cofirm;
    @FindBy(css = ".x")WebElement popup;
    @FindBy(xpath = ".//*[@id='form-validate']/div[4]/button")WebElement Submit;

    @FindBy (css = ".page-title>h1") WebElement DashBoardWelcome;
    public void registrationdetails(){
        popup.click();
        F_name.sendKeys("ramu");
        L_name.sendKeys("india");
        Email_ad.sendKeys("ramu@hotmail.com");
        Password.sendKeys("London123");
        P_Cofirm.sendKeys("London123");

        Submit.click();
    }
    public String isinDshbordpage(){
        Utilities.waitForElementToBeClickable(DashBoardWelcome);
        System.out.println("printing --"+DashBoardWelcome);
        return DashBoardWelcome.getText();
    }

}
