package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By fieldFullName(){
        return By.xpath("//div[label[text() = 'Nama Lengkap']]/input");
    }

    private By fieldEmail(){
        return By.xpath("//div[label[text() = 'Email']]/input");
    }

    private By fieldPassword(){
        return By.xpath("//div[label[text() = 'Password']]//input");
    }

    private By registerBTN(){
        return By.xpath("//button/span[text() = 'Register']");
    }

    private By headerLogin(){
        return By.xpath("//div[@class='v-card__title']");
    }

    private By iconError(){
        return By.xpath("//div/i[contains(@class, 'v-alert__icon')]");
    }

    public void openUrl(){
        openAt("/auth/register");
    }

    public void inputFullName(String fullname){
        $(fieldFullName()).type(fullname);
    }

    public void inputEmail(String email){
        $(fieldEmail()).type(email);
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void clickRegisterBtn(){
        $(registerBTN()).click();
    }

    public void headerLoginDisplayed(){
        $(headerLogin()).isDisplayed();
    }

    public void errorIconDisplayed(){
        $(iconError()).isDisplayed();
    }

}
