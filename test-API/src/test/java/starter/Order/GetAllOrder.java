package starter.Order;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetAllOrder {

    private String url, token;

    public void setUrlGetAllOrder(){
        url = "https://alta-shop.herokuapp.com/api/orders";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }

    public void requestGetAllOrder(){
        given().header("Authorization", token)
                .when().get(url);
    }
}
