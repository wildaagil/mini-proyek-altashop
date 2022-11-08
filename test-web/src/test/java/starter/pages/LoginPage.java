package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By siginButton(){
        return By.xpath("//button//i[contains(@class, 'sign-in')]");
    }

    private By fieldEmail(){
        return By.xpath("//div[label[text() = 'Email']]/input");
    }

    private By fieldPassword(){
        return By.xpath("//div[label[text() = 'Password']]//input");
    }

    private By loginButton(){
        return By.xpath("//button/span[text() = 'Login']");
    }

    private By headerProduct(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");
    }

    private By errorMessage(){
        return By.xpath("//div[@class= 'v-alert__content']");
    }

    public void headerDisplayed(){
        $(headerProduct()).isDisplayed();
    }

    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();
    }

    public void openUrl(){
        openAt("/");
    }

    public void clickSiginBtn(){
        $(siginButton()).click();
    }

    public void inputEmail(String email){
        $(fieldEmail()).type(email);
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void clickLoginBtn(){
        $(loginButton()).click();
    }
}
