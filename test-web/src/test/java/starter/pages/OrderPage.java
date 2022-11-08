package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {

    private By buyBtn(){
        return By.xpath("(//button/span[text() = 'Beli'])[1]");
    }

    private By orderBtn(){
        return By.xpath("//span/i[contains(@class, 'fa-shopping')]");
    }

    private By addBtn(){
        return By.xpath("//button/span[text()='+']");
    }

    private By reduceBtn(){
        return By.xpath("//button/span[text()='-']");
    }

    private By bayarBtn(){
        return By.id("button-bayar");
    }

    private By transactionHeader(){
        return By.xpath("//h1[text()='Transactions']");
    }

    private By warningMessage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div[1]");
    }

    public void buyBtnClick(){
        $(buyBtn()).click();
    }
    public void orderBtnClick(){
        $(orderBtn()).click();
    }

    public void addBtnClick(){
        $(addBtn()).click();
    }

    public void reduceBtnClick(){
        $(reduceBtn()).click();
    }

    public void bayarBtnClick(){
        $(bayarBtn()).click();
    }

    public void bayarButtonDisplayed(){
        $(bayarBtn()).isDisplayed();
    }

    public void transactionHeaderDispayed(){
        $(transactionHeader()).isDisplayed();
    }

    public void warningMessageDisplayed(){
        $(warningMessage()).isDisplayed();
    }
}
