package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class AddPage extends BasePageObject {

    private By buyBtn = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");

    private By cartIcon = By.xpath("//android.widget.Button[@content-desc=\"1\"]");

    public void clickBuyBtn(){
        click(buyBtn);
    }

    public void cartDispalyed(){
        isDisplayed(cartIcon);
    }
}
