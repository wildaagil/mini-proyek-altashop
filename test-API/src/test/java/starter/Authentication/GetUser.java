package starter.Authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetUser {

    private String url, token;

    public void setUrlGetUser(){
        url = "https://alta-shop.herokuapp.com/api/auth/info";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }

    public void requestGetUser(){
        given().header("Authorization", token)
                .when().get(url);
    }

    public void getUserInformation(){
        then().body("data.Email", equalTo("someone@mail.com"));
    }
}
