package starter.Hello;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetHello {

    private String url;

    public void SetUrlGetHello(){
        url = "https://alta-shop.herokuapp.com/api/hello";
    }

    public void requestBodyHello(){
        given().when().get(url);
    }

    public void responsGetHello(){
        then().body("data", equalTo("hello"));
    }
}
