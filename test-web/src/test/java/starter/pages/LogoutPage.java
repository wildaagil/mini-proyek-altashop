package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By profileBtn(){
        return By.xpath("//span/i[contains(@class, 'fa-user')]");
    }

    private By logoutBtn(){
        return By.xpath("//div/i[contains(@class, 'sign-in')]");
    }

    private By loginPage(){
        return By.xpath("//div[@class='v-card__title']");
    }

    public void clickProfile(){
        $(profileBtn()).click();
    }

    public void clickLogout(){
        $(logoutBtn()).click();
    }

    public void loginPageDisplayed(){
        $(loginPage()).isDisplayed();
    }
}
