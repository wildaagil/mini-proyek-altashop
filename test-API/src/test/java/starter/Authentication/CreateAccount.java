package starter.Authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class CreateAccount {

    private String url;

    private JSONObject body = new JSONObject();

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/auth/register";
    }

    public void setBodyEmail(String email){
        body.put("email", email);
    }

    public void setBodyPassword(String password){
        body.put("password", password);
    }

    public void setBodyFullname(String fullname){
        body.put("fullname", fullname);
    }

    public void requestAccount(){
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void statusCode400(){
        then().statusCode(400);
    }
}
