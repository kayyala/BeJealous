package com.Pages;

import Utiles.Utils.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sudhakar on 15/10/2017.
 */
public class BasePages extends BrowserFactory {
    public BasePages(){
        PageFactory.initElements(driver,this);
    }
}
