package starter.Authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class Login {

    private String url;

    private JSONObject body = new JSONObject();

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/auth/login";
    }

    public void setBody(String email, String password){
        body.put("email", email);
        body.put("password", password);
    }

    public void requestLogin(){
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void getToken(){
        given().header("data", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU");

    }
}
